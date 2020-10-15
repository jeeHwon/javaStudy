package ch11;

import java.util.ArrayList;

import ch07.Car01;

//모든 객체를 추가할 수 있다
public class ArrayList00 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		
		//다양한 종류의 객체 추가
		list.add("문자열"); //String
		list.add(1); //int의 클래스인 Integer
		list.add(true); //boolean의 클래스인 Boolean
		list.add(Math.PI); //double 의 클래스인 Double
		list.add('A'); //char의 클래스인 Char
		list.add(new Car01()); //Car01

		//출력
		for (Object temp : list) {
			System.out.println(temp);
		}
		
		
		
		
		
	}
	
}
