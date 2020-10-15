package ch03;

//연결연산자
//문자열과 숫자가 혼합된 +연산식은 왼쪽에서 오른쪽으로 연산이 진행
public class Ex04 {

	public static void main(String[] args) {
		System.out.println('j');
		System.out.println("jdk"+8.0); 
		//"jdk" + "8"  -> "jkd8" 숫자도 string 형태로 됨
		String str = "JDK" + 8.0 + 5.0;
		System.out.println(str); //문자열 뒤에 있는 애들은 다 문자가 된다
		String str2 = 8.0 + 5.0 + "JDK" + 8.0 + 5.0;
		System.out.println(str2); //문자열 나오기 전까진 숫자가 문자열화 되진 않는다
		System.out.println("JDK" + (8.0 + 5.0));
	}
}
