package ch05;

//가변배열
public class Ex05 {

	public static void main(String[] args) {
		String[][] idol = {
				{"슬기", "아이린", "조이", "웬디", "예리"},
				{"사나", "쯔위", "나연", "정연","다현","지효", "미나"},
				{"리사", "로제", "지수", "제니"},
				{"우기", "슈화", "미연", "수진", "민니", "소연"}
				};
		
		for (int i = 0; i < idol.length; i++) {
			for (int j = 0; j < idol[i].length; j++) {
				System.out.print(idol[i][j]+" ");
				
			}System.out.println("");
		}
	}
}
