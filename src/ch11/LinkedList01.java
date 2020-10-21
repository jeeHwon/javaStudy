package ch11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//LinkedList
//배열과 달리 링크드 리스트는 불연속적으로 존재하는 데이터를 연결
//ArrayList는 내부배열에 객체를 저장해서 index로 관리
//LinkedList는 인접참조를 link해서 체인처럼 관리
//LinkedList에서 특정 인덱스의 객체를 제거하면 앞뒤 링크만 변경되고 나머지는 변경x
//특정 인덱스의 객체를 삽입하면 앞뒤 링크만 변경되고 나머지는 링크 변경x
//따라서 빈번한 객체 삭제와 삽입이 일어나는 곳에서는
//ArrayList보다 LinkedList가 좋은 성능을 발휘


public class LinkedList01 {

	public static void main(String[] args) {
		// ArrayList와 LinkedList의 실행성능 비교
		//실행시간 = 종료시간=시작시간
		long startTime;
		long endTime;
		
		//ArrayList
		List<String> al = new ArrayList<String>();
		List<String> ll = new LinkedList<String>();
		startTime = System.nanoTime();//시작시간
		for (int i = 0; i <100000; i++) {
			//add(int index, Object value)
			//String 클래스의 valueOf(Object value) : 
			//	object 값을 String으로 변환하는 함수
			al.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();//종료시간
		System.out.println("ArrayList 실행시간="+(endTime-startTime));
		System.out.println("====================");
		
		//LinkedList
		startTime = System.nanoTime();//시작시간
		for (int i = 0; i <100000; i++) {
			//add(int index, Object value)
			//String 클래스의 valueOf(Object value) : 
			//	object 값을 String으로 변환하는 함수
			ll.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();//종료시간
		System.out.println("LinkedList 실행시간="+(endTime-startTime));

	}

}
