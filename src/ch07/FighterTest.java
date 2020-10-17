package ch07;

//인터페이스 : 추상메서드의 집합(추상클래스처럼 iv 가질수 없음)
//인터페이스 다형성 : 인터페이스 구현한 클래스가 상속받은 것처럼 행동
abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다");}
}

interface Fightable {//public abstrace는 생략가능 인터페이스 필수요소
	public abstract void move(int x, int y); 
	public abstract void attack(Fightable f);
}

class Fighter extends Unit implements Fightable{
	//오버라이딩규칙: 조상보다 접근제어자가 범위가 좁으면 안돼
	//따라서 public 보다 작아질수 없어
	public void move(int x, int y) {
		System.out.println("["+x+", "+y+"] 로 move");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 attack");
	}
	//싸울수 있는 상대 불러온다
	public Fightable getFightable(){
		Fighter f = new Fighter();//Fighter 을 생성해서 반환
		return f;
	}
}

public class FighterTest {
	public static void main(String[] args) {
		Fighter f1 = new Fighter();
		Unit f2 = new Fighter();
		Fightable f3 = new Fighter();
		f1.move(1, 2);
		f1.stop();
		f1.attack(f1.getFightable());
		System.out.println("---------------");
		f2.move(1, 2);
		f2.stop();
		//f2.attack(new Fighter());Unit에는 attack() 없어서 호출불가
		System.out.println("---------------");
		f3.move(1, 2);
		//f3.stop(); Fightable 에는 stop()이 없어서 호출불가
		f3.attack(new Fighter());
		System.out.println("---------------");
		
		
		
		
		
	}
}
