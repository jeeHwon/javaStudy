package ch07;

public class Puppy01 extends Animal01 {
	public Puppy01() {
		this.type = "댕댕이";
	}
	//추상클래스에서 미구현된 추상메소드를
	//실체에서는 반드시 오버라이딩하여 구현해야 한다
	@Override
	public void move() {
		System.out.println("사족보행");
	}

	@Override
	public void sound() {
		System.out.println("왈!왈! 크르르르렁 왕!!");
	}
	
	
}
