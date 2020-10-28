package ch07;

public class Cat01 extends Animal01 {
	public Cat01() {
		this.type="길냥이";
	}

	@Override
	public void move() {
		System.out.println("사뿐사뿐");
	}

	@Override
	public void sound() {
		System.out.println("니이이이이이양야야야양옹");
	}

	
}
