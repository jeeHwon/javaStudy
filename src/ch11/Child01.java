package ch11;

public class Child01 extends Parent01 {
	//m1() 상속받은 상태
	//m2() 상속받은 상태
	
	@Override
	public void m2() {
		System.out.println("자식클래스 Child01의 오버라이딩된 m2()");
	}
	
	public void m3() {
		System.out.println("자식클래스 Child01의 m3()");
	}
	
}
