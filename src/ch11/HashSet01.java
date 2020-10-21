package ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet01 {
	public static void main(String[] args) {
		//HashSet set = new HashSet();
		HashSet<String> set = new HashSet<String>();
		
		//객체를 추가
		set.add("홍길동");
		set.add("고길동");
		set.add("김길동");
		set.add("윤길동");
		set.add("지길동");
		set.add("지길동"); //중복 허용x
		
		//저장된 객체의 총 수 조회
		int length = set.size();
		System.out.println(length);
		
		//객체 꺼내기 (조회) - List 에서는 Object get(index)
		//Set 에서는 Iterator iterator()
		//모든 데이터 꺼내기 : 추가한 데이터순서가 유지되지 않은상태로 출력
		//Iterator iter = set.iterator();
		//while (iter.hasNext()) {//다음 요소(객체)가 존재하는 동안 =>객체수만큼 반복
		//	Object temp = iter.next();//Object next():다음 요소(객체)를 가
		//	System.out.println(temp);
		//}
		
		//객체삭제 remove(Object)
		set.remove("윤길동");
		set.remove("윤"); //오류는 안나네
		set.remove("지길동");
		
		//모든 데이터 꺼내기
		//향상된 for문 이용
		for (Object temp : set) {
			System.out.println(temp);
			}
		
		//모든 객체를 제거하고 비운다
		set.clear();
		System.out.println(set.size());
		
		//isEmpty : 객체가 없으면 true 반환
		if (set.isEmpty()) System.out.println("empty");
		
		
				
		
	}
}
