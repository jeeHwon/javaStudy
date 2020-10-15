package ch06;

public class Computer01 {

	//field : 
	int a = 0;
	int b = 2;
	String s = "데헷";
	
	//constructor : 
	
	//method : [접근제어자] [속성] 리턴유형 메서드명 () {}
	int sum(int[] values) { //1,2,3
		int result = 0;
		for (int i = 0; i < values.length; i++) {
			result += values[i];
		}
		return result; //결과를 저장하는 변수선언
	}
	
	//다른방식의 메서드 선언
	//[접근제어자] [속성] 리턴유형 메서드명 (타입 ... 매개변수명) {}
	int sum1(int...values) {
		int result = 0;
		for (int i = 0; i < values.length; i++) {
			result += values[i];
		}
		return result;
	}
}
