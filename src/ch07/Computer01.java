package ch07;
//Calculator를 상속받는 패키지
//is a 관계 => 상속
//Computer is a Calculator
public class Computer01 extends Calculator01{
	//이미 부모클래스의 필드와 메소드를 상속받은 상태
	int com = 20;
	
	//상속받은 메소드를 재정의
	//@ : Annotation
	//공지의미 + 조건 충족하는지 검사하는 기능
	//@Override
	double areaCircle(double r) {
		System.out.println("Computer01");
		return 3.14*r*r;
	}

	
	
	
	
	
	
}
