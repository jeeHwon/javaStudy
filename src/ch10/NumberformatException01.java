package ch10;

//NumberformatException
//문자열로 되어 있는 데이터를 숫자로 변경할 때 발생 가능
//Integer.parseInt(문자열) : 문자열을 정수로 변환
//Double.parseDouble(문자열) : 문자열을 실수로 변환

public class NumberformatException01 {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);//runtime error
		//발생이유 : a100 문자열은 숫자로 변환 할 수 없기 때문
		
		System.out.println(value1+value2);
	}

}
