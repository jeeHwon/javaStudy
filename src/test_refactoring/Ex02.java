package test_refactoring;

//문제 1: 매직넘버 사용
//문제 2: 조건 분기의 복잡성 및 중복성
//문제 3: 명령어 에러처리의 필요성
public class Ex02 {
	Ex02(){}

	public static void main(String[] args) {
		PuppyRobot pr = new PuppyRobot("max");
		pr.order(0);
		pr.order(1);
		pr.order(2);
		pr.order(3);
	}
}

class PuppyRobot{

	private String _name;
	
	public PuppyRobot(String name) {
		this._name = name;
	}
	public void order(int n) {
		if (n==0) {
			System.out.println(_name+" eats.");
		} else if (n==1) {
			System.out.println(_name+" stops.");
		} else if (n==2) {
			System.out.println(_name+" jumps.");
		} else {
			System.out.println("명령어 에러");
		}
	}
}


