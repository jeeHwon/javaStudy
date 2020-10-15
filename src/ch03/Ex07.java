package ch03;

//논리 연산자
//연산자 우선순위 : 산술 > 비교 > 논리 > 대입
//T & T : T -> &의 의미는 둘중 하나만 T일 때 T
//F & T : F -> &앞의 결과가 F이더라도 뒤의 결과를 살펴본다 
//T && T : T
//F && T : F -> &&앞의 결과가 F이면 결과는 무조건 F이므로  뒤의 결과를 보지 않는다
public class Ex07 {

	public static void main(String[] args) {
		//&& AND연산자
		int charCode = 'Q';
		if (charCode >= 65 && charCode <=90) {
			System.out.println("대문자~");
		}
		if (charCode >= 97 && charCode <=122) {
			System.out.println("소문자~");
		}
		if (charCode >= 48 && charCode <=57) {
			System.out.println("숫자~");
		}
		//|| OR연산자
		int num = 12;
		if (num%2==0 || num%3==0 ) {
			System.out.println(num+"은 2 또는 3의 배수이군요");
		}
		else {
			System.out.println(num+"조건을 만족하지 않군요");
		}
	}
}

