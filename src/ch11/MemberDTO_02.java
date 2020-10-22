package ch11;

//MemberDTO_02 : 회원에 대한 정보를 다루는 순수 클래스
public class MemberDTO_02 {
	//field
	private String name; //이름
	private String ssn; //생년월일
	
	//constructor
	public MemberDTO_02() {	}
	public MemberDTO_02(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	//method
	//setter&getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	//회원명과 주민번호가 동일하면 동일 객체라고 설정
	@Override
	public boolean equals(Object obj) {
	//매개변수 obj 타입은 Object이므로 모든 클래스는 다 들어올 수 있다
	//따라서 MemberDTO_02 클래스의 객체이니? 부터 확인하자
	//매개변수 obj가 MemberDTO_02클래스의 instance 이니?
	//A instance of B : A가 B의 instance(객체)이면 true, 아니면 false
		//equals(Object obj) 메소드 재정의시
		//1.Object타입의 매개변수 obj에는 모든 객체가 매개값으로 제공될수 있으므로
		//	instanceof 연산자를 기준 객체와 동일타입인지 먼저 확인해야한다
		//2.비교객체가 동일한 타입이라면 기준 객체 타입으로 강제 타입변환
		//	해서 특정 필드값이 동일한지 비교
		if (obj instanceof MemberDTO_02) {//회원명과 주민번호가 동일하면 동일 객체이므로 true
			MemberDTO_02 member = (MemberDTO_02)obj;
			return (name.equals(member.name)) && (ssn.equals(member.ssn));
			//이름과 주민번호가 같으면 동일 객체이므로 true 리턴
			
		} else {//그렇지 않으면 false
			return false;
			
		}
	}
	@Override
	public int hashCode() {
		//name과 ssn 값이 같으면 동일한 hashCode가 리턴되게끔
		return name.hashCode()+ssn.hashCode();
		//여기에서는 name이 String이므로 name.hashCode()는
		//String클래스의 hashCode()를 이용
	}
	
}



