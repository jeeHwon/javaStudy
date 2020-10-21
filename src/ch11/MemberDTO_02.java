package ch11;

//MemberDTO_02 : 회원에 대한 정보를 다루는 순수 클래스
public class MemberDTO_02 {
	//field
	private String name; //이름
	private String birth; //생년월일
	
	//constructor
	public MemberDTO_02() {	}
	public MemberDTO_02(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}
	//method
	//setter&getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	//회원명과 주민번호가 동일하면 동일 객체라고 설정
//	@Override
//	public boolean equals(Object obj) {
//	//매개변수 obj 타입은 Object이므로 모든 클래스는 다 들어올 수 있다
//	//따라서 MemberDTO_02 클래스의 객체이니? 부터 확인하자
//	//매개변수 obj가 MemberDTO_02클래스의 instance 이니?
//	//A instance of B : A가 B의 instance(객체)이면 true, 아니면 false
//		if (obj instanceof MemberDTO_02) {//회원명과 주민번호가 동일하면 동일 객체이므로 true
//			return true;
//		} else {//그렇지 않으면 false
//			return false;
//			
//		}
//	}
	
}



