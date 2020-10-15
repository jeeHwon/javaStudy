package ch03;

//연산자 
public class Ex01 {

	public static void main(String[] args) {
		//부호연산자 
		int x = -100;
		int result = -x;
		System.out.println("result = "+result);
		int result1 = +x;
		System.out.println("result = "+result1);
		
		short s = 100;
		short result2 =(short) -s; //단항연산자 쓰면 short가 int로 바뀌니
		//주의. 부호연산자의 산출 타입은 int가 된다.
		System.out.println(result2);
		
		//논리부정연산자(!)
		//true를 false로, false를 true로
		boolean play = true;
		
		if (play) {
			System.out.println("지금 play는 " + play);
		}
		play = !play;
		
		if (!play) {
			System.out.println("if문 안의 play는 " + play);
		}
		

	}

}
