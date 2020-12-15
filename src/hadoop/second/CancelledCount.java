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

//hadoop jar c:\hdPJ\cc.jar hadoop.second.CancelledCount /data/flight/2007.csv /resultCancelled
public class CancelledCount {
	
		public static void main(String[] args) throws Exception{
			if(args.length != 2) {
				System.out.println("check! CencelledCount inputPath outputPath");
				System.exit(2);
			}
			Configuration conf = new Configuration();
			Job job = new Job(conf, "CancelledCount");
			
			job.setJarByClass(CancelledCount.class);
			job.setMapperClass(CancelledMapper.class);
			job.setReducerClass(CancelledReducer.class);
			job.setOutputKeyClass(Text.class);
			job.setOutputValueClass(IntWritable.class);
			
			FileInputFormat.addInputPath(job, new Path(args[0]));
			FileOutputFormat.setOutputPath(job, new Path(args[1]));
			
			job.setInputFormatClass(TextInputFormat.class);
			job.setOutputFormatClass(TextOutputFormat.class);
			
			job.waitForCompletion(true);
		}
}
