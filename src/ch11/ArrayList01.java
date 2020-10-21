package ch11;

import java.util.ArrayList;
//ArrayList 클래스
//데이터의 저장공간으로 배열을 사용한다(배열기반)
//객체를 추가하면 인덱스 0부터 차례대로 저장된다
//특정 인덱스의 객체를 제거하면 바로 뒤 인덱스부터 마지막 인덱스까지
//모두 1씩 당겨진다(.remove)
//특정 인덱스의 객체를 추가하면 해당 인덱스부터 마지막 인덱스까지
//모두 1씩 뒤로 밀려난다(.add)
//(중간)객체를 제거, 삭제가 빈번한 경우엔 처리속도가 더디므로..
// => LinkedList 사용한다
public class ArrayList01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//객체를 추가
		list.add("홍길동");
		list.add("고길동");
		list.add("김길동");
		list.add("정길동");
		list.add("박길동");

		//저장된 객체의 총 수 조회
		int length = list.size();
		//System.out.println(length);
		
		//객체 꺼내기 (조회)
		Object obj = list.get(0);
		
		//특정인덱스에 있는 객체 삭제 : remove
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list.get(0));
		list.add(0, "춉길동");
		System.out.println(list.get(0));
		System.out.println("----------------");
		
		//모든 데이터 꺼내기
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		//향상된 for문 이용
		for (Object temp : list) {
			System.out.println(temp);
		}
		
		
		
	}
}
