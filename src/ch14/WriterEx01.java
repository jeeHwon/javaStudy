package ch14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//Writer의 write(char[] cbuf)연습
public class WriterEx01 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:\\Temp\\result.txt");
		char[] data = "나랏말싸미 듕궉에달아 문쟈와료서루 사맣디 아니할세".toCharArray();
		//writer.write(data);
		
		for (int i = 0; i < data.length; i++) {
			writer.write(data[i]);
		}
		writer.flush();
		writer.close();
		
		
		
	}	

}
