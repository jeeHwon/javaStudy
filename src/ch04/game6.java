package ch04;

import java.util.Scanner;
public class game6 {

	public static void main(String[] args) {
		System.out.println("가위 바위 보 중에 하나를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String userchoice = sc.nextLine();
		 //입력값 : "가위" "바위" "보" 중 하나 선택
		int ran = (int)(Math.random()*(3-1+1)+1);
		int com;
		switch (ran) {
		case 1: com = 2; break;
		case 2: com = -1; break;
		case 3: com = 5; break;
		default: com = 0; break;
		}
		
		int user;
		switch (userchoice) {
		case "가위": user = 2; break;
		case "바위": user = -1; break;
		case "보": user = 5; break;
		default: user = 0; break;
		}
		
		String comchoice;
		switch (com) {
		case 2 : comchoice = "가위"; break;
		case 5 : comchoice = "보"; break;
		case -1 : comchoice = "바위"; break;
		default: comchoice = ""; break;
		}
		System.out.println("컴퓨터는 "+comchoice+"를 내었습니다");
		System.out.println("당신은 "+userchoice+"를 내었습니다");
		
		if (com*user==-5) {
			if (com==-1) {
				System.out.println("귀하께서 이겼어요!!");
			} else {
				System.out.println("이런 지셨군요");
			}
		} else {
			if (com==user) {
				System.out.println("비겼어요");
			} else if (com<user) {
				System.out.println("이런 지셨군요");
			} else if (com>user) {
				System.out.println("귀하께서 이겼어요!!");
			} else  {
				System.out.println("error");
			}
		}
	}
}
