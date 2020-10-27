package ch07;
	
public class CastingEx01 {

	public static void main(String[] args) {
		//자식타입->부모타입->자식타입
		//부모클래스 참조변수 = new 자식클래스(); 1)자식->부모:자동형변환
		Parent02 parent = new Child02();
		parent.field1 = "parent field";
		parent.m1();
		parent.m2();
		//parent.m3(); 자식만의 메소드 호출 불가
		
		
		//자식클래스 참조변수 = (자식클래스)부모클래스변수
		Child02 child = (Child02)parent; //2)부모->자식
		child.field2 = "child field";
		child.m3();

	}

}

class Parent02{
	public String field1;
	public void m1() {System.out.println("Parent02의 m1()");}
	public void m2() {System.out.println("Parent02의 m2()");}
}

class Child02 extends Parent02{
	public String field2;
	public void m3() {System.out.println("Child02의 m3()");}
}
