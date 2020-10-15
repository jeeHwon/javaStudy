package ch04;

//break 자신이 포함된 하나의 반복문 또는 switch문을 빠져나온다
public class Ex08 {

	public static void main(String[] args) {
		/*
		int num = 1;
		while (true) {
			
			System.out.println(num);
			num++;
			if (num>5) {
				break;
			}
		}
		System.out.println("밖");
	}
	*/
		int b = 0;
		while (true) {
			int a = (int)(Math.random()*6)+1;
			System.out.println(a);
			b = b + 1;
			if(a==5) {
				System.out.println(b+"번째 나옴");
				break;
			}
		}
	}
}

