package ch07.polymorphism;

//이 크래스의 direct subclass로 한국, 금호타이어가 있다
public class Tire01 {
	//field
	public int maxRotation;	//최대회전수(=>타이어의 수명)
	public int accumulatedRotation;	//누적회전수
	public String location;	//타이어의 위치(1전좌,2전우,3후좌,4후우)
	
	//constructor
	public Tire01() {}
	public Tire01(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//method
	public boolean roll() {
		++accumulatedRotation;	//호출될때마다 1씩 회전수 누적 증가
		if (accumulatedRotation<maxRotation) {
			System.out.println("위치@"+location+"tire 수명 : "+(maxRotation-accumulatedRotation));
			return true;	
		} else {
			System.out.println("위치@"+location+"tire 펑크");
			return false;
		}
	}
	
	
	
	
}
