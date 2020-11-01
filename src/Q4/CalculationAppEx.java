package Q4;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculationAppEx {
	//field
	//정적변수 이전 계산결과를 저장
	static CalculationApp[] ca = new CalculationApp[100];
	static Scanner sc = new Scanner(System.in);
	
	//진입함수
	public static void main(String[] args) {
				
	
		//프로그램 on/off
		boolean run = true;
		
		//반복문
		while(run) {
//			System.out.println("----------------------------------------------------------");
//			System.out.println("계산기 ver1.0");
//			System.out.println("입력방법 : 연산자 + - * /를 이용하여 띄어쓰기 없이 입력");
//			System.out.println("----------------------------------------------------------");
			System.out.print("입력> ");
			
			//입력받기
			String str = sc.nextLine();
			String[] arr = str.split("");
			ArrayList<Integer> plusIdx = new ArrayList<Integer>();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals("+")) {
					plusIdx.add(i);
				}
			}
			for (int i :plusIdx) {
				System.out.println(i);
			}
			
			
		}
		
		
	}
}
