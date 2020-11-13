package others;

//Refactoring
//매직넘버를 (기호)상수로 치환
//매직넘버란? 소스코드에 특정한 값을 숫자

//리팩토링기준: 매직넘버를 기호로 치환
class CruiseControl2{
	//field
	private double targetSpeedKmh;
	//상수선언
	static final int NORMAL_PRESET = 0;
	static final int STOP_PRESET = 1;
	static final int HIGH_PRESET = 2;
	
	
	//method
	void setPreset(int speedPreset) {
		if (speedPreset==HIGH_PRESET) {
			setTargetSpeedKmh(10940);
		}else if (speedPreset==STOP_PRESET) {
			setTargetSpeedKmh(15000);
		}else if (speedPreset==NORMAL_PRESET) {
			setTargetSpeedKmh(10000);
		}
	}
	void setTargetSpeedKmh(double speed) {
		targetSpeedKmh = speed;
		System.out.println(speed+"으로 설정 완료");
	}
	
}
public class AfterCruiseControl {

	public static void main(String[] args) {
		CruiseControl2 cruise = new CruiseControl2();
		cruise.setPreset(2);
		cruise.setPreset(1);
		cruise.setPreset(0);
	}

}
