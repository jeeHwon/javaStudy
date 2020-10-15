package ch04;

//중첩 for문
public class Ex10 {

	public static void main(String[] args) {
		//구구단 출력
		for (int i = 2; i < 10; i++) {
			System.out.println(i+"단");
			for (int j = 1; j < 10; j++) {
				System.out.println("    "+i+" * "+j+" = "+ (i*j));
			}//내부 for문
			
		}//외부 for문
		System.out.println("---------------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("["+i+","+j+"]"+"  ");
			}
			System.out.println("");
		}
		System.out.println("---------------------");
		//printf method
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				//printf(String타입의 format, Object타입의 argument)
				System.out.printf("[%d,%d]  ",i, j); //
			}
			System.out.println("");
		}
	}
}
