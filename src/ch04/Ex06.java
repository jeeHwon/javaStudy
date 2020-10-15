package ch04;

public class Ex06 {

	public static void main(String[] args) {
		// 1 2 3...10까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
		// 10 9 8 ...1까지 출력
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		//구구단 2단 출력 2 * 1 = 2
		for (int i = 1; i < 10; i++) {
			int dan = 2;
			System.out.println(dan+" * "+i+" = "+(2*i));
		}
		// 1+2+3+4+5+..+100
		int a = 0;
		for (int i = 0; i <= 100; i++) {
			a = a + i;
		}
		System.out.println(a);
		//반대로 5050이 되려면 1부터 n까지 ?
		int k = 5050;
		int j = 0;
		for (int i = 0; k >1 ; i++) {
			k = k - i;
			j = j + 1;
		}
		System.out.println(j-1);
		int p = 0;
		for ( ; ; ) { //조건식이 없는 경우 항상 true로 인식 계속 돌아가
			if (p<5) { //if 있으니까 조건은 봐준다
				System.out.println(p);
				p += 1;
			} else {
				break; //반복문 종료(if문이 아니라 break가 들어간 반복문 블럭 즉 for문 블럭)
			}			//for문 안의 for문이 들어가면 안쪽 for문 안에 있는 break는안쪽 for문만 빠져나온다
			//if 밖이고 for 안이니까 다시 for로 돌어가 다시 if로 들어가
		}
	}
}
