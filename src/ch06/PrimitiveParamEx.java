package ch06;

//기본형 매개변수와 참조형 매개변수(교재236p)

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data1 d = new Data1(); //객체생성 d에는 heap영역에 생성된 객체주소 저장
		d.x = 10;
		System.out.println("d.x : "+d.x);
		change(d.x); //static 함수는 static 함수만을 호출할수 있다
		System.out.println("after changed d.x : "+d.x);
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("changed d.x :"+x);
	}
}
class Data1 {
	int x; // 자동초기화 의해 x=0으로 초기화
}