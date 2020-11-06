package ch14;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//Reader와 Writer
//Reader의 read()연습
public class ReaderEx02 {

	public static void main(String[] args) throws IOException {
		Reader rd = new FileReader("C:\\Temp\\test.txt");
		char[] cbuf  = new char[2];
		int readCharNum;
		String str = "";
		while (true) {
			readCharNum = rd.read(cbuf);
			if(readCharNum==-1) break;
			str+= new String(cbuf, 0, readCharNum);
			System.out.println(str);
			
		}
		
	}

}
