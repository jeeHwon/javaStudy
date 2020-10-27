package ch07.polymorphism;

//이 클래스는 Tire01 클래스를 부품으로 가지는 클래스
//자동차는 tire을 가진다 Car01 has a Tire01
//=> 포함관계(composite) : 한 클래스의 멤버변수로 다른 클래스를 선언하는 것
public class Car01 {
	//field
	String company;
	int price;
	String color;
	//이외 부품관계의 field
	//클래스 변수;
	Tire01 flTire = new Tire01("전방좌측", 6);
	Tire01 frTire = new Tire01("전방우측", 2);
	Tire01 blTire = new Tire01("후방좌측", 3);
	Tire01 brTire = new Tire01("후방우측", 4);
	
	//constructor
	public Car01() {}

	
	//method
	//자동차가 가진 부품. 4개의 타이어가 모두 1회씩 회전시켜야 한다
	//각 Tire01 객체의 roll()메서드를 호출한다
	//호출한 roll() 메서드가 false를 리턴한 경우에는 
	//자동차를 멈추기 위해 stop()메서드를 호출하고 
	//문제가 발생한 해당 타이어의 번호를 리턴
	public int run() {
		System.out.println("부우우우우우우웅~");
		if (flTire.roll()==false) {stop();	return 1;}		
		if (frTire.roll()==false) {stop();	return 2;}		
		if (blTire.roll()==false) {stop();	return 3;}		
		if (brTire.roll()==false) {stop();	return 4;}		
		return 0;	//정상회전시
	}
	public void stop() {
		System.out.println("끼이이이이ㅣ잉읶"); //타이어 펑크날 때 실행
	}
	
	
	
	
}
