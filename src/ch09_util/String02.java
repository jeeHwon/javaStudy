package ch09_util;

import java.io.UnsupportedEncodingException;

//getBytes() : String을 byte배열로 변환
//예) 네트워크로 문자열을 전송하거나, 문자열을 암호화할 때 문자열을 바이트
//배열로 변환한다
//=>getBytes() :  byte[] bytes = "문자열".getBytes();
//=>getBytes(Charset cs) byte[] bytes = "문자열".getBytes();

//어떤 charset으로 인코딩 하느냐에 따라서 바이트 배열의 크기가 달라지낟
//EUC-KR은 알파벳은 1byte, 한글은 2byte로 변환
//UTF-8은 알파벳은 1byte, 한글은 3byte로 변환
public class String02 {

	public static void main(String[] args) {
		String str = "마리아샤라포바";
		byte[] bytes1 = str.getBytes();
		for (int i = 0; i < bytes1.length; i++) {
			System.out.println(bytes1[i]);
		}
		String str1 = new String(bytes1);
		
		System.out.println("bytes1.length:"+bytes1.length);
		System.out.println("str1="+str1); //샤라포바
		System.out.println("=====================");
		
		try {
			//EUC-KR 이용해서 인코딩
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length:"+bytes2.length);
			String str2 = new String(bytes2);
			System.out.println("str2="+str2); //글자 깨져서 나와
			
			//EUC-KR 이용해서 디코딩
			str2 = new String(bytes2, "EUC-KR");
			System.out.println("str2="+str2); 
			System.out.println("=====================");
			
			//UTF-8을 이용해서 인코딩
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length:"+bytes3.length);
			
			//UTF-8을 이용해서 디코딩
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("str3="+str3); 
			System.out.println("=====================");
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
