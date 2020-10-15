package ch07;

//import java.util.Date; import 패키지명.클래스명;
//import java.util.Random;
import java.util.*; //util패키지 안에 속한 모든 클래스를 import 한다
//단 util 패키지 안의 하위 패키지 클래스는 제외한다

//package와 import
public class Ex01 extends Object{

	public static void main(String[] args) {
		Date today = new Date();//import하지 않으면 컴파일에러
		System.out.println("today :"+today);
		System.out.println(new Random().nextInt());
	
		Ex01 e1 = new Ex01();
		Ex01 e2 = new Ex01();
		//모든 클래스의 최고조상 클래스는 Object 클래스이다
		//따라서 모든 클래스는 Object 클래스가 가진 method를 사용가능
		//equals() method 문법 : 참조변수.equals(Object obj)
		//Ex01 클래스를 각각 new해서 참조변수 e1과 e2에 주소를 할당
		//객체는 new 할때마다 서로 다른 주소지가 생기므로 
		//참조변수 e1과 e2에 저장된 주소는 다르므로 
		//두개의 참조변수의 주소가 같은지 비교하니 false가 나옴
		//이때 주소지를 비교하는 equals()는 Object 클래스로부터
		//상속받은 method를 사용한것
		System.out.println(e1.equals(e2));
	}
}


