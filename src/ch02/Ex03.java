package ch02;

//기본타입(Primitive type) => 원시타입 8가지 암기
//기본타입이란 정수, 실수, 문자, 논리, 리터럴을 직접 저장하는 타입
//정수 : byte(1) < short(2) < int(기본, 4byte) < long(8)
//실수 : float(4) < double(기본, 8byte)
//문자 : char(2)
//논리 : boolean(1)

//메모리에는 0과 1을 저장하는 최소 기억단위인 bit가 있다
//8bit = 1byte
//기본 타입은 정해진 메모리 사용크기(바이트크기)로 값을 저장
//=> 크기가 클수록 표현하는 값의 범위가 크다
//정수 < 실수
//byte(1) < short(2) < int(기본, 4byte) < long(8) <float(4) < double(기본, 8byte)
public class Ex03 {

	public static void main(String[] args) {
		//byte -2^7 ~ 2^7-1
		//byte -128 ~ 127
		byte b1 = -128;
		byte b2 = 0;
		//byte b3 = 128; error 발생 , 저장 범위 초과
		//저장 범위 초과 해서 값이 저장될 경우에는 엉터리값 저장됨
		//=>쓰레기값 발생
		System.out.println(b1);
		System.out.println(b2);
		
		byte b4 = 125;
		for(int i=0; i<5; i++) { //for문 : 반복실행
			b4++;
			System.out.println(i+"번째일때 b4 값은"+b4);
		}
		//정수의 overflow
		//126 127 다음 -128이 출력된다 => 쓰레기값
		//최대값 다음에 한칸 늘어나면 다시 최소값으로 돌아가니까
		
		
	}

}
