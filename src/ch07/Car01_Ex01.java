package ch07;

public class Car01_Ex01 {

	public static void main(String[] args) {
		Car01 c = new Car01();
		System.out.println(c);
		c.setSpeed(80);
		System.out.println("현재속도 :"+c.getSpeed()+"km/h");
		c.setStop(true);
		c.isStop();
	}
}