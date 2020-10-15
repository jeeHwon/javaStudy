package ch02;

//연산식에서의 자동타입 변환
public class Ex06 {

	public static void main(String[] args) {
		//boolean(1) < char(2) < byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		byte b1 = 10;
		byte b2 = 20;
		//byte b3 = b1 + b2; error 발생 
		//연산식에서 바이트변수가 자동으로 int형으로 변환됨
		//int보다 작은 타입(char, byte, short)이 연산에 사용되면 int로 변환된다
		byte b4 = (byte)(b1+b2);
		System.out.println(b4);

		char c1 = 'A';
		char c2 = 1;
		char c3 = (char)(c1+c2);
		System.out.println(c3);
		int a1 = c1;
		System.out.println(a1);
		
		int i4 = 10;
		int i5 = i4/4; //10을 4로 나눈 몫이 int 타입 변수 i5에 저장
		//몫은 2.5로서 실수형이지만 정수 int에 저장되면서 값 손실 발생
		System.out.println(i5);
		
		int i6 = 10;
		//int i7 = 10/4.0; error 발생 / 정수랑 실수랑 만나면 큰 실수로 된다
		//연산식에 실수리터럴이나 double타입이 있다면 
		//다른 피연산자도 double 타입으로 자동변환된다
		int i8 = (int)(14/3.0);
		System.out.println(i8);
		
		int i9 = 128;
		byte by1 = (byte)i9;
		System.out.println(by1);
		
		
	}

}
