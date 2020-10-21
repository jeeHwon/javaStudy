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
		System.out.println(m1.equals(m2));

		
		
//		set.add(new MemberDTO_02("rose", "950123"));
//		set.add(new MemberDTO_02("lisa", "961203"));
//		set.add(new MemberDTO_02("rose", "970403"));
//		
//		System.out.println("총 객체수="+set.size());//3
		
	}

}

