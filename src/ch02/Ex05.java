package ch02;

//타입 byte(1) < short(2) < int(4) < long(8)
public class Ex05 {

	public static void main(String[] args) {
		/*
		int v = 10;
		long v0 = 10; //int형 10데이터가 long 타입 벼누로 자동형변환
		long v1 = 10l;
		long v2 = 10L;
		
		//long타입 변수를 초기화 할때는 정수값 뒤에 소문자 또는 대문자 L을 붙일수있다
		//4byte 정수 데이터가 아니라 8byte 정수 데이터임을 알려준다
		//int 타입의 저장범위를 넘어서는 큰 정수에서는 l, L을 붙여야 한다(우주,은행)
		
		System.out.println(v);
		System.out.println(v0);
		System.out.println(v1);
		System.out.println(v2);
		*/
		
		//자료형 변환 : 작은 크기타입이 큰 크기타입으로 저장될때
		byte b1 = 10;
		int i1 = b1;
		System.out.println(i1); //10
		
		char c1 = '가';
		i1 = c1; //위에서 int = i1 으로 선언해 줬기 때문에 다시 해주면 안돼
		System.out.println(i1); //'가'
		
		i1 = 500;
		long l1 = i1;
		System.out.println(i1); //500
		
		i1 = 200;
		double d1 = i1;
		System.out.println(i1); //
		
		//강제형 변환 : 큰 크기의 데이터를 작은 크기 타입으로 강제로 저장할때
		//작은타입 변수 = (강제형변환)변수;
		//값의 손실이 발생될수 있으므로 주의
		int i2 = 44032;
		char c2 = (char)i2;
		System.out.println(i2);
		System.out.println(c2);
		
		long l2 = 50000000;
		i2 = (int)l2;
		System.out.println(l2);
		
		double p =3.14;
		float f = (float)p;
		System.out.println(f);
		i2 = (int)p;
		System.out.println(i2); //3 값의 손실
		
		//음수 10.0을 정수변수에 할당
		double d2 = -10.0;
		int i3 = (int)d2;
		System.out.println(i3);
		System.out.println(d2);
		
		float f2 = (int) -10.0;
		System.out.println(f2);
	
		
	}

}
