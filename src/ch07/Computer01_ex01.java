package ch07;

import javax.sound.midi.Soundbank;

public class Computer01_ex01 {
	public static void main(String[] args) {
		double r = 10.0;
		Calculator01 cal = new Calculator01();
		System.out.println("원면적 : "+cal.areaCircle(r));
		//부모클래스인 Calculator01에서 정의한 메소드 호출
		
		Computer01 com = new Computer01();
		System.out.println("원면적 : "+com.areaCircle(r));
		//자식클래스인 Computer01에서 재정의한 메소드 호출
		
		System.out.println("---------------------");
		//다형성
		//원 is a 도형
		//삼각형 is a 도형
		//조상타입의 참조변수로 자손타입의 인스턴스를 참조
		//부모클래스 참조변수 = new 자식클래스();
		Calculator01 obj = new Computer01();
		
		
		System.out.println("원면적 : "+obj.areaCircle(r));
		
		
		
	}
}
