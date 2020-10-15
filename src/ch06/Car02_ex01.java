package ch06;

//자동차클래스로부터 객체를 생성하여 실행하는 클래스
public class Car02_ex01 {

	public static void main(String[] args) {
		//자동차 클래스로부터 객체를 생성
		Car02 car1 = new Car02();
		
		//field 값 가져오기 -> 참조변수명.필드명
		//company 변수는 인스턴스 변수이므로 인스턴스 생성 후 참조변수.필드명 으로 접근해야한다
		System.out.println("car1.company : "+car1.company);
		System.out.println("car1.color : "+car1.color);
		System.out.println("car1.maxSpeed : "+car1.maxSpeed);
		System.out.println("car1.model : "+car1.model);
		System.out.println("---------------------------------");
		
		//field 값 변경하기 -> 참조변수명.필드명 = 값;
		car1.company = "porsche";
		car1.model = "911 carerra";
		System.out.println("변경 후 car1.company : "+car1.company);
		System.out.println("변경 후 car1.model : "+car1.model);
		System.out.println("---------------------------------");
		
		//method
		//(실행클래스에서 선언한)메소드 호출 -> 메소드명();
		//인스턴스 메소드호출 -> 참조변수명.메소드명();
		
		//Math.random()은  Math 클래스의 static 메소드이다
		//static으로 선언된 필드와 메소드는 객체를 생성하지 않고도
		//즉 인스턴스 생성 없이 클래스이름.클래스변수명으로 접근 가능하다
		System.out.println(Math.random());
		car1.abc();
		car1.qwe();
		System.out.println("---------------------------------");
		
		//static 변수 호출 : 클래스명.메소드명
		System.out.println("Car02.wheel = "+Car02.wheel);
		Car02 car2 = new Car02();
		Car02 car3 = new Car02();
		System.out.println("car2.wheel = "+car2.wheel);
		System.out.println("car3.wheel = "+car3.wheel);
	}
}
