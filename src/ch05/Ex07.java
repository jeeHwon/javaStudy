package ch05;

import java.util.Arrays;

//배열의 복사
public class Ex07 {

	public static void main(String[] args) {
		
		System.out.println("=====for문 이용한 배열복사=======");
		int[] oldArr1 = {1, 2, 3};
		int[] newArr1 = new int[10];
		newArr1[0] = 10;
		newArr1[1] = 30;
		newArr1[2] = 50;
		newArr1[3] = 70;
		System.out.println("배열복사전------------------");
		for (int temp: newArr1) {
			System.out.print(temp+" ");
		}
		
		
		System.out.println("\n배열복사후-----------------");
		//for문을 이용한 배열의 복사
		for (int i = 0; i < oldArr1.length; i++) {
			newArr1[i]= oldArr1[i];
		}
		for (int temp: newArr1) {
			System.out.print(temp+" ");
		}
		
		System.out.println("\n배열시험복사후-----------------");
		for (int i = 0; i < newArr1.length; i++) {
			newArr1[i]= oldArr1[i%(oldArr1.length)];
		}
		for (int temp: newArr1) {
			System.out.print(temp+" ");
		}
		
		System.out.println("\n\n======System.arraycopy() 이용한 배열복사======");
		int[] oldArr2 = {1, 2, 3};
		int[] newArr2 = new int[10];
		newArr2[0] = 10;
		newArr2[1] = 30;
		newArr2[2] = 50;
		newArr2[3] = 70;
		System.out.println("배열복사전------------------");
		for (int temp: newArr2) {
			System.out.print(temp+" ");
		}
		
		System.out.println("\n배열시험복사후-----------------");
		//System.arraycopy(Object src, srcPos, dest, destPos, length);
		//scr : 원본소스  원본배열명
		//scrPos : 원본소스 배열번호 인덱스 몇번째부터 가져와?
		//dest : 새배열명
		//destpos :새배열 덮어쓸 인덱스번호
		//length : 복사길이
		System.arraycopy(oldArr2,0, newArr2, 0, 3);
		
		for (int temp : newArr2) {
			System.out.print(temp+" ");
		}
		
		System.out.println("\n---------------------");
		
		int[] oldArr3 = {13, 14, 15};
		int[] newArr3 = new int[10];
		System.arraycopy(oldArr3,0, newArr3, 5, 3);
		for (int temp : newArr3) {
			System.out.print(temp+" ");
		}
		
		//Arrays : java.util패키지안에 존재하면서
		//배열과 관련된 여러기능을 제공하는 클래스이다
		//Arrays.toString(배열명) : 파라미터로 던진 배열안의 데이터를 문자열로 가져온다
		System.out.println("\n---------------------");
		System.out.println(Arrays.toString(newArr3));
	}
}
