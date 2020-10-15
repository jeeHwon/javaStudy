package ch06;

//정적메서드와 블록
public class Car06 {
	//field : [접근제어자] [속성] 데이터타입 변수명 = 초기값;
	int speed; //전역변수, 인스턴스변수
	static String company = "porsche";
	
	//constructor : [접근제어자] [속성] 클래스명(){}
	
	//method : [접근제어자] [속성] 리턴유형 메소드명(){}
	void run() {
		System.out.println("시속 "+speed+"km로 달려라");
	}
	
	static void stop() {
		System.out.println("끼이이이이이이ㅣ이이잉익");
	}
	
		
	public static void main(String[] args) {
		Car06 myCar = new Car06();
//		Car06 myCar = new bus();
//		Car06 myCar = new truck();
		System.out.println(Car06.company);
		myCar.speed = 100;
		myCar.run();
		stop();
	}
}

class Car06_1 {
	//인스턴스변수 & 인스턴스 메서드
	int field1;
	void method1() {}
	
	//정적필드 & 메소드
	static int field2;
	static void method2(){}
	
	//정적블록
	static {
		int field3 = 10;
		//fieid1 = 100; 컴파일 에러
		//this.fieid1 = 100; error static 안에서 this 사용불가
		field2 = 200; //가능
		method2();//가능
	}
	//정적메서드
	static void method3() {
//		field1=100; 불가
//		method1();불가
		method2();//static 은 static 호출가능
		Car06_1 c = new Car06_1();
		c.field1=100; //객체 생성해서 주소를 불러오면 쓸쑤이써
		c.method1();
	}
}
