package others;

//Refactoring
//매직넘버를 (기호)상수로 치환
//매직넘버란? 소스코드에 특정한 값을 숫자

//리팩토링기준: 매직넘버를 기호로 치환
class CruiseControl{
	//field
	private double targetSpeedKmh;
		
	//method
	void setPreset(int speedPreset) {
		if (speedPreset==2) {
			setTargetSpeedKmh(10940);
		}else if (speedPreset==1) {
			setTargetSpeedKmh(15000);
		}else if (speedPreset==0) {
			setTargetSpeedKmh(10000);
		}
	}
	void setTargetSpeedKmh(double speed) {
		targetSpeedKmh = speed;
		System.out.println(speed+"으로 설정 완료");
	}
	
}
public class BeforeCruiseControl {

	public static void main(String[] args) {
		CruiseControl cruise = new CruiseControl();
		cruise.setPreset(2);
		cruise.setPreset(1);
		cruise.setPreset(0);
	}

}
