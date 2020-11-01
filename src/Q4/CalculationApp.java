package Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Calhistory{//이전 계산 결과값이 저장된 클래스
	public static double history = 0;	//초기 설정값 0
}

public class CalculationApp {
	//field
	static Scanner sc = new Scanner(System.in); //사용자에게 입력받기
	public double result = 0;	//결과 초기값 0으로 설정
	public String str = null;	//입력받을 형태 String으로 설정
	public static boolean runIs = true;	//true일 때만 계산기 실행목적으로 boolean 변수 선언
	
	//입력받은 String에서 + - * /의 index를 각각 구해 List에 추가
	//List 선언
	List<Integer> plusIdx = new ArrayList<Integer>();
	List<Integer> minusIdx = new ArrayList<Integer>();
	List<Integer> mulIdx = new ArrayList<Integer>();
	List<Integer> divIdx = new ArrayList<Integer>();
	
	List<Integer> total = new ArrayList<Integer>();	//모든 부호 index
	List<String> list = new ArrayList<String>();	//부호로 구별된 전체 list
	
	//constructor
	public CalculationApp() {}

	//method
	//문자열로 입력받아 숫자와 연산부호 구분하여 리스트화 하는 method
	public void input() {
		System.out.print("입력> ");
		str = sc.nextLine();	//문자열로 입력받아
		if (str.equals("c")) {	//c 입력시 계산기 리셋
			Calhistory.history=0;	
			System.out.println("계산기가 리셋되었습니다");
			System.out.println(" = 0");
			System.out.print("입력> ");
			str = sc.nextLine();
		}
		if (str.equals("exit")) {	//exit 입력시 계산기 종료
			System.out.println("계산기가 종료되었습니다");
			CalculationApp.runIs = false;
			return;

		}
	
		if (Calhistory.history!=0) {	//이전결과 값 존재시 이어서 입력구현
			str = Calhistory.history+str;
		}
		
		
		String[] arr = str.split("");	//문자열을 문자 하나씩 배열화

		for (int i = 0; i < arr.length; i++) {	//문자 하나씩 검사하여
			if (arr[i].equals("+")) {	//+의 index를 List에 추가
				this.plusIdx.add(i);
			}
			if (arr[i].equals("-")) {	//-의 index를 List에 추가
				this.minusIdx.add(i);
			}
			if (arr[i].equals("*")) {	//*의 index를 List에 추가
				this.mulIdx.add(i);
			}
			if (arr[i].equals("/")) {	//'/'의 index를 List에 추가
				this.divIdx.add(i);
			}
		}
		
		//total 리스트에 각 연산자 index를 병합
		this.total.addAll(plusIdx);
		this.total.addAll(minusIdx);
		this.total.addAll(mulIdx);
		this.total.addAll(divIdx);
		Collections.sort(total);
		
		//연산자가 나오기 전까지 하나의 숫자로서 슬라이싱하여 list에 추가
		//연산자 자체를 list에 추가한 후 이를 반복
		int n = 0;
		for (int i = 0; i < total.size(); i++) {
			this.list.add(str.substring(n, total.get(i)));
			this.list.add(str.substring(total.get(i), total.get(i)+1));
			n = this.total.get(i)+1;
		}
		
		//만약 "1+23*4"로 입력을 받은 경우,
		//list = {"1", "+", "23", "*", "4"}의 형태로 저장됨
		this.list.add(str.substring(total.get(total.size()-1)+1));
		

	}
	
	//list를 가지고 실질적 계산을 수행하는 method
	public void calculate() {
		//연산자가 처음 나오는 index를 찾아 그 전후 요소를 연산하고,
		//list에서 연산한 결과로 치환하고,
		//더 이상 해당 연산자가 없을 때 까지 반복한다.
		//사칙연산에 따라 곱셈과 나눗셈을 덧셈 뺄셈보다 먼저 수행한다.
		while (list.indexOf("*")!=-1) {
			int idx = list.indexOf("*");
			double a = Double.parseDouble(list.get(idx-1));
			double b = Double.parseDouble(list.get(idx+1));
			String result = a*b+"";
			list.set(idx, result);
			list.remove(idx+1);
			list.remove(idx-1);
			
		}
		while (list.indexOf("/")!=-1) {
			int idx = list.indexOf("/");
			double a = Double.parseDouble(list.get(idx-1))*1.0;
			double b = Double.parseDouble(list.get(idx+1))*1.0;
			String result = a/b+"";
			list.set(idx, result);
			list.remove(idx+1);
			list.remove(idx-1);
			
		}
		while (list.indexOf("+")!=-1) {
			int idx = list.indexOf("+");
			double a = Double.parseDouble(list.get(idx-1));
			double b = Double.parseDouble(list.get(idx+1));
			String result = a+b+"";
			list.set(idx, result);
			list.remove(idx+1);
			list.remove(idx-1);
		}
		while (list.indexOf("-")!=-1) {
			int idx = list.indexOf("-");
			double a = Double.parseDouble(list.get(idx-1));
			double b = Double.parseDouble(list.get(idx+1));
			String result = a-b+"";
			list.set(idx, result);
			list.remove(idx+1);
			list.remove(idx-1);
		}
		
		//결과값을 출력하고, 이전 결과값에 덮어씌운다
		this.result = Double.parseDouble(list.get(0));
		Calhistory.history = this.result;
		System.out.println(" = "+this.result);
	}
	
	//input과 calculate 를 연속적으로 실행하는 method
	public void run() {
		CalculationApp myCal = new CalculationApp();
		myCal.input();
		myCal.calculate();
		
	}


	
	
}

