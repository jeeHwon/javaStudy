package ch11;

import java.util.HashSet;
import java.util.Set;

//MemberDTO_02 객체를 중복없이 Set에 저장하는 실행클래스
public class HashSet02_ex {

	public static void main(String[] args) {
		//조상클래스명 참조변수 = new 자손클래스();
		Set<MemberDTO_02> set = new HashSet<MemberDTO_02>();
		MemberDTO_02 m1 = new MemberDTO_02("rose", "1111");
		MemberDTO_02 m2 = new MemberDTO_02("rose", "1111");
		
		//기준이 되는 m1이 매개변수 m2와 동일하니?
		System.out.println(m1.equals(m2));//false->오버라이딩해서true
		//1. add 들어갈 때 중복체크해서 들어간다면 굳이 equals와 hash쓸필요가
		//2.hashCode() 리턴값 : true -> equals()리턴값 : false -> ???
		//3. hash가 더해서 같아질수도?
		
		
		set.add(new MemberDTO_02("lisa", "961203"));
		set.add(new MemberDTO_02("rose", "950123"));
		set.add(new MemberDTO_02("rose", "950123"));
		//인스턴스는 다르지만 내부 데이터가 동일하므로 동일객체로 판단되어
		//총 객체수는 2
		
		System.out.println("총 객체수="+set.size());//2
		
	}

}

