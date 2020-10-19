package jdbc;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		double pi = 3.149;
		System.out.println(pi*100);
		
		System.out.println(Math.round(pi*100)); //3
		System.out.println(Math.round(pi*100)/100.0);//3.14
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
	}

}
