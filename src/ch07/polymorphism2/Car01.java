package ch07.polymorphism2;

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
	//동일한 타입(Tire01)은 배열로 처리할 수 있다
	//Tire01[] tires = new Tire01[4]; 이방법도 있지만 바로 넣으면
	Tire01[] tires = {  new Tire01("전방좌측", 6),
						new Tire01("전방우측", 2),
						new Tire01("후방좌측", 3), 
						new Tire01("후방우측", 4)};
	//Tire01[0]에는 new Tire01("전방좌측", 6)의 주소가 들어갔다
	//[1][2][3] 도 차례로 주소가 들어갔다
	//tires.length = 4
	
	
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
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll()==false) {stop();	return i+1;}
		}
		return 0;	//정상회전시
	}
	public void stop() {
		System.out.println("끼이이이이ㅣ잉읶"); //타이어 펑크날 때 실행
	}
	
	
	
	
}
