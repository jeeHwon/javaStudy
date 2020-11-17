package refactoring.ex02.before;

public class Main {

	public static void main(String[] args) {
		PuppyRobot puppy = new PuppyRobot("nana");
		puppy.order(0); //먹이를 먹는다
		puppy.order(1); //동작을 멈춘다
		puppy.order(2); //점핑
	}

}
