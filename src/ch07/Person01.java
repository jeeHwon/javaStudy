package ch07;
//final 필드 : 초기값이 저장되면 최종적인 값이 된다. 
//프로그램 실행도중 변경불가
//문법 => [접근제어자] final 데이터타입 변수명[=초기값];
//사람
public class Person01 {
	//field : [접근제어자][속성] 데이터타입 변수명 [= 초기값];
	final String nation = "Korea";
	final String ssn; // 가능 대신 생성자로 강제해야해
	String name;
	
	//constructor : [접근제어자] 클래스명 (){}
	//Person01(){} //컴파일에러, 생성자는 final필드의 최종 초기화를 마쳐야함
	Person01(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
	//method : [접근제어자][속성] 리턴유형 메서드명 (){}
}
