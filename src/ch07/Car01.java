package ch07;
//프로그램에서 가장 중요한 요소중 하나는 데이터다
//즉 변수가 프로그램에서 핵심적인 요소가 된다
//무결성 데이터를 유지할 수 있는 것이 중요
//무결성을 유지할 수 있도록 접근제어자를 통해 직접적인 접근을 제한하거나
//setter 함수에서 검증 코드를 추가한다
//getter 함수에서 필요시 변환 코드를 추가하여 제시할 수 있다(편의성제공)

public class Car01 {
	//field : [접근제어자][속성]데이터타입 변수명[=초기값];
	private int speed;
	private boolean stop;
	private static Car01 car = new Car01();

	//constructor : [접근제어자] 클래스명(){}
	
	//method : [접근제어자][속성]리턴유형 메소드명(){}
//	위에서 선언된 필드에 접근할수 잇는 메소드를 제공해줌으로서
//	필드에 함부로 접근하지 못하도록 하면서
//	해당 메소드를 통해서만 필드값을 안전하게 변경(setter)/사용(getter)하도록 한다
//  [접근제어자][속성]리턴유형 get+필드명(){}	
	
	public int getSpeed() {
		return speed;
	}
	//편의성제공
	//여기선 마일단위를 km로 환산하여 외부로 리턴하려고함
	public double getSpeedKm() {
		double km = speed+1.609;
		return km;
	}
	
	public void setSpeed(int speed) {
		//this.speed = speed;
		if (speed<0 || speed > 300) {
			System.out.println("올바른 속도값을 입력하라");
		} else {
			this.speed = speed;
		}
	}
	
	//필드타입이 boolean 인 경우에는
	//getter 함수는 get으로 시작하지 않고 is로 시작하는 것이 관례
	public void isStop() {
		if (stop) {
			System.out.println("정지 되어 있습니다");
		} else {
			System.out.println("운행중입니다");
		}
	}
	
	public void setStop(boolean status) {
		this.stop = status;
	}
}
