package ch02;

//char 타입변수
//자바는 모든 문자를 Unicode로 처리
//Unicode는 세계 각국의 문자들을 코드값으로 매핑한 국제표준규약이다
//Unicode는 16진수로 저장할 경우 '\\u+16진수 값'

public class Ex04 {

	public static void main(String[] args) {
		char c1 = 'A'; //문자로 저장
		char c2 = 65; //10진수로 저장
		char c3 = '\u0041'; //16진수로 저장
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
	}

}
