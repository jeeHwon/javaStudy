package ch07;

//추상클래스 : 추상메서드를 포함하는 클래스 (나머지는 일반 클래스와같아)
abstract class Player{
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player{
	void play(int pos) {//추상클래스 구현을 하여야한다. 
		System.out.println(pos+"위치부터 재생합니다");
	}
	void stop() {
		System.out.println("재생을 멈춥니다");
	}

}


public class PlayerTest {

	public static void main(String[] args) {
		Player ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
		
	}

}
