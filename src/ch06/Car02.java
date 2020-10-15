package ch06;

//클래스 구성 멤버
//1. field : 객체의 데이터가 저장되는 곳
//[접근제어자] [속성] 데이터타입 변수명;
//2. constructor : 객체 생성시 초기화 역할 담당
//3. method : 객체의 동작에 해당되는 실행블록

//메소드 : 객체간의 데이터 전달 수단으로 사용

//메소드 선언문법
//[접근제어자] [속성] 리턴유형 메소드명(매개변수리스트){}

//참고
//선언부(=메소드 signature) : 리턴유형, 메소드명, 매개변수리스트
//실행부 : {}블럭안의 코드

//메소드 호출
//문법 : 메소드명([매개변수리스트]);


//메소드 종류
//1.리턴값도 없고 매개변수도 없는 메소드
//문법 : void 메소드명(){}
//예시 : void showMsg(){
//		syso("Hello");
//		}

//2. 리턴값도 없고 매개변수는 있는 메소드
//문법 : void 메소드명(매개변수리스트){}
//예시 : void add(int num1, int num2){
//		int result = num1 + num2;
//		syso(result);
//		}


//3. 리턴값 있지만, 매개변수도 없는 메소드
//문법 : 리턴유형 메소드명(){} 
//예시 : add(){
//		int result = 1+1;
//		return result;
//		}

//4. 리턴값 있고, 매개변수도 있는 메소드
//문법 : 리턴유형 메소드므명(매개변수리스트){} 
//예시 : Stirng upper(String str){
//		..
//		return 값;
//		}


public class Car02 {
	//field
	String company = "Lamborghini"; // 전역변수 : 클래스 영역에서 사용할 수 있다
	String model; //인스턴스 변수 : 인스턴스 생성 후 참조변수.인스턴스변수명으로 접근해야한다
	char color;
	int maxSpeed;
	static int wheel = 4; //클래스 변수, static 변수
	//인스턴스 생성없이 클래스이름.메소드명dmfh wjqrms
	//모든 인스턴스에서 공유되어 지는 값
		
	//method
	void abc() {
		System.out.println("abc안에서 접근 company : "+company);
	}
	void qwe() {
		System.out.println("qwe안에서 접근 company : "+company);
	}
}

