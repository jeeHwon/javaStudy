package ch14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//is.read();//1byte씩 읽어들인다
public class ReadEx01 {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			//FileInputStream fis = new FileInputStream("C:\\Temp\\test.txt");
			is = new FileInputStream("C:\\Temp\\test.txt");
			int readByte;
			while(true) {
				readByte= is.read();//1byte씩 읽어들인다
				if(readByte==-1) break;//더 이상 읽어들일 것이 없으면 -1을 리턴
				System.out.println((char)readByte);//내부적으로  아스키코드값으로 저장되므로
				//콘솔에서 편하게 읽고 싶으면 char로 변환해주면 된다
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
