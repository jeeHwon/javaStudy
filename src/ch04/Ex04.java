package ch04;

//switch문 
//switch문은 숫자(byte, short, int, long), char타입, 
//String타입  사용가능(자바7부터)
//숙제 : 문제 만들기

public class Ex04 {

	public static void main(String[] args) {
		char grade = 'A'; //대소문자를 가린다
		switch (grade) {
		case 'A' : 
		case 'B' : System.out.println("우수회원");
			break; //switch문을 벗어나라!!(원래는 for문과 while문에서만 사용가능)
		case 'C' : 
		case 'D' : System.out.println("일반회원");
			break;
		default: System.out.println("손님");
		}
	}
}