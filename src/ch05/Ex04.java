package ch05;

//다차원 배열
public class Ex04 {

	public static void main(String[] args) {
		//5명 학생의 3과목 시험점수를 저장한 후 출력
		//int[][] score = new int[5][3]; 배열 생성 후 다 0로 채워
		int[][] score = {
						{100, 90, 80},
					    {90, 80, 70},
						{20, 30, 40},
						{50, 60, 50},
						{100, 80, 70}
						};
		for (int i = 0; i <score.length ; i++) {
			for (int j = 0; j <score[i].length; j++) {
				System.out.print(score[i][j]+" "); 
			}
			System.out.println("");
		}
	}
}
