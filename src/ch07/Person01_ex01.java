package ch07;
public class Person01_ex01 {
	public static void main(String[] args) {
		Person01 p1 = new Person01("123", "jenny");
		p1.name = "jisoo";	
		System.out.println("p1.nation : "+p1.nation);
		System.out.println("p1.ssn: "+p1.ssn);
		System.out.println("p1.name : "+p1.name);
	}
}
