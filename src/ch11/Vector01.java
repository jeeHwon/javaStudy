package ch11;

import java.util.Vector;

//Vector
public class Vector01 {

	public static void main(String[] args) {
		Vector vt1 = new Vector();
		System.out.println("vt1.capacity()="+vt1.capacity());
		System.out.println("vt1.size()="+vt1.size());
		//객체를 삽입
		for (int i = 1; i < 11; i++) {
			vt1.add("제목"+i); //25개의 객체가 삽입되면서
			//초기 capacity 10 -> 제목1,2,..10 => size 10
			//초기 capacity 다 채우고 나서 2배로 증가되어 capacity 20
		}
		System.out.println("vt1.capacity()="+vt1.capacity());
		System.out.println("vt1.size()="+vt1.size());
		System.out.println("==========================");
		
		for (int i = 0; i < vt1.size(); i++) {
			Object obj = vt1.get(i);
			System.out.println(obj);
		}
		
		
		Vector vt2 = new Vector(50);
		System.out.println("vt2.capacity()="+vt2.capacity());
		System.out.println("vt2.size()="+vt2.size());
		for (int i = 1; i < 103; i++) {
			vt2.add("내용"+i); 
		}
		
		System.out.println("vt2.capacity()="+vt2.capacity());
		System.out.println("vt2.size()="+vt2.size());
		System.out.println("==========================");

	}

}
