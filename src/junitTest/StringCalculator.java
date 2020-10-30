package junitTest;

import java.util.Scanner;

//소스코드
//문자열계산기
//사용자가 입력한 문자열 값을 이용해서 사칙연산기능 계산기 구현


public class StringCalculator {

	//입력받는 기능
	public String input() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public String[] splitString(String msg) {
		String[] str = msg.split(" ");
		return str;
	}
	public int calculate (String[] str) {
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[2]);
		int result = add(x,y);
		return result;
	}	
	
	
	public int add(int x, int y) {
		return x+y;
	}
	public int minus(int x, int y) {
		return x-y;
	}
}
