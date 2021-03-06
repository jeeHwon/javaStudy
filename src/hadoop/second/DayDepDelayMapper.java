package hadoop.second;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class DayDepDelayMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	
	private final static IntWritable ONE = new IntWritable(1);
	private Text dayOfWeek = new Text();
	public void map(LongWritable k1, Text line, Context context) throws IOException, InterruptedException {
		Airline air = new Airline(line);
		dayOfWeek.set(air.getDayOfWeek());
		if (air.getDepartureDelay()>0) {
			context.write(dayOfWeek, ONE);
		}
	}
}
