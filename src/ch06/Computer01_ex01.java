package ch06;

public class Computer01_ex01 {

	public static void main(String[] args) {
		Computer01 c = new Computer01();
		int[] arr1 = {1,2,3,4,5}; //배열변수 선언
		System.out.println(c.sum(arr1)); //메소드 호출
		System.out.println(c.sum1(1,2,3,4,5,6));
		System.out.println(c.sum(new int[] {1,2,3,4,5,6,7}));
	}
}