package hadoop.first;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WordCountReducer 
	extends Reducer<Text, IntWritable, Text, IntWritable>{
				  //입력키 타입, 입력값 타입, 출력키 타입, 출력값 타입
	
	private IntWritable result  = new IntWritable();
	
	public void reduce(Text key, Iterable<IntWritable> values, Context context) 
			throws IOException, InterruptedException{
		
		int hap = 0;
		for (IntWritable val : values) {
			hap += val.get();
		} 
		result.set(hap);
		context.write(key, result);
		
		
	}
	
}
