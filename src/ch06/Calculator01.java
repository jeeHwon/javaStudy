package ch06;

//계산기 클래스
public class Calculator01 {
	//field
	//constructor
	//method
	//[접근제어자] [속성] 리턴유형 메소드명(매개변수리스트){}
	void a() {
		System.out.println("a()");
		b(); //
	}
	
	void b() {
		System.out.println("b()");//함수내에서 또 다른 함수 호출가능
	}
	
	//리턴값이 있는 메소드 더하기
	int plus(int x , int y) {
		int result = 0;
		result = x + y;
		return result; 
		//return은 구현결과값을 함수를 호출한 자리에 되돌려준다
		//return 자체가 해당 함수를 종료한다는 의미
	}
	
	//전원 on
	void powerOn() {
		System.out.println("power on..");
	}
	
	//전원 off
	void powerOff() {
		System.out.println("power off..");
	}	
	
	//더하기
	double plus(double x , double y) {
		return x + y;
	}
	
	//빼기
	int minus(int x , int y) {
		return x - y;
	}
	
	//곱하기
	int multiply(int x , int y) {
		return x * y;
	}
	
	//나누기 divide 정수 2개를 받아서 첫번째 파라미터 값을 2번째 파라미터로 나눈 몫 리턴
	int divide(int x, int y) {
		return  x/y;
	}
	
	//method overloading
	//원칙적으로 동일 클래스 내 메소드명이 동일 할 수 없다
	//하지만 매개변수의 타입, 개수, 순서가 다르면 선언가능하다
	double divide(double x, double y) {
		return x/y;
	}
}

