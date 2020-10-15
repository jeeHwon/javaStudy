package ch07;

//생성자의 접근제어자
//생성자에 접근제어자를 사용함으로서 인스턴스의 생성을 제한할 수 있다
//전체 프로그램에서 단 하나의 객체만 만들도록 보장해야하는 경우에 쓴다
//단 하나만 생성한다고 해서 이 객체를 singleton 이라 한다

//싱글톤 클래스가 되기 위해서는
//1. fields는 private static 클래스 타입으로 선언
//초기값으로 객체가 생성되어야 한다
//->private static 클래스타입 참조변수 =new 클래스명();
//
//2. 생성자는 private으로 선언되어야 한다
//->private 클래스명(){}

//3. 객체를 제공하는 메서드는 public static 클래스를 리턴해야한다
//->public static 클래스명 메서드명() {}

//싱글톤 클래스 객체 사용시에는
//클래스명 참조변수명 = 클래스명.메서드명();
public class Singleton {
	//field
	private static Singleton sin = new Singleton();
	
	//constructor
	private Singleton(){}
	
	//객체를 제공하는 메소드
	//객체가 생성된 heap영역의 주소를 반환하는 메소드
	public static Singleton getInstance() {
		if (sin==null) {
			return new Singleton();
		} else {
			return sin;
		}
	}
}

