package ch06;

public class ReferenceParmEx {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		change(d);
		System.out.println("after change d.x : "+d.x);
	}
	
	static void change(Data2 k) {
		k.x = 1000;
		System.out.println("changed d.x : "+ k.x);
	}
}

class Data2 {
	int x;
}

