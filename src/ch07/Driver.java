package ch07;

//Vehicle을 이용하는 클래스
public class Driver {
	
	
	//매개변수의 다형성
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
		
}
