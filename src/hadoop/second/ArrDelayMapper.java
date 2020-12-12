package hadoop.second;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

//hadoop.second.ArrDelay /data/flight/2007.csv /result2007
public class ArrDelayMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	
	private final static IntWritable ONE = new IntWritable(1);
	private Text ym = new Text();
	public void map(LongWritable k1, Text line, Context context) throws IOException, InterruptedException {
		Airline air = new Airline(line);
		ym.set(air.getYear()+","+air.getMonth()+",");
		if (air.getArrivalDelay()>0) {
			context.write(ym, ONE);
		}
	}
}
