package ch06;
//클래스 멤버를 사용할 때에는 클래스명.필드명, 클래스명.메소드명();
public class Calculator03_ex01 {
	public static void main(String[] args) {
		double r = 4.0;
		System.out.println("반지름 r인 원의 넓이 : "+ Calculator03.pi*r*r);
		System.out.println("반지름 r인 원의 둘레 : "+ Calculator03.pi*r*2);
		System.out.println("1+2= "+Calculator03.plus(1, 2));
		System.out.println("내 생일은 : "+Calculator03.swbirthday);
	}
}
