package ch07;

public class RemoteControl_ex01 {

	public static void main(String[] args) {
		RemoteControl rc = null;	
		//RemoteControl rc;	인터페이스 변수; 로 선언만도 가능
		
		//실체클래스 TV의 실체메서드가 인터페이스 메서드 호출실행 
		rc = new TV();		//변수 = 구현객체;
		rc.turnOn();		//TV객체를 인터페이스 타입에 대입
		rc.setVolume(11);
		rc.turnOff();
		
		rc = new Audio();	//변수 = 구현객체;
		rc.turnOn();
		rc.setVolume(1);
		rc.turnOff();
		
		//인터페이스에서 정의된 정적메서드 사용
		//인터페이스명.메서드명()
		RemoteControl.changeBattery(); 
		
		//디폴트 메서드 사용
		//인터페이스변수.메서드명();
		//디폴트 메서드가 실체클래스에서 오버라이딩 되었다면
		//실체 객체의 오버라이딩된 메서드가 호출왼다
		rc.setMute(true); //audio를 무음처리합니다
		
		
		
	}

}
