package ch05;

//배열선언과 생성
public class Ex02 {

	public static void main(String[] args) {
		//정수 5개를 저장하기 위한 배열변수 jumsu 선언과 생성
		/*
		int[] jumsu;
		jumsu = new int[5];
		*/
		//간단하게 표현하면 아래와 같음
		int[] jumsu = new int[5];
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(jumsu[i]);//자동초기화 => 여기에서는 int타입은 0
		}
		
		double[] point = new double[5];
			for (int i = 0; i < point.length; i++) {
				System.out.println(point[i]);//자동초기화 => 여기에서는 double타입은 0.0
			}
			
		//string 타입 데이터 3개를 저장하기 위한 names배열변수 선언한 후 출력
		String[] names = new String[3];
		for (String i : names) {
			System.out.println(i);//string같은 class의 기본값은 null
		}
		String[] abcsStrings = new String[3];
		abcsStrings[0] = "A";
		abcsStrings[1] = "B";
		abcsStrings[2] = "C";
		
		for (int i = 0; i < abcsStrings.length; i++) {
			System.out.println(abcsStrings[i%2]);
		}
	}
}
