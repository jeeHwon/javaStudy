package ch11;

import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(100);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		System.out.println(ts.lower(99)); //99보다 아래인 수 40
		System.out.println(ts.higher(100)); //100보다 위인 수 null
		
		System.out.println(ts.first()); //10
		System.out.println(ts.last()); //100
		
		System.out.println(ts.floor(35));//30과 동일or 바로 아래 30
		System.out.println(ts.ceiling(35));//30과 동일or 바로 위 40
		
		
		Integer num = null; //Integer 는 클래스 타입이므로 초기값 null
				
		while (!ts.isEmpty()) {
			num = ts.pollFirst(); //가장 낮은값 꺼내고 제거
			System.out.println(num);
			
		}
		
	
	}

}

