package ch06;

//생성자(constructor)
//- 인스턴트가 생성될 때마다 호출되는 '인스턴스 초기화 매서드'
//- 생성자의 이름은 클래스의 이름과 같아야한다
//

//필드의 초기화
//- 클래스로부터 객체가 생성될 때 필드는 기본 초기값으로 자동 설정된다
//- int -> 0, double -> 0.0, String -> null;
//- 다른 값으로 초기화 하고 싶을 때 두가지 방법
//1) 필드를 선언할 때 초기값을 주기
//-> 동일한 클래스로부터 생성되는 객체들은 모두 같은 데이터값을 가지게 된다
//-> 물론 객체 생성후 변경가능하다(아래코드에서는 setName() )
//2) 생성자에서 초기값을 주기
//-> 생성자 오버로딩을 이용, 이 때 생성자 오버로딩을 하면 기본 생성자는 없어지므로 필요시
//-> 필요시 명시적으로 선언 해야함을 주의


//생성자의 역할 : 인스턴스 변수의 초기화, 인스턴스 생성시 수행할 작업에 사용
public class Korean01 {
	
	//field - [접근제한자] [속성] 데이터타입 변수명;
	String nation = "KOREA";
	String name; //인스턴스 변수 + 전역변수 
	String ssn;
	int age;
	
	
	//constructor - [접근 제한자] 클래스명(매개변수리스트){}
	//기본 생성자(default constructor) : 매개변수가 없는 생성자
	// - 매개변수가 없는 생성자
	// - 클래스에 생성자가 하나도 없으면 컴파일러가 생성자를 자동으로 추가한다
	Korean01(){
		System.out.println("기본생성자 위치1");
	}
	
	//매개변수가 있는 생성자
	//객체생성시 데이터르르 제시하면 그 데이터를 받아서 인스턴스 변수를 초기화 하는 역할
	//생성자 오버로딩
	Korean01(String kname){
		System.out.println("field name 초기화전 "+name);
		System.out.println("매개변수 1개 있는 생성자 kname = "+ kname );
		name = kname; //인스턴스 변수 초기화
		System.out.println("field name 초기화후 "+name);
	}
	
	Korean01(String kname, String kssn){
		System.out.println("매개변수 2개 있는 생성자 ");
		name = kname;
		ssn = kssn;
		System.out.printf("field name:%s ssn:%s%n",name,ssn);
	}
	
	Korean01(String kname, String kssn, int kage){
		System.out.println("매개변수 3개 있는 생성자 ");
		name = kname;
		ssn = kssn;
		age = kage;
		System.out.printf("field name:%s ssn:%s age:%s%n",name,ssn,age);
	}
	
	//method - [접근제한자] [속성] 리턴유형 함수명(매개변수리스트){} 
	
	//개명메소드 선언
	void setName(String kname) {
		name = kname;
	}
	
	//이름 제공 메소드 선언
	String getName() {
		return name;
	}
	
	//혼자놀기 메소드
	void sex () {
		if (Integer.parseInt(ssn.substring(7,8))==1) {
			System.out.println("성별  male");
		} else {
			System.out.println("성별 female");
		}
	}	
	
	void birthday() {
		String year = ssn.substring(0,2);
		String month = ssn.substring(2,4);
		String day = ssn.substring(4,6);
		System.out.println("생년월일 "+year+"년 "+month+"월 "+day+"일");
	}
	
	void age () {
		int age = 2020-Integer.parseInt(ssn.substring(0,3));
		System.out.println(age);
	}
	
	void auto() {
		System.out.println("-------------------------");
		System.out.println("국적 "+nation);
		System.out.println("성명 "+name);
		this.sex();
		this.birthday();
		this.age();
	}
}
