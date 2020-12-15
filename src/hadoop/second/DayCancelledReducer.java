package hadoop.second;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class DayCancelledReducer extends Reducer<Text, IntWritable, Text, IntWritable>{
		//2007-1 <1,1,1,1,.>
	private IntWritable result = new IntWritable();
	public void reduce(Text ym, Iterable<IntWritable> values, Context context) throws IOException,InterruptedException {
	int hap = 0;
	for (IntWritable val: values) {
	hap += val.get();
	}
	result.set(hap);
	context.write(ym, result);
	
	}

}