package ch07;

public class Driver_ex01 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Bus());
		driver.drive(new Taxi());
		
	}
}
