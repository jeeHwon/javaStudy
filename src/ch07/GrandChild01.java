package ch07;

//Child01을 상속받는 클래스
public class GrandChild01 extends Child01{
	//m1()
	//m2()
	//m3()
	
	//m2 오버라이딩
	@Override
	public void m2() {
		System.out.println("손자클래스 GrandChild01의 오버라이딩된 m2()");
	}
}
