package ch04;
//while 문
/*
* while(조건) {
*	조건만족시 반복실행코드
*  }
*  do-while 문
*  블럭{}이 최소한 1번 이상 수행될 경우
*  do {
*  	반복실행코드
*  } while(조건);
*/
public class Ex07 {

	public static void main(String[] args) {
		/*
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		
		//1 2 3 4 5 출력
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i < 6);
		*/
		int j = 1;
		do {
			System.out.println(j);
			if (j==5) {
				break;
			}
			j++;
		} while (j<11);
	}
}
