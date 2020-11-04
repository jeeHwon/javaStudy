package ch10;

//NullPointerException - 객체 참조가 없는 상태
//즉 null값을 갖는 참조변수로 객체접근자 연산자인 .을 사용했을 때 발생
//해결방법 : 주소를 주면 됨 (객체를 생성해서 넣으면 됨)
public class Exception01 {

	public static void main(String[] args) {
		String data = null;
		System.out.println(data);
		System.out.println(data.toString());	//nullPointerExc
		
	}

}
