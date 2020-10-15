package ch06;

public class Car05_Ex01 {
	
	public static void main(String[] args) {
		Car05 c1 = new Car05();
		c1.setGas(1);
		
		//가스충전여부 확인기능 실행
		boolean gasState = c1.isLeftGas();
		if(gasState) {
			c1.run();
		}
		if (!(c1.gas==0)) {
			System.out.println("gas 주입 하세요");
		} else {
			System.out.println("gas 주입 안해도됨");
		}
	}
}

