package refactoring.ex01.before;

//매직넘버를  (기호)상수로 치환
//매직넘버란?	소스코드에  특정한 값을   숫자 

//리팩토링 기준 : 매직넘버 
//개선방법 : 매직넘버를 기호상수 치환


//이 클래스는 크루즈를 제어하는 기능을 가진 클래스이다 가정..
class CruiseControl{
	//field
	private  double targetSpeedKmh;
	
	void setPreset(int speedPreset) {
		if(speedPreset==2) {
			setTargetSpeedKmh(10940);
		}else if(speedPreset==1) {
			setTargetSpeedKmh(10000);
		}else if(speedPreset==0) {
			setTargetSpeedKmh(15000);
		}
	}
	
	//method
	void setTargetSpeedKmh(double  speed) {
		targetSpeedKmh = speed;
		System.out.println( targetSpeedKmh+"으로 선 설정 완료." );
	}
	
}


public class beforeCruiseControl {

	public static void main(String[] args) {
		CruiseControl cruise = new CruiseControl();
		cruise.setPreset(2);//10940으로 선 설정 완료
		cruise.setPreset(1);//10000으로 선 설정 완료
		cruise.setPreset(0);//15000으로 선 설정 완료
	}

}












