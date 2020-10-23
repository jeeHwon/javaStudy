package ch11;

import java.util.Iterator;
import java.util.TreeSet;

//PersonDTO에서 재정의된 compareTo() 메서드를 이용하여
//나이순으로 정렬하는 클래스이다
//사용자 정의 객체를 나이순으로 정렬
public class PersonDTO_ex {

	public static void main(String[] args) throws Exception {
		//TreeSet 준비
		TreeSet<PersonDTO> ts = new TreeSet<PersonDTO>();
		
		//PersonDTO 객체 추가
		//저장될 때 나이순으로 정렬됨
		ts.add(new PersonDTO("김연아", 31));
		ts.add(new PersonDTO("손흥민", 27));
		ts.add(new PersonDTO("박지성", 38));
		ts.add(new PersonDTO("이영표", 38));
		ts.add(new PersonDTO("김연경", 34));
		ts.add(new PersonDTO("엄용수", 27));
		
		//왼쪽 마지막노드에서 오른쪽 마지막노드까지 반복해서 가져온다
		//이진 검색트리는 부모보다 작은값을 왼쪽에, 큰 값을 오른쪽에 저장
		Iterator<PersonDTO> iter = ts.iterator();
		while (iter.hasNext()) {
			PersonDTO p = iter.next();
			System.out.println(p);
		}
		
	}

}
