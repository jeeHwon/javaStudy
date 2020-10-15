package ch03;

//문자열 비교
//== : 객체의 주소를 비교한다
//문자열.equals(비교문자열) : 객체의 값을 비교한다
public class Ex06 {

	public static void main(String[] args) {
		
		Ex06 obj1 = new Ex06();
		Ex06 obj2 = new Ex06();
		System.out.println("obj1="+obj1);
		System.out.println("obj2="+obj2);//원래는 주소지가 생기는게 맞아
		//근데 string은 sout해도 주소 안나오고 보이게끔한거
		//밑에서 str1~4는 referance 변수다.(주소가 저장되는 참조변수)
		//string은 클래스타입 str1은 주소를 저장한 참조변수
		String str1 = "홍길동";
		String str2 = "홍길동";//이땐 str에 홍길동이라는 리터럴 값이 직접 저장되는것
		String str3 = new String("홍길동");//이땐 힙 영역에 홍길동이 저장되고 스택의 str3에는 힙을 가리키는 주소가 저장된다
		String str4 = new String("홍길동");//따라서 str3와 str4은 가리키는 주소가 다르니까 다른것이다
		
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		if(str1==str2) {//조건을 충족하면 실행
			System.out.println("str1과 2는 일치한다");
		}
		else {//조건을 충족하지 않으면
			System.out.println("str1과 2는 일치하지 않는다");
		}
		
		System.out.println("-------------------");
		System.out.println("str3="+str3);
		System.out.println("str4="+str4);
		if(str3==str4) {//==는 주소를 비교 new 써서 둘이 주소가 다르니 달라
			System.out.println("str3과 4는 일치한다");
		}
		else {//조건을 충족하지 않으면
			System.out.println("str3과 4는 일치하지 않는다");
		}
		System.out.println("-------------------");
		
		if(str3.equals(str4)) {//equal은 값을 비교
			System.out.println("str3과 4는 일치한다");
		}
		else {//조건을 충족하지 않으면
			System.out.println("str3과 4는 일치하지 않는다");
		}
	}
}
