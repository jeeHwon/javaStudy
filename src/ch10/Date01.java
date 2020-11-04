package ch10;

import java.text.SimpleDateFormat;
import java.util.Date;

//java.util.Date클래스 
public class Date01 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("new Date()="+now);	//KST(=KoreaStandardTime)
		System.out.println("new Date()="+now.toString());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyy!@#$a%^m&m*()_");
		
		String strNow1 = sdf1.format(now);
		String strNow2 = sdf2.format(now);
		String strNow3 = sdf3.format(now);
		
		System.out.println(strNow1);
		System.out.println(strNow2);
		System.out.println(strNow3);
		
		sdf1 = new SimpleDateFormat("오늘은 E요일");
		strNow1 = sdf1.format(now);
		System.out.println(strNow1);
		
		sdf1 = new SimpleDateFormat("오늘은 올해의 D번째 날");
		strNow1 = sdf1.format(now);
		System.out.println(strNow1);
		
		sdf1 = new SimpleDateFormat("오늘은 이번주의 d번째 날");
		strNow1 = sdf1.format(now);
		System.out.println(strNow1);
		
	}

}
