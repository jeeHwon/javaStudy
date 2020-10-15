package ch04;

public class game1 {

	public static void main(String[] args) {
		//가위 = 2 / 바위 = -1 / 보= 5
		int com = 5;
		int user = 2;
		if (com*user==-5) {
			if (com==-1) {
				System.out.println("win");
			} else {
				System.out.println("win");
			}
		} else if (com==user) {
			System.out.println("draw");
		} else if (com>user) {
			System.out.println("win");
			
		} else {
			System.out.println("lose");
		}
		
		/*
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
		System.out.println(score+"점 : " +grade+"등급")
		 */
	}
}

