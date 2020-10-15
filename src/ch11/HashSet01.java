package ch11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet01 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		//객체를 추가
		set.add("홍길동");
		set.add("고길동");
		set.add("김길동");
		set.add("윤길동");
		set.add("지길동");
		
		//저장된 객체의 총 수 조회
		int length = set.size();
		System.out.println(length);
		
		//객체 꺼내기 (조회) - List 에서는 Object get(index)
		//Set 에서는 Iterator iterator()
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			Object temp = iter.next();
			System.out.println(temp);
		}
		
		//모든 데이터 꺼내기
		//향상된 for문 이용
		for (Object temp : set) {
			System.out.println(temp);
		}

		
		
	}
}
