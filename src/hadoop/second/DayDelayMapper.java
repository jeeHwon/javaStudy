package hadoop.second;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

//hadoop.second.DepDelay /data/flight/2007.csv /result2007
public class DayDelayMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	
	private final static IntWritable ONE = new IntWritable(1);
	private Text ym = new Text();
	public void map(LongWritable k1, Text line, Context context) throws IOException, InterruptedException {
		Airline air = new Airline(line);
		String day_string = "";
		switch (air.getDay()) {
		case 1: day_string = "monday"; break;
		case 2: day_string = "tuesday"; break;
		case 3: day_string = "wednesday"; break;
		case 4: day_string = "thursday"; break;
		case 5: day_string = "friday"; break;
		case 6: day_string = "saturday"; break;
		case 7: day_string = "sunday"; break;
		}
		
		ym.set(day_string);
		if (air.getDepartureDelay()>0) {
			context.write(ym, ONE);
		}
	}
}
