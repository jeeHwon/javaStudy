package ch05;

//사용자 입력 받기 - 커맨드라인을 이용하면
//프롬프트창에서 실행시에는 >java Ex06 호잇쨔 읏짜 뽕짜
//이클립스 실행시에는 run configuration의 arguments 탭에서  입력(공백포함시 큰따옴표로 묶어야함)
public class Ex06 {

	public static void main(String[] args) {//진입함수
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println("---------------------");
		//함수호출 : 함수명(); 
		showMsg("예슈화","무한도전");
		showMsg();
		showMsg(5);
	}
	
	//메소드 함수 선언
	//함수종류 4개중에서 2개
	//메소드 오버로딩
	public static void showMsg(String name, String msg) {
		System.out.println(name+"씨 안녕하세요 "+msg);
	}
	
	public static void showMsg() {
		System.out.println("showMsg()메소드 호출성공");
	}
	
	public static void showMsg(int a) {
		System.out.println(a+"번타자");
	}
}
