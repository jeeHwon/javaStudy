package ch02;

//변수 선언과 초기화
//변수란? 어떤 데이터가 저장되는 메모리상의 이름

public class Ex01 {

	public static void main(String[] args) {

		// 커서 있는 라인 삭제 ctrl + D
		// 변수선언 => 데이터타입 변수명;
		int value;
		// 변수에 초기값 할당 => 변수명 = 값;
		value = 10;
		// 한번에 하는법 (정수 11을 변수 value2의 초기값으로 저장)
		int value2 = 11;
		//value 변수 값을 읽고 연산을한다
		//연산의 결과를 변수 total에 할당
		int total = value + value2;
		
		System.out.println(value);
		System.out.println(value2);
		System.out.println(total); // total 변수값을 출력
	
	}

}