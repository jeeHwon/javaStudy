package ch11;

public class Array01 {
	public static void main(String[] args) {
		//문자열 5개 저장하는 배열생성
		String[] str = new String[5];
		
		//문자열 데이터를 추가
		str[0] = "홍길동";
		str[1] = "이길동";
		str[2] = "김길동";
		str[3] = "지길동";
		str[4] = "유길동";
		
		//데이터의 갯수 조회
		System.out.println(str.length);
		
		//데이터 꺼내기
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
	}
}
