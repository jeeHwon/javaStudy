package ch07;

public class Audio implements RemoteControl {
	private int volume;
	private boolean mute; //디폴트메서드를 오버라이드하면서 사용하게되는 필드를 선언
	
	
	@Override	//실체메서드
	public void turnOn() {System.out.println("Audio On");
	}

	@Override	//실체메서드
	public void turnOff() {System.out.println("Audio Off");
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
		System.out.println("현재 Audio의 vol ="+this.volume);
	}

	//위까지는 추상메서드를 반드시 구현해주어야 했고
	
	//아래는 디폴트 메서드라 오버라이드 해도되고 안하고 걍써도돼
	@Override
	public void setMute(boolean mute) {
		//RemoteControl.super.setMute(mute);
		this.mute = mute; //이 객체의 mute 필드의 값을 변경
		if (mute) {
			System.out.println("audio 무음처리 합니다");
		} else {
			System.out.println("audio 음소거 해제");
		}
	}

}
