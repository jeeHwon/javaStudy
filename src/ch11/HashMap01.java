package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//HashMap
//key, value가 한 pair 구성
//추가 : put(Object key,Object value) //key값은 중복되면 안되므로
//찾기 : Object get(Object key)	//보통 object 대신 String으로 넣는다
//삭제 : remove(Object key)

public class HashMap01 {
	public static void main(String[] args) {
		//Map 생성
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		//객체저장
		map.put("jolly",20); //20은 int가 아니라 Integer 타입의 객체
		map.put("jelly",20); //value는 중복 허용 하므로 객체 저장
		map.put("jully",40);
		map.put("jully",50); //key는 중복 안해, 나중애가 덮어버려
		System.out.println("map.size()="+map.size()); //3 key값 동일
		
		//특정객체찾기
		Integer x = map.get("jully"); 
		System.out.println(x); //50
		
		//map.get("jully")하면 여기에서는 Integer로 리턴받지만
		//int 타입의 변수에 저장할 수 있는 이유는
		//auto unboxing 되기 때문이다
		int y = map.get("jully");
		System.out.println(y); //50
		
		//Map에 저장된 모든 객체 출력 - keySet 이용
		//value를 가져오기 위해서는 먼저 key를 알아야 한다
		//keySet() : 모든 키를 Set 컬랙션으로 받을 수 있다
		
		//keySet()을 이용해서 Set 컬랙션으로 받고
		Set<String> keys = map.keySet();
		
		Iterator<String> iter = keys.iterator(); //반복자 얻기
		while (iter.hasNext()) {
			//받은 개별key를 이용해서 get()통해 값을 얻기
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println(key+value);
			
		}
		//특정객체 제거 : remove(Object key)
		map.remove("jolly");
		System.out.println("map.size()="+map.size()); //2
		System.out.println("entry 출력-------------------------");
		
		//전체 객체 출력-entrySet 이용
		//Set<Entry<String, Integer>> entrySet()
		//Set entrySet() 	위를 줄이면 이형태가 된다
		//entrySet()을 통해 set 컬렉션을 얻고
		Set<Entry<String, Integer>> set = map.entrySet(); 
		//set 컬렉션에서 제공되는 반복자를 통해 Map.Entry하나씩 얻고
		Iterator<Entry<String, Integer>> iter1 = set.iterator();
		while (iter1.hasNext()) {
			Entry<String, Integer> entry = iter1.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key: "+key+" value: "+value);
		}
		
		System.out.println("m1-------------------------");

		MemberDTO_02 m1 = new MemberDTO_02("b", "11");
		System.out.println(m1.getName().hashCode());
		System.out.println(m1.getSsn().hashCode());
		System.out.println(m1.hashCode());
		System.out.println("m2-------------------------");
		
		MemberDTO_02 m2 = new MemberDTO_02("a", "12");
		System.out.println(m2.getName().hashCode());
		System.out.println(m2.getSsn().hashCode());
		System.out.println(m2.hashCode());
		System.out.println("-------------------------");
		
		System.out.println(m1.hashCode()==m2.hashCode());
		
	}

}



