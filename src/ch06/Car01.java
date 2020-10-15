package ch06;

import java.util.Date;

//자동차에 대한 속성과 기능을 가진 클래스
//클래스 : 속성 (Field), 기능(Method)
public class Car01 {
	
		//속성(field) -> 변수선언(클래스의 구성 member는 필드와 메서드)
		//[접근제한자] : [속성] 데이터타입 변수명;
		//예시) 자동차 속성 : 색상, 제조사, 가격, 최고속도, 제조날짜
		//고유데이터 : 색상, 제조사, 가격, 최고속도, 제조날짜..
		String color = "White"; //색상 : 빨강, 주황..
		String maker = "Porsche"; //제조사 : 포르쉐, 벤츠..
		int price; //가격 : 5000, 6500...
		double maxSpeed; //최고속도 : 280, 300..
		Date makeDate = new Date(); //제조날짜
		
		//상태데이터 : 현재속도, 엔진회전수
		int speed; //현재속도
		int rpm; //엔진회전수
		
		//부품 - 또 다른 클래스도 필드로 사용할 수 있다
		//Engine engine;
		//Tire tire;
		
		//생성자(constructor)
		
		
		//기능(method)
		//[접근제한자] [속성] 리턴유형 함수명(매개변수리스트){}
		// 생략가능 제외하고 리턴유형 void 로 한다
		//예시) 자동차 기능 : 가속, 감속
		//가속 : 0 1 2 3 4 5
		void move() {
			System.out.println("move() 호출 성공!");
		}
		//감속 : 5 4 3 2 1 0
		void stop() {
			System.out.println("stop() 메소드 호출 성공!");
		}
		
		//객체의 속성값을 가져오기(get) : 참조변수명.속성명
		//속성값을 변경하기(set) : 참조변수명.속성명 = 새값;
		//메소드 호출 : 참조변수명.메소드명();
		//클래스사용 : 클래스로부터 객체생성
		//클래스명 참조변수명; 
		//참조변수명 = new 클래스명();
		//또는
		//클래스명 참조변수명 = new 클래스명();
}

