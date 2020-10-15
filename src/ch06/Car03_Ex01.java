package ch06;

//Car03 쿨래스로부터 객체를 생성하여 실행하는 클래스
public class Car03_Ex01 {

	public static void main(String[] args) {
		Car03 c1 = new Car03();
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.maxSpeed);
		
		System.out.println("--------------");
		Car03 c2 = new Car03("911 carrerra");
		System.out.println(c2.company);
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println(c2.maxSpeed);
		
		System.out.println("--------------");
		Car03 c3 = new Car03("718 boxter", "red");
		System.out.println(c3.company);
		System.out.println(c3.model);
		System.out.println(c3.color);
		System.out.println(c3.maxSpeed);
		
		System.out.println("--------------");
		Car03 c4 = new Car03("911 targa", "black", 300);
		System.out.println(c4.company);
		System.out.println(c4.model);
		System.out.println(c4.color);
		System.out.println(c4.maxSpeed);
	}
}

