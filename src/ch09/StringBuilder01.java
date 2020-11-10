package ch09;


//StringBuilder
//String 클래스의 경우 문자열 결합을 의미하는 +연산자를 많이 사용할 수록
//String 객체의 수가 늘어나기 때문에 프로그램 성능을 느리게 하는 요인이 된다
//따라서 문자열 변경 작업을 많이 하는 경우에는
//StringBuilder 또는 StringBuffer 클래스를 사용하는 것이 좋다
//이 두개의 클래스는 내부버퍼(buffer:데이터를 임시로 저장하는 메모리)에 문자열을 저장해두고
//그 안에서 추가, 수정, 삭제작업을 할 수 있도록 설계 되어 있다
//따라서 String 처럼 새로운 객체를 만들지 않고도 문자열을 조작 할 수 있다

public class StringBuilder01 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		//append() : 맨 뒤에 추가
		sb.append("Java ");
		sb.append("Program Study ");
		System.out.println("sb= "+sb);
		
		//insert(int offset, ~) : 문자열을 중간에 주어진 offset위치에 추가
		sb.insert(4, "2");
		System.out.println("sb2= "+sb);
		
		sb.setCharAt(4, '6');
		System.out.println("sb3= "+sb);
		
		sb.replace(6, 13, "book");
		System.out.println("sb4= "+sb);
		
		sb.delete(4, 5);
		System.out.println("sb5= "+sb);
		System.out.println("sb.length()= "+sb.length());
		
		if (sb instanceof StringBuilder) {
			System.out.println("StringBuilder의 insatance이다");
		}
		
		//StringBuilder를 String으로 변환
		String str = sb.toString();
		System.out.println("String str = "+str);
		if (str instanceof String) {
			System.out.println("String의 instace이다");
		}
		
		//객체 값 비교
		System.out.println(sb==sb.append("뿌라스")); //객체 새로 생성하지 않고 동일 주소
		System.out.println(sb.equals(sb.append("투뿌라스")));
		
//		StringBuilder sb1 = new StringBuilder();
//		StringBuilder sb2 = new StringBuilder();
//		sb1.append("아이");
//		sb2.append("아이");
//		System.out.println(sb1);
//		System.out.println(sb2);
//		System.out.println(sb1.toString().equals(sb2.toString()));
//		
	}

}
