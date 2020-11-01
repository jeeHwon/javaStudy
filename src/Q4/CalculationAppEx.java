package Q4;


public class CalculationAppEx {
	
	public static void main(String[] args) {
		//최초 실행시 계산기 사용설명 출력
		System.out.println("=================계산기 ver1.0=================");
		System.out.println("--입력방법 : + - * /를 이용하여 공백없이 입력후 엔터");
		System.out.println("--이전 계산 결과에 이어서 계산하려면 연산부호부터 입력");
		System.out.println("--이전 계산 결과값을 초기화하려면 'clear'를 입력");
		System.out.println("--프로그램을 종료하려면 'exit'를 입력");
		System.out.println("==============================================");
					
		//	CalculationApp 객체 생성하여 입력과 계산 기능을 가진 method 호출
		//	exit 입력전까지 실행하는 반복문
		while (CalculationApp.runIs) {
			CalculationApp myCal = new CalculationApp();
			try {
				myCal.run();
				
			} catch (IndexOutOfBoundsException e1) {	//exit 입력하여 계산기 종료시 발생하는 예외 받는 catch문
				
			} catch (Exception e2) {	//그 외 오류시 계산기 재실행하는 catch문
				System.out.println("--입력값이 올바르지 않습니다");
				System.out.println("--다시 입력해 주세요");
				myCal.run();
			}
		}
	}
}
