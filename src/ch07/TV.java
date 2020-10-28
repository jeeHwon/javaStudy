package ch07;

//이 클래스는 RemoteControl 인터페이스를 구현하는 구현클래스
//개발코드가 인터페이스 메소드를 호출하면 ->인터페이스는 객체의 메소드를 호출
//객체는 인터페이스에서 정의한 추상메소드와 동일한 메소드명, 매개타입, 리턴타입을 가진
//실체 메서드를 가져야 한다. 이러한 객체를 인터페이스의 구현(implement)객체라한다
public class TV implements RemoteControl{
	private int volume;
	
	
	@Override	//실체메서드
	public void turnOn() {System.out.println("Tv On");
	}

	@Override	//실체메서드
	public void turnOff() {System.out.println("Tv Off");
	}

	@Override	//실체메서드
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume=volume;
		}
		System.out.println("현재 TV의 vol ="+this.volume);
	}

}
