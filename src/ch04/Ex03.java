package ch04;

//switch 문 : ==비교연산자만 사용. 그외 다른 비교연산자는 사용X (예 : < <= >= !=...)
//주사위를 던져서 나온 수를 출력하세요 예)1번이 나왔어요
public class Ex03 {

	public static void main(String[] args) {
		//Math.random()*(큰수-작은수+1)+작은수
		//참고
		//method명(데이터타입 변수) : 메소드안의 매게변수, argument, parameter, 인수, 인자
		//매개변수안의 데이터형에 따라 정수, 실수, boolean, char => 기본형타입 매개변수
		//                 String과 같은 객체                         => 참조타입 매개변수
		int num = (int)(Math.random()*(6-1+1)+1);
		
		switch (num) {
		case 1 : 
			System.out.println("1번이 나왔어요");
			break;
		case 2 : 
			System.out.println("2번이 나왔어요");
			break;
		case 3 : 
			System.out.println("3번이 나왔어요");
			break;
		case 4 : 
			System.out.println("4번이 나왔어요");
			break;
		case 5 : 
			System.out.println("5번이 나왔어요");
			break;
		case 6 : 
			System.out.println("6번이 나왔어요");
			break;
		
		}

	}
	/* 내가 해본거
	public static void main(String[] args) {
		int num = (int)(Math.random()*(6-1+1)+1);
		int ans = 0;
		switch (num) {
		case 1 : 
			ans = 1;
			break;
		case 2 : 
			ans = 2;
			break;
		case 3 : 
			ans = 3;
			break;
		case 4 : 
			ans = 4;
			break;
		case 5 : 
			ans = 5;
			break;
		case 6 : 
			ans = 6;
			break;
		}
		String final1 = Integer.toString(ans);
		System.out.println(final1+"번입니다");

		}
		*/
}

