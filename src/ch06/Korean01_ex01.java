package ch06;

//Korean01 class의 객체를 생성하여 실행하는 클래스
public class Korean01_ex01 {

	public static void main(String[] args) {
		//클래스명 변수명 = new 클래스명()
		Korean01 k1 = new Korean01(); //기본생성자 호출 위치
		k1.name = "Ji";
		k1.ssn = "910718-1234567";
		k1.age = 28;
		
		
		//필드값을 출력
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k1.age);
		k1.sex();
		
		System.out.println("-------------------------");
		//매개변수 1개 생성자 호출
		Korean01 k2 = new Korean01("Lee");
		System.out.println("-------------------------");
		//매개변수 2개 생성자 호출
		Korean01 k3 = new Korean01("Hong","980123-4567897" );
		System.out.println("-------------------------");
		//매개변수 3개 생성자 호출
		Korean01 k4 = new Korean01("Kim", "950326-2261123", 26);
		System.out.println("-------------------------");
		System.out.println("국적 "+k4.nation);
		System.out.println("성명 "+k4.name);
		k4.sex();
		k4.birthday();
		
		Korean01 k5 = new Korean01("Park", "880818-2261123");
		k5.auto();
		k5.setName("박"); //k5 객체 이름 변경하기
		k5.auto();
	}
}


