package ch14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//read(byte[] b) : 입력스트림으로부터 매개값으로 제시한 byte배열의 길이만큼
//	바이트를 읽고 배열에 저장한다
//
public class ReadEx02 {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:\\Temp\\test.txt");
		byte[] readBytes = new byte[3];
		int readByteNum;	//읽어들인 바이트배열을 저장할 변수
		String str = "";	//콘솔에 출력할 떄 사용할 변수
		while (true) {
			readByteNum = is.read(readBytes);	//매개값으로 제시한 byte배열의 길이 3만큼 바이트를 읽고
			if(readByteNum==-1)break;
			//String(byte[] bytes, 
			//int offset 바이트 배열에서 읽어들일 시작 인덱스 번호, 
			//int length 글자수)
			str += new String(readBytes, 0 ,readByteNum);//문자열
			
		}
		System.out.println(str);	//콘솔출력
		is.close();	//자원을 반납
		
	}

}
