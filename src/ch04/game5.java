package ch04;

import java.util.Scanner;

public class game5 {

	public static void main(String[] args) {
		System.out.println("가위 바위 보 중에 하나를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String userchoice = sc.nextLine();
		 //입력값 : "가위" "바위" "보" 중 하나 선택
	
		double ran1 = Math.floor(100 * Math.random());
		int ran2 = (int)(ran1%3);
		int com;
		if (ran2 == 0) {
			com = 2;
		} else if (ran2==1) {
			com = -1;
		} else {
			com = 5;
		}
				
		int user;
		if (userchoice.equals("가위")) { //가위 = 2 / 바위 = -1 / 보= 5
			user = 2;
		} else if (userchoice.equals("바위")) {
			user = -1;
		} else if (userchoice.equals("보")) {
			user = 5;
		} else {
			user = 0;
		}
		
		String comchoice;
		if (com==2) {
			comchoice = "가위";
		} else if (com==5) {
			comchoice = "보";
		} else {
			comchoice = "바위";
		}	
		//지금까지 유저는 입력값대로 컴퓨터는 랜덤으로 가위바위보중 하나를 골라 숫자로 바꾸는 알고리즘
		
		/*
		System.out.println(com);
		System.out.println(user);
		*/
		System.out.println("컴퓨터는 "+comchoice+"를 내었습니다");
		System.out.println("당신은 "+userchoice+"를 내었습니다");
		if (com*user==-5) { //각 숫자값에 의해 승부 결과 나타내는 알고리즘
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
