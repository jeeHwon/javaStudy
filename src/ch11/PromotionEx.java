package ch11;

//다형성
//자동타입변환(Promotion) : 자손타입->조상타입(Up-casting) 형변환 생략가능
//실행메소드

//	A
//B	  C
//D   E
class A {}

class B extends A{} //조상타입B->조상타입A
class D extends B{} //자손타입D-조상타입B->조상타입A

class C extends A{} //조상타입C->조상타입A
class E extends C{} //자손타입E->조상타입C->조상타입A



public class PromotionEx {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//부모타입으로 자동타입변환 되었다
		//자동타입변환 된 이후에는 부모클래스에 선언된 필드, 메소드만 접근가능
		//변수가 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스 멤버로 한정된다
		//예외적으로 자식클래스에서 메소드가 오버라딩되었다면 
		//자식 클래스의 메소드가 부모클래스에서 선언된 매소드 대신에 호출된다
		//=> Child01, Parent01 참고
		A a1 = b; //b객체는 A부모타입으로 자동타입변환
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d; 
		C c1 = e; 
		//B b2 = e; //컴파일 에러 : 상속관계가 아님
		//C c2 = d; //
	
		System.out.println("\\");
		
		
	}

}
