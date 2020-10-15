package ch06;

public class Calculator01_ex01 {

	public static void main(String[] args) {
		//Calculator01 클래스의 객체생성 및 변수에 할당
		Calculator01 c1 = new Calculator01();
		
		c1.powerOn(); //계산기 전원 켜기
		
		//Calculator01 클래스의 divide()호출하여
		//메소드의 리턴값을 받아  출력
		System.out.println(c1.plus(5.5, 3));
		System.out.println(c1.minus(5, 3));
		System.out.println(c1.multiply(5, 3));
		System.out.println(c1.divide(5, 3));
		System.out.println(c1.divide(5.0, 3));
		
		c1.powerOff(); //계산기 전원 끄기

		System.out.println("=================");
		
		c1.a();
	}
}

