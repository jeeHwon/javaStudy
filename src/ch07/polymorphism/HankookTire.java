package ch07.polymorphism;

//이 클래스는 Tire01을 상속받는 클래스이다
public class HankookTire extends Tire01{
	//field
	
	//constructor
	public HankookTire() {}
	public HankookTire(String location, int maxRotation) {
//		this.location = location;
//		this.accumulatedRotation = accumulatedRotation;
		
		super(location, maxRotation); //위 두문장과 같아
		//super() 조상클래스의 생성자를 호출. 반드시 생성자의 첫번재 라인에서 작성
	}
	
	//method
		@Override
		public boolean roll() {
			++accumulatedRotation;	//호출될때마다 1씩 회전수 누적 증가
			if (accumulatedRotation<maxRotation) {
				System.out.println("위치@"+location+"금호tire 수명 : "+(maxRotation-accumulatedRotation));
				return true;	
			} else {
				System.out.println("위치@"+location+"금호tire 펑크");
				return false;
			}
		}
	
}
