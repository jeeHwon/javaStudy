package hadoop.second;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

//hadoop jar c:\hdPJ\ad.jar hadoop.second.ArrDelay /data/flight/ /result/arr
public class DayDelay {

	public static void main(String[] args) throws Exception{
		if(args.length != 2) {
			System.out.println("check! DayDelay inputPath outputPath");
			System.exit(2);
		}
		Configuration conf = new Configuration();
		Job job = new Job(conf, "DayDelay");
		
		job.setJarByClass(DayDelay.class);
		job.setMapperClass(DayDelayMapper.class);
		job.setReducerClass(DelayReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		job.waitForCompletion(true);
	}
}
