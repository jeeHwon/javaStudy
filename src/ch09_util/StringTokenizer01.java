package ch09_util;

import java.util.StringTokenizer;

//StringTokenizer 클래스
//문자열이 특정 구분자로 연결되어 잇을 경우 구분자를 기준으로 문자열을 분리할 때 사용
//비교 ) java.lang.String클래스의 split()도 동일기능이지만 리턴유형은 String[]
public class StringTokenizer01 {
	public static void main(String[] args) {
		String text0 = "디카프리오 행크스 크로우";
		//구분자를 제시하지 않으면 공백을 구분자로 사용
		StringTokenizer st = new StringTokenizer(text0);
		
		
		String text = "디,카,프,리,오/행크스/크로우";
		//방법1 : for문 이용
		st = new StringTokenizer(text,"/");
		int count = st.countTokens();
		System.out.println("st.countTokens()= "+st.countTokens());
		for (int i = 0; i < count; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("-------------------");
		
		
		//방법2 : while문 + hasMoreTokens()이용
		st = new StringTokenizer(text,"/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("-------------------");
		
		
		//방법3 : while문 + hasMoreElements()이용
		//여러개의 구분자를 사용할 수 있다
		st = new StringTokenizer(text,"/,");
		while (st.hasMoreElements()) {
			//nextElement()의 리턴유형이 Object이므로 String으로 강제클래스형변환
			String obj = (String)st.nextElement();
			System.out.println(obj);
		}
		
		

	}

}
