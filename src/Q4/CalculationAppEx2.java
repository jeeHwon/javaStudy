package Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CalculationAppEx2 {
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
			List<Integer> plusIdx = new ArrayList<Integer>();
			List<Integer> minusIdx = new ArrayList<Integer>();
			List<Integer> mulIdx = new ArrayList<Integer>();
			List<Integer> divIdx = new ArrayList<Integer>();
			List<Integer> total = new ArrayList<Integer>();
			List<String> list = new ArrayList<String>();
			
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals("+")) {
					plusIdx.add(i);
				}
				if (arr[i].equals("-")) {
					minusIdx.add(i);
				}
				if (arr[i].equals("*")) {
					mulIdx.add(i);
				}
				if (arr[i].equals("/")) {
					divIdx.add(i);
				}
				
			}
			total.addAll(plusIdx);
			total.addAll(minusIdx);
			total.addAll(mulIdx);
			total.addAll(divIdx);
			Collections.sort(total);
			int n = 0;
			for (int i = 0; i < total.size(); i++) {
				list.add(str.substring(n, total.get(i)));
				list.add(str.substring(total.get(i), total.get(i)+1));
				
				n = total.get(i)+1;
			}
			list.add(str.substring(total.get(total.size()-1)+1));
	
			//곱하기
			for (String s : list) {
				System.out.println(s);
			}
			while (list.indexOf("*")!=-1) {
				int idx = list.indexOf("*");
				int a = Integer.parseInt(list.get(idx-1));
				int b = Integer.parseInt(list.get(idx+1));
				String result = a*b+"";
				list.set(idx, result);
				list.remove(idx+1);
				list.remove(idx-1);
				
			}
			while (list.indexOf("/")!=-1) {
				int idx = list.indexOf("/");
				double a = Integer.parseInt(list.get(idx-1))*1.0;
				double b = Integer.parseInt(list.get(idx+1))*1.0;
				String result = a/b+"";
				list.set(idx, result);
				list.remove(idx+1);
				list.remove(idx-1);
				
			}
			System.out.println("=========");
			for (String s : list) {
				System.out.println(s);
			}
			System.out.println("=========");
			for (String s : list) {
				System.out.println(s);
			}
			while (list.indexOf("+")!=-1) {
				int idx = list.indexOf("+");
				int a = Integer.parseInt(list.get(idx-1));
				int b = Integer.parseInt(list.get(idx+1));
				String result = a+b+"";
				list.set(idx, result);
				list.remove(idx+1);
				list.remove(idx-1);
				
			}
			System.out.println("=========");
			for (String s : list) {
				System.out.println(s);
			}
			while (list.indexOf("-")!=-1) {
				int idx = list.indexOf("-");
				int a = Integer.parseInt(list.get(idx-1));
				int b = Integer.parseInt(list.get(idx+1));
				String result = a-b+"";
				list.set(idx, result);
				list.remove(idx+1);
				list.remove(idx-1);
				
			}
			System.out.println("=========");
			for (String s : list) {
				System.out.println(s);
			}

			
			
		}
		
		
	}
}
