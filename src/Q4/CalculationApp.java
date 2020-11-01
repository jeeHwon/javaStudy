package Q4;

import java.util.Scanner;

public class CalculationApp {
	//field
	public String history = null;
	public int result = 0;
	
	//constructor
	public CalculationApp(String his, int res) {
		this.history = his;
		this.result = res;
	}
	
	//문자열로 입력받아 숫자와 연산부호 구분하는 기능
	public String input() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public String[] splitString(String msg) {
		String[] str = msg.split("\\+");
		return str;
	}
	
	public int plus(int x, int y) {
		return x+y;
	}
	public int minus(int x, int y) {
		return x-y;
	}
	public int mul(int x, int y) {
		return x*y;
	}
	public double div(int x, int y) {
		return (x*1.0)/(y*1.0);
	}
	
	
}
