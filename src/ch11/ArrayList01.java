package ch11;

import java.util.ArrayList;



public class ArrayList01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//객체를 추가
		list.add("홍길동");
		list.add("고길동");
		list.add("김길동");
		list.add("asdf");
		list.add(true);
		
		//저장된 객체의 총 수 조회
		int length = list.size();
		System.out.println(length);
		
		//객체 꺼내기 (조회)
		Object obj = list.get(0);
		
		//모든 데이터 꺼내기
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//향상된 for문 이용
		for (Object temp : list) {
			System.out.println((String)temp);
		}
		
		
		
		
		
	}
}
