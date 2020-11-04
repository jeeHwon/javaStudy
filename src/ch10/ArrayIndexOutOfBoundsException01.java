package ch10;


//ArrayIndexOutOfBoundsException
//원인 : 배열(array)에서 인덱스 범위를 초과하여 사용한 경우
//해결방법 : 인덱스 범위를 초과하지 않게 하기 위해
//	배열값을 읽기 전에 배열의 길이를 먼저 조사한다
//	=> 실행 매개값이 없거나 부족한 경우 조건문을 이용해서 
//		사용자에게 실행방법을 알려준다
public class ArrayIndexOutOfBoundsException01 {

	public static void main(String[] args) {
		//해결방법
		if (args.length==2) {
			String data0 = args[0];	//ArrayIndexOutOfBoundsExc
			String data1 = args[1];
			
			System.out.println("args[0]="+data0);
			System.out.println("args[1]="+data1);
			
		}else {
			System.out.println("데이터를 2개 이상 입력하시오");
		}
		
		
		
		
	}

}
