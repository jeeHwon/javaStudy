package ch04;

import java.util.Scanner; //java.util패키지 안의 Scanner 클래스를 가져

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("가위 바위 보 중에 하나를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();//콘솔을 통해 입력받은 데이터를 숫자형태로 받겠다
		
		int computer = (int)(Math.random()*(3-1+1)+1);//컴퓨터의 값 임의 설정
		System.out.println("당신은 "+user+"를 내었습니다");
		System.out.println("컴퓨터는 "+computer+"를 내었습니다");
		
		//가위(1), 바위(2), 보(3)
		switch (user-computer) {
		case 1:  //2case
		case -2: System.out.println("win"); break; //1case
		case 0: System.out.println("draw"); break; //3case
		case -1: //2case
		case 2: System.out.println("lose"); break; //1case
		}
	}
}

