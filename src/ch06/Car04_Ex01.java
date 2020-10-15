package ch06;

public class Car04_Ex01 {

	public static void main(String[] args) {
		Car04 c1 = new Car04("911", 280);
		System.out.println(c1.model);
		System.out.println(c1.speed);
		System.out.println("============================");
		
		Car04 c2 = new Car04("718", 290);
		System.out.println(c2.model);
		System.out.println(c2.speed);
		System.out.println("============================");
		
		c1.run();
		c2.run();
	}
}

