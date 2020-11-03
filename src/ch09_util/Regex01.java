package ch09_util;

import java.util.regex.Pattern;

//정규식(Regular Expression)
//Pattern 클래스
public class Regex01 {
	
	
	public static void main(String[] args) {
		String tel = "010-1234-5678";
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		//02|010  => 02 또는 010
		//  -     => -문자
		//  \d    => digit을 의미. [0-9]와 동일
		// {3,4}  => 3~4자리
		// \d{3,4}=> 숫자가 최소 3글자~최대 4글자 가능
		// {4} 	  => 4자리
		
		boolean result = Pattern.matches(regExp, tel);
		if (result) {
			System.out.println("일치!");
		} else {
			System.out.println("정규식과 불일치");
		}
		
		String email = "jee456@gmail.com";
		String regExp2 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		//   \w   => [A-Za-z0-9] 알파벳대소문자, 숫자
		//    +   => 1번 이상
		//   \w+  => 알파벳 또는 숫자가 1번이상 
		//   @    => @문자
		//  \.    => .문자
		//   ? 	  => 0번 또는 1번
		//(\\.\\w+)?  => .enldp 알파벳 또는 숫자 1개이상으로 된 문자가 0또는 1번
		
		boolean result2 = Pattern.matches(regExp2, email);
		if (result2) {
			System.out.println("일치!");
		} else {
			System.out.println("정규식과 불일치");
		}
		
		
	}

}
