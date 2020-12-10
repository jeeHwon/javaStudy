package hadoop.second;

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

//압축파일(jar)명 : 
//hadoop.second.DepDelay /data/flight/2007.csv /result2007
//hadoop jar C:\hdPJ\dd.jar hadoop.second.DepDelay /data/flight/2007.csv /result2007
public class DepDelay {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
		if(args.length != 2) {
			System.out.println("check! DepDelay inputPath outputPath");
			System.exit(2);
		}
		Configuration conf = new Configuration();
		Job job = new Job(conf, "DepDelay");
		
		job.setJarByClass(DepDelay.class);
		job.setMapperClass(DepDelayMapper.class);
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
