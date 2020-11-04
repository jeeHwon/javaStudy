package ch10;

import java.util.Calendar;

//java.util.Calendar 클래스
//Calendar 클래스는 달력을 표현한 클래스이다
//추상(abstract)클래스이므로 new 연산자를 사용해서 인스턴스를 생성할 수 없다
//그 이유는 날짜와 시간을 계산하는 방법이 나라, 지역에 따라 다르기 때문
//꼭 필요한 메소드들만 선언되어 있고, 계산로직은 하위클래스에서 구현하도록 되어있다
//getInstance()를 이용해서 현재 운영체제에 설정되어 있는 시간대(TimeZone)를 
//	기준으로 객체를 얻을 수 있다

public class Calendar01 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY : strWeek = "월"; break;//2
		case Calendar.TUESDAY : strWeek = "화"; break;//3
		case Calendar.WEDNESDAY : strWeek = "수"; break;//4
		case Calendar.THURSDAY : strWeek = "목"; break;//5
		case Calendar.FRIDAY : strWeek = "금"; break;//6
		case Calendar.SATURDAY : strWeek = "토"; break;//7
		default: strWeek = "일"; //1
		}
		int day = now.get(Calendar.DAY_OF_MONTH);
		int ampm = now.get(Calendar.AM_PM);	//0은 오전, 1은 오후
		String strAmpm = null;
		if (ampm==0) {
			strAmpm = "오전";
		} else {
			strAmpm = "오후";
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.printf("%s  %d:%d:%d", strAmpm,hour,minute,second);
		System.out.println();
		System.out.println(strWeek);
		
		
	}

}
