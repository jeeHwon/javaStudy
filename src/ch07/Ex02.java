package ch07;

public class Ex02 {
	public static void main(String[] args) {
		Father02 f1 = new Father02();
		f1.abc();
		Son02 s1 = new Son02();
		s1.qqq(); //Son02의 qqq()
		s1.abc(); //Father02의 abc()
		//상속받은 Father02 클래스의 메소드 abc()를 호출할수 있다
		//Son022 s2 = new Son022();
		//s2.aaa(); final 클래스 상속 못받아
	}
}

//상속 문법 : [접근제어자][속성] class 클래스명 [extends 부모클래스명]
class Father02{
	int a = 10;
	void abc() {
		System.out.println("Father02 abc()");
	}
}
class Son02 extends Father02{
	void qqq() {
		abc();
	}
}

final class Father022{
	void aaa() {
		System.out.println("Father022 abc()");
	}
}

//class Son022 extends Father022 { final 클래스 상속 못받아
//	
//	
//}









