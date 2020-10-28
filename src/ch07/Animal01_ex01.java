package ch07;

public class Animal01_ex01 {

	public static void main(String[] args) {
		//Animal01 animal = new Animal01(); 컴파일 에러
		//	-> 변수선언은 가능하나 객체 생성이 안되는것
		Animal01 animal = null; //추상클래스 참조변수 선언 및 초기화
		animal = new Puppy01();
		animal .sound();	//오버라이딩된 메소드 호출
		animal  = new Cat01();
		animal .sound();
		
		//매개변수의 다형성
		animalSound(new Puppy01());
		animalSound(new Cat01());
		
	}

	//매개변수의 다형성 : 부모(추상)클래스의 매개변수에
	//자식객체를 대입할 수 있도록 다형성을 적용
	public static void animalSound(Animal01 animal) {
		animal.sound();
	}
}
