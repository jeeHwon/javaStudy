package ch07;

//이 클래스의 super 클래스는 Vehicle
public class Taxi extends Vehicle{

	public Taxi() {
		super();
	}
	
	@Override
	public void run() {
		System.out.println("택시가 쏜다");
	}
	
	
}
