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

//hadoop jar c:\hdPJ\dcc.jar hadoop.second.DayCancelledCount /data/flight/2007.csv /resultDayCancelledCount
public class DayCancelledCount {
	public static void main(String[] args) throws Exception{
		if(args.length != 2) {
			System.out.println("check! DayCancelledCount inputPath outputPath");
			System.exit(2);
		}
		Configuration conf = new Configuration();
		Job job = new Job(conf, "DayCancelledCount");
		
		job.setJarByClass(DayCancelledCount.class);
		job.setMapperClass(DayCancelledMapper.class);
		job.setReducerClass(DayCancelledReducer.class);
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));
		
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		job.waitForCompletion(true);
	}
}
