package ch06;

//정적멤버 - 클래스변수, 클래스메서드(static method) 사용
//클래스변수 : 같은 클래스의 모든 인스턴스들이 공유하는 변수
//클래스메서드 : 인스턴스 변수나 인스턴스 메서드와 관련없는 작업을 하는 메서드
//메서드 내에서 인스턴스변수를 사용하지 않는다면 static 붙이는 것 고려!
public class Calculator03 {

	//field : [접근제어자] [속성] 데이터타입 변수명;
	static double pi = 3.141592; 
	// pi는 객체마다 서로 다르지 않고 공통된 데이터 사용하므로 static 변수선언
	static double swbirthday = 7.18;
	
	//constructor : [접근제어자] [속성] 클래스명 (){}
	
	//method : [접근제어자] [속성] 리턴유형 메서드명(매개변수리스트){}
	//plus minus 기능은 외부에서 함수를 호출할 때 주어진 매개값을 가지고
	//계산을 하므로 인스턴스 변수 필요없어서 static 메서드로 선언하였다
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
}

