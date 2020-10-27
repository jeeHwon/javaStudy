package ch07;

public class Instanceof_ex01 {

	public static void main(String[] args) {
		Parent03 parent1 = new Parent03();
		//m1(parent1);
		m2(parent1);
		
		Parent03 parent2 = new Child03();
		parent2 = (Child03)parent2;
		parent2 = (Parent03)parent2;
		m2(parent2);
	}
	static void m1(Parent03 p) {
		Child03 child = (Child03)p;
		//캐스팅 에러 발생 왜? 강제형변환하려면 자식 한번 갔다온 부모여야함
		
		System.out.println("m1() : Child03으로 강제형변환 성공");
	}
	static void m2(Parent03 p) {
		if (p instanceof Child03) {
			Child03 child = (Child03)p;
			System.out.println("m2() : Child03으로 강제형변환 성공");
		} else {
			System.out.println("m2() : Child03으로 강제형변환 X");
		}
	}
}

class Parent03{}
class Child03 extends Parent03{}
