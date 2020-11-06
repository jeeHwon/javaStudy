package ch14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx02 {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:\\Temp\\result.txt");
		
		
		byte[] data = "Natalie Portman".getBytes();
		os.write(data, 12, 3);	//man만 덮어쓴다(기존꺼 삭제)
		os.flush();
		os.close();
	}

}
