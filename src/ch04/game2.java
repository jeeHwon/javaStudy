package ch04;

public class game2 {

	public static void main(String[] args) {
		String userchoice = "보"; //입력값 : "가위" "바위" "보" 중 하나 선택
		String comchoice = "보";
		int com;
		int user;
		//가위 = 2 / 바위 = -1 / 보= 5
		if (userchoice=="가위") {
			user = 2;
		} else if (userchoice=="바위") {
			user = -1;
		} else {
			user = 5;
		}
		if (comchoice=="가위") {
			com = 2;
		} else if (comchoice=="바위") {
			com = -1;
		} else {
			com = 5;
		}	
		System.out.println("컴퓨터는 "+comchoice+"를 내었습니다");
		System.out.println("당신은 "+userchoice+"를 내었습니다");
		
		//가위 = 2 / 바위 = -1 / 보= 5
		if (com*user==-5) {
			if (com==-1) {
				System.out.println("귀하께서 이겼어요!!");
			} else {
				System.out.println("이런 지셨군요");
			}
		} else if (com==user) {
			System.out.println("비겼어요");
		} else if (com>user) {
			System.out.println("귀하께서 이겼어요!!");
		} else {
			System.out.println("이런 지셨군요");
		}
	}
}

