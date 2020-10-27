package ch07.polymorphism;

public class KumhoTire extends Tire01{
	//field
	
	//constructor
	public KumhoTire() {}
	public KumhoTire(String location, int maxRoation) {
		super(location, maxRoation);
	}
	
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation;	//호출될때마다 1씩 회전수 누적 증가
		if (accumulatedRotation<maxRotation) {
			System.out.println("위치@"+location+"금호tire 수명 : "+(maxRotation-accumulatedRotation));
			return true;	
		} else {
			System.out.println("위치@"+location+"금호tire 펑크");
			return false;
		}
	}
	
	
}
