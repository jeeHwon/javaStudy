package ch10;

import java.text.MessageFormat;

//MessageFormat
public class MessageFormat01 {

	public static void main(String[] args) {
		//출력할 때
		//회원 id : 
		//회원명 : 
		//연락처 :
		
		String id = "IU";
		String name = "이지은";
		String tel = "010-2020-4032";
		String frm = "회원id : {0} \n회원명 : {1}\n연락처 : {2}";
		String result = MessageFormat.format(frm, "ssamjjang", name, tel);
		
		System.out.println(result);
		
		String sql = "insert into dept values({0},{1},{2})";
		Object[] arguments = {"10","도시어부","마라도"};
		String result2 = MessageFormat.format(sql, arguments[0],arguments[1],arguments[2]);
		System.out.println(result2);
	}

}
