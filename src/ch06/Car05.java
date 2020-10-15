package ch06;

public class Car05 {
	//field : [접근제어자][속성]데이터타입 참조변수명;
	double gas;
	double speed = 0;
	
	//constructor : [접근제어자] 클래스명 (){}
	Car05(){}
	Car05(int n){
		this.gas = n;
	}
		
	//method
	void setGas(int n) {
		this.gas = n;
	}
	
	boolean isLeftGas() {
		if (gas==0.0) { //gas가 없다면
			System.out.println("오링!");
			return false;
		}	
		System.out.println("gas 아직있어");
		return true;
	}
	
	void run() {
		while(true) {
			if (gas>0) {
				System.out.println("달린다 gas 잔량 : "+Math.round(gas*100)/100.0+" 현재시속 : "+Math.round(speed)+"km");					
				gas = gas - (Math.random()*0.01);
				speed = speed + 0.001;
			} else {
				System.out.println("멈춥니다");
				return;
			}
		}
	}
}

