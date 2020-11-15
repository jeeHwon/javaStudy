package test_refactoring;

public class Ex01 {
	static double degree = 90;

	public static void main(String[] args) {//90 degrees -> radian
		System.out.println("Refactoring 전: "+degree+"° = "+degreeToRadian(degree)+"rad");
		System.out.println("Refactoring 후: "+degree+"° = "+degreeToRadianRef(degree)+"rad");
	
	}
	public static double degreeToRadian(double degree) {
		//문제 1: 파이 값 부정확(실제 파이값:3.14159565358979323846..)
		//문제 2: 파이 값 오류에 의한 최종결과 오차발생
		//문제 3: 매직넘버 사용
		return degree / 180.0 * 3.141592653589898989846;
	}
	public static double degreeToRadianRef(double degree) {
		//해결 1: 매직넘버를 기호상수로 치환
		//해결 2: 가독성을 위해 괄호 삽입
		//해결 3: 주석 없이 명확한 의미 전달 위해 파라미터 degree 받아 radian으로 출력
		double radian = degree * (Math.PI/180);
		return radian;
	}
}
