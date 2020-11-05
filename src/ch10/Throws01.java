package ch10;

//예외 떠넘기기
//메소드 내부에서 예외가 발생할 수 있는 코드를 작성할 떄는 try~catch블럭으로 예외 처리
//경우에 따라서는 메서드를 호출한 곳으로 예외를 떠넘길수도 있다
//이때 사용하는 키워드가 throws이다
//즉 throws 키워드는 메소드 선언부 끝에 작성되어
//	메소드에서 처리하지 않은 예외를 호출한 곳으로 떠넘기는 역할을 한다
//throws키워드 뒤에는 떠넘길 예외클래스를 ,로 구분하여 여러개 나열할 수 있다
//형식> [접근제어자][속성] 리턴유형 메서드명()throws 예외클래스1,예외클래스2.. {}
//간단히> [접근제어자][속성]리턴유형 메서드명()throws Exception{}
public class Throws01 {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//method
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.Double");
		System.out.println("findClass() 호출성공");
	}

}
