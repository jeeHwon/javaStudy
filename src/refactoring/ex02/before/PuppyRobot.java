package refactoring.ex02.before;

public class PuppyRobot {
	//field
	String _name;
	
	//constructor
	public PuppyRobot() {}
	public PuppyRobot(String name) {
		_name = name;
	}
	
	//method
	/*- 명령어가 0이면  강아지로봇이 먹이를 먹어요.
	  - 명령어가 1이면  강아지로봇이 동작을 멈춥니다.
	  - 명령어가 2이면  강아지로봇이 점프를 합니다.
	  - 그 외는 명령어 에러.*/
	public void order(int order) {
		switch(order) {
		case 0 : System.out.println(_name+" eats.");
			break;
		case 1 : System.out.println(_name+" stop.");
			break;
		case 2 : System.out.println(_name+" jumping.");
			break;
		default : System.out.println("error code.");
			break;
		}
	}
	
}





