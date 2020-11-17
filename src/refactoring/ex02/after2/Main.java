package refactoring.ex02.after2;

public class Main {

	public static void main(String[] args) {
		PuppyRobot puppy = new PuppyRobot("nana");
		puppy.order(PuppyRobot.Order.EAT); //먹이를 먹는다
		puppy.order(PuppyRobot.Order.STOP); //동작을 멈춘다
		puppy.order(PuppyRobot.Order.JUMP); //점핑
		//puppy.order(PuppyRobot.ORDER_JUMP); //점핑
		puppy.order(PuppyRobot.Order.JUMP); //점핑
		/*The method order(PuppyRobot.Order) in the type PuppyRobot 
		is not applicable for the arguments (int)*/
	}

}








