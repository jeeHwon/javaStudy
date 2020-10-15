package ch04;

//switch문
/*
switch (조건식) {
case "값1": 
	실행코드;
	break;
case "값2": 
	실행코드;
	break;	
default:
	실행코드;
	break;
*/
public class Ex01 {

	public static void main(String[] args) {
		String bunho = "011";
		switch (bunho) {
			case "011":
			case "017":
				System.out.println("SK");
				break;
			case "016":
			case "018":
				System.out.println("KTF");
				break;
			case "019": 
				System.out.println("LG");
				break;	
			default:
				System.out.println("etc");
				break;
		}
	}
}

