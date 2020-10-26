package ch11;

public class Child01_ex01 {

	public static void main(String[] args) {
		Child01 child = new Child01();
		
		//자동타입 변환
		Parent01 parent1 = new Child01(); 
		parent1.m1();
		parent1.m2(); //Child 에서 오버라이딩한 m2
		//parent.m3();자식클래스만이 가지고 있는 멤버 부모클래스가 사용불가
		child.m1();
		child.m2(); 
		child.m3();
		System.out.println("--------------------");
		Parent01 parent2 = new GrandChild01();
		parent2.m1();
		parent2.m2(); //GrandChild 에서 오버라이딩한 m2
		
		GrandChild01 grandChild = new GrandChild01();
		parent1 = grandChild; //계층추적.자바는 단일상속만 허용하므로 계층추적이 가능하다
	
		
	}

}
