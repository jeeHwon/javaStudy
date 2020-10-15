package ch06;

//this : 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있음
//인스턴스 멤버 : 객체를 생성한 후 사용할 수 있는 필드와 메소드
//인스턴스 필드와 인스턴스 메소드는 객체에 소속된 멤버이기 때문에 객체 없이 사용불가

//객체외부에서 인스턴스 멤버에 접근하기 위해 참조변수를 사용하듯이
//객체내부에서 인스턴스 멤버에 접근하기 위해 this를 사용한다

public class Car04 {
	String model;
	int speed; 
	
	Car04(){}
	Car04(String m){
		model = m;
	}
	Car04(String m, int n){
		this(m);
		speed = n;
	}
	void setSpeed(int n) {
		this.speed = n;
	}  
	void run() {
		for (int i = 10; i <= 100; i = i+10) {
			this.setSpeed(i);
			System.out.println(model+" 한 대가 시속" + this.speed+"km로 달린다");
		}
	}
}

