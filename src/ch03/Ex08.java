package ch03;

//조건문과 반복문
//A학점 : 100 ~ 91
//B학점 : 90 ~ 81
public class Ex08 {

	public static void main(String[] args) {
		//if문
		int score1 = 71;
		if (score1 <= 100 && score1 >90) {
			System.out.println("A학점입니다");
		} else if (score1 <= 90 && score1 >80) {
			System.out.println("B학점입니다");
		} else if (score1 <= 80 && score1 >70) {
			System.out.println("C학점입니다");
		} else {
			System.out.println("그외");
		}
		
		//삼항연산자 
		//
		//(조건)? 참값 : 거짓값 = if(조건){참값}else{거짓값}
		//(조건1)? 조건1참값 :(조건2)?조건2참값:조건2거짓값
		int score2 = 48;
		String result = (score2>90)? "A학점":(score2>80)?"B학점":"그외";
		System.out.println(result);
		int a = 10;
		int n = (a>10)? 100:0;
		System.out.println(n);
			
	}
	
}
