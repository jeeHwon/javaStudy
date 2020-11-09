package ch14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

//OutputStreamWriter : 바이트 출력스트림을 문자 출력스트림으루 변환
public class OutputStreamWriterEx01 {

	public static void main(String[] args) throws IOException {
		//public class FileOutputStream extends OutputStream
		//OutputStreamWriter(OutputStream out)
		//FileOutputStream(String name
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\fosfile.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		writer.write("바이트 출력스트림을 문자 출력스트림으로 변환");
		
		writer.flush();
		writer.close();
		
		System.out.println("done!");
	}

}
