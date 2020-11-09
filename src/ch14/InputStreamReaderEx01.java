package ch14;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//문자변환 보조스트림
//An InputStreamReader is a bridge from byte streams to character stream
public class InputStreamReaderEx01 {

	public static void main(String[] args) throws IOException {
		//public static final InputStream in
		//System 클래스의 field 중 하나인 in은 InputStream 데이터타입이므로
		InputStream is = System.in;	//여기에 넣어 줄 수 있다
		//InputStreamReader(InputStream in)
		Reader reader = new InputStreamReader(is);	//문자변환보조스트림
		char[] cbuf = new char[100];
		int readCharNum;
		while ((readCharNum = reader.read(cbuf))!=-1) {	//전부 읽는 동안
			String data = new String(cbuf, 0, readCharNum);	//문자열로 변환
			System.out.println(data);	//콘솔에 출력
			//가각간갇갈감갑갓강갖갗갘같갚갛
//			for (int i = 0; i < cbuf.length; i++) {
//				System.out.println((int)cbuf[i]);
//			}
		}
		reader.close();	//자원해제
	}

}
