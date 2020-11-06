package ch14;

import java.io.IOException;
import java.io.InputStream;

//System.in,
//	-콘솔(console, 화면)을 통한 데이터의 입출력을 '표준 입출력'이라 한다
///
public class SystemEx01 {

	public static void main(String[] args) throws IOException {
		//System 클래스의 in 필드는 static InputStream으로 선언되어있다
		//public static final InputStream in
		InputStream is = System.in;
		
		byte[] datas = new byte[100];
		System.out.print("이름: ");	//실제로 읽은 바이트 수 저장
		int nameBytes =is.read(datas);
		String name = new String(datas, 0, nameBytes-2);
		//-2를 한 이유는 캐리지턴(13),라인피드(10)을 문자열에서 제외
		System.out.println("nameBytes"+nameBytes);
		for (int i = 0; i < nameBytes; i++) {
			
			System.out.println(datas[i]);
		}
		
		System.out.println("입력한 이름은: "+name);
		
	}

}
