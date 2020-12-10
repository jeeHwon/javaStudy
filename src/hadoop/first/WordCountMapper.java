package hadoop.first;

import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;
import java.util.StringTokenizer;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;

//network 통신을 위한 최적화된 객체형으로 데이터 사용
//Integer => IntWitable
//Long    => LongWritable
//String  => Text
public class WordCountMapper 
	extends Mapper<LongWritable, Text, Text, IntWritable>{
				 //입력키 타입, 입력값 타입, 출력키 타입, 출력값 타입
	private final static IntWritable ONE = new IntWritable(1);
	private Text word = new Text();
	
	//Context 객체-맵 리듀스 시스템과 통신하면서 출력데이터 기록 또는 상태값을 저장
	public void map(LongWritable key, Text value, Context context) 
		throws IOException, InterruptedException {
		
		StringTokenizer st = new StringTokenizer(value.toString());	//공백단위 배열저장
		while(st.hasMoreTokens()) {
			word.set(st.nextToken());
			context.write(word, ONE);
		}
	}
	
	
}
