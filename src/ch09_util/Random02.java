package ch09_util;

import java.util.Arrays;
import java.util.Random;

public class Random02 {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		int[] winningNumber = new int[6];
		boolean status = true;
		int count = 0;
		long ct = System.currentTimeMillis();
		
		while (status) {
			Random random = new Random(ct);
			for (int i = 0; i < 6; i++) {
				selectNumber[i] = random.nextInt(45)+1;
			}
			for (int i = 0; i < 6; i++) {
				winningNumber[i] = random.nextInt(45)+1;
			}
			
			Arrays.sort(selectNumber);
			Arrays.sort(winningNumber);
			
			System.out.print("번호선택 : ");
			for (int i = 0; i < selectNumber.length; i++) {
				System.out.print(selectNumber[i]+" ");
				
			}
			System.out.println();
			System.out.print("당첨번호 : ");
			for (int i = 0; i < winningNumber.length; i++) {
				System.out.print(winningNumber[i]+" ");
				
			}
			System.out.println();
			System.out.println("--try:"+count+"-----");
			
			boolean result = Arrays.equals(selectNumber, winningNumber);
			if (result) {
				System.out.println("1등");
				break;
			} else {
				count++;
				ct++;
			}
			
			
		}
		
		
		
	}
	
	
	
}
