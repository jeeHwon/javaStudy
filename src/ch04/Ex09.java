package ch04;

//break
public class Ex09 {

	public static void main(String[] args) {
		int sum = 0, i = 0;
		while (true) {
			i++;
			sum += i;  //sum = sum + i;
			if (i>10) {
				break;
			}
		}
		System.out.println("i : "+i);
		System.out.println("sum : "+sum);
	}
}
