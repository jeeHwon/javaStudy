package ch07;

//이 클래스의 super 클래스는 Vehicle
public class Bus extends Vehicle{

	
	
	public Bus() {
		super();
	}
	
	@Override
	public void run() {
		System.out.println("버스가 달린다");
	}
	
}
