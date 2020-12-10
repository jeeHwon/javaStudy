package hadoop.first;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

// mapper와 reducer를 실행하는 드라이버 클래스
// 1. job 객체 생성
// 2. job 객체에 map, reducer의 실행정보 저장
// 3. job 실행

public class WordCount {
	//java hadoop.first.WordCount /data/word/one.txt /result1
	//hadoop jar c:\hdPJ\wc.jar hadoop.first.WordCount /data/word/one.txt /result1
	//hadoop fs -lsr /
	//hadoop fs -cat /result1/part-r-00000
	//hadoop fs -get /result1/part-r-00000 c:\hdPJ\wc.txt
	
	//--과제
	//	/data/dream/dream.txt 파일을 워드카운트 프로그램 통해 실행하여 c:\hdPJ\JiSeungwon.txt.
	//	로 다운, 1) 실행명령어 모두 제출 2) 영문이름.txt 파일 제출
	public static void main(String[] args) 
			throws IllegalArgumentException, IOException, ClassNotFoundException, InterruptedException {
		if(args.length != 2) {	//명령어 잘못 입력시 에러처리
			System.out.println("inputErr : WordCount inputPath outPath");
			System.exit(2);
		}
		
		// 1. job 객체 생성
		Configuration conf = new Configuration();
		Job job = new Job(conf, "WordCount");
		
		// 2. job 객체에 map, reducer의 실행정보 저장.
		job.setJarByClass(WordCount.class);
		job.setMapperClass(WordCountMapper.class);
		job.setReducerClass(WordCountReducer.class);
		
		//입출력 경로 설정
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		//입력데이터와 출력데이터 포맷 -> text
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		//mapper와 reducer의 출력데이터와 값의 타입설정
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		// 3. job 실행
		job.waitForCompletion(true);
		
	}
}

















