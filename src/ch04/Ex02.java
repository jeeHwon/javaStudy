package ch04;

import java.lang.Math;

//조건문
/*
 * 90이상 -A
 * 80이상 -B
 * 70이상 -C
 * 60이상 -D
 * 60미만 -F 출력
 */
public class Ex02 {

	public static void main(String[] args) {
		//Math.random() : 0.0이상 1.0미만의 난수 발생
		//	Returns a double value with a positive 
		//	sign, greater than or equal to 0.0 and 
		//	less than 1.0.
		//
		//double ran = Math.floor(100 * Math.random());
		//System.out.println();
		//
		//System.out.println("Math.random()="+ran);
		//System.out.println("(int)Math.random()="+(int)ran);
		//0~5 일땐 
		//Math.random()*(큰수-작은수+1)+작은수
		//(int)(Math.random()*(큰수-작은수+1)+작은수)
	
		
		//100일땐 (int)(Math.random()*(큰수-작은수+1)+작은수)
		//(int)(Math.random()*(100-0+1)+0)

		
		int score = (int)(Math.random()*(100-0+1)+0); //임의점수 값을 저장하기 위한 변수
		String grade = ""; //등급을  저장하기 위한 변수
		
		if (score >=90) {
			grade = "A";
		} else if (score >=80) {
			grade = "B";
		} else if (score >=70) {
			grade = "C";
		} else if (score >=60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(score+"점 : " +grade+"등급");
	}
}
