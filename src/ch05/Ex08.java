package ch05;

//주말할일
//복습 : 변수선언, 변수종료, 제어문 종류별 문법 암기, 다중 for문배열이란?, 배열선언과 생성, 초기화
//예습 : 객체지향(ch6~7)

public class Ex08 {

	public static void main(String[] args) {
		// 배열의 활용
		//5명의 학생의 총점수와 평균점수를 출력
		//
		int[] score = {99, 90, 80, 44, 97};
		int hop = 0;
		for (int i = 0; i < score.length; i++) {
			hop = hop + score[i];
		}
		System.out.println("총점  : "+hop);
		double avg = hop/(score.length);
		System.out.println("평균  : "+avg);
		
		int max = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i]>max) {
				max = score[i];
			}
		}
		System.out.println("최고점수  : "+max);
		
		int min = max;
		for (int i = 0; i < score.length; i++) {
			if (score[i]<min) {
				min = score[i];
			}
		}
		System.out.println("최저점수  : "+min);
	}
}

