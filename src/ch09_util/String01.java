package ch09_util;

public class String01 {

	public static void main(String[] args) {
		//주소 비교(==)
		String str1 = "스칼렛 요한슨";
		String str2 = "스칼렛 요한슨";
		System.out.println("str1==str2 : "+(str1==str2)); //true
		//==의 결과가 true인 것은 str1과 str2 변수가 동일한 주소를 참조
		//문자열 리터럴이 동일하다면 동일한 String 객체를 참조하도록 하였다
		
		//하지만 new 연산자로 생성되면 서로 다른 String 객체를 참조한다
		String str3 = new String("스칼렛 요한슨");
		String str4 = new String("스칼렛 요한슨");
		System.out.println("str3==str4 : "+(str3==str4)); //false
		
		//문자열 비교(equals) : 값비교
		System.out.println("str1.equals(str2) : "+str1.equals(str2));
		System.out.println("str3.equals(str4) : "+str3.equals(str4));
	}

}
