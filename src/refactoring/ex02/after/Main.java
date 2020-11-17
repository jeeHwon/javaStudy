package refactoring.ex02.after;

public class Main {

	public static void main(String[] args) {
		PuppyRobot puppy = new PuppyRobot("nana");
		puppy.order(PuppyRobot.ORDER_EAT); //먹이를 먹는다
		puppy.order(PuppyRobot.ORDER_STOP); //동작을 멈춘다
		puppy.order(PuppyRobot.ORDER_JUMP); //점핑
		//puppy.order(2); //점핑
	}

}
