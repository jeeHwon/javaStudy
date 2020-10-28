package ch07;

//실행클래스
//추상클래스의 객체를 생성하지 못하므로
//추상클래스의 멤버를 사용하고 싶다면 그것을 상속받는 
//실체클래스의 객체를 생성해서 사용
public class Phone01_ex {

	public static void main(String[] args) {
		//Phone01 ph = new Phone01("내꺼");
		//Phone01의 생성자를 호출해서 객체를 생성할 수 없다
		
		SmartPhone01 ph = new SmartPhone01("내꺼");
		
		ph.turnOn(); //부모(추상) Phone01클래스의 메소드 호출
		ph.internet(); //SmartPhone01 클래스의 메소드 호출
		ph.turnOff();
		
	}	

}
