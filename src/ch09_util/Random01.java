package ch09_util;

import java.util.Arrays;
import java.util.Random;

public class Random01 {

	public static void main(String[] args) {
		//번호선택
		//1~45범위의 숫자 6개
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.print("번호선택 : ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
		}
		Arrays.sort(selectNumber);
		for (int i = 0; i < selectNumber.length; i++) {
			System.out.print(selectNumber[i]+" ");
			
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6];
//		System.out.println("new Random()="+random.nextInt());
//		System.out.println("new Random()="+random.nextBoolean());
//		System.out.println("new Random()="+random.nextDouble());
		
		System.out.println("--------------------------");
		System.out.print("당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45)+1;
		}
		Arrays.sort(winningNumber);
		for (int i = 0; i < winningNumber.length; i++) {
			System.out.print(winningNumber[i]+" ");
			
		}
		System.out.println();
		
		//당첨여부
		//Arrays.sort(selectNumber);
		//Arrays.sort(winningNumber);
		
		//Arrays.equals()는 배열 항목 값 비교
		boolean result = Arrays.equals(selectNumber, winningNumber);
		if (result) {
			System.out.println("1등");
		} else {
			System.out.println("꽝!");
			
		}
		
		
		
	}

}
