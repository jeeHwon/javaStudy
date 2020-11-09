package ch14;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//FileInputStream
//파일을 읽고 그 내용을 콘솔에 출력
public class FileInputStreamEx01 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = 
					//new FileInputStream("D:\\java\\javastudy\\src\\ch02\\Ex01.java");
					//new FileInputStream("C:\\Temp\\test_eng.txt");
					new FileInputStream("C:\\Temp\\test_kor.txt");
			InputStreamReader isr= new InputStreamReader(fis,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			int data;
			while ((data = br.read())!=-1) {
				//System.out.println(data);
				System.out.print((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
