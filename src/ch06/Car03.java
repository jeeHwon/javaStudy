package ch06;

//다른 생성자 호출 : this()
//생성자간 오버로딩이 많아질 경우
//생성자간의 중복된 코드가 발생 할 수 있다
//이 때 매개변수의 수만 달리하고, 필드 초기화 내용이 비슷한 생성자에서 빈번하다
//이러한 경우 필드 초기화 내용은 한 생성자(제일 파라미터 많은)에서만 집중적으로 작성하고
//나머지 생성자들은 초기화 내용을 가지고 있는 생성자를 호출하는 방법으로 개선가능
//단, 주의 : 반드시 생성자 안에서 작성 + 반드시 첫 번째 문장
public class Car03 {
	
	//field : [접근제한자] [속성] 데이터타입.변수명;
	String company = "porsche";
	String model;
	String color;
	int maxSpeed;
	
	//constructor : [접근제한자] 클래스명(매개변수리스트){}
	
	//default constructor
	Car03 (){
		//System.out.println("default constructor");
	}
	
	//model 초기화 생성자
	Car03(String kmodel) {
		//Car03(kmodel, "d"); //컴파일 에러 발생 (객체 생성 안했으니)
		this(kmodel, null ); // 생성자가 또다른 생성자 호출시 생성자명 그대로 쓰지않고 this
	}
	
	//model, color 초기화 생성자
	Car03(String kmodel, String kcolor) {
		this(kmodel, kcolor, 0); //this는 반드시 첫번째 문장에서만
	}
	//model, color, maxSpeed 초기화 생성자
	Car03(String kmodel, String kcolor, int kmaxSpeed) {
		model = kmodel;
		color = kcolor;
		maxSpeed = kmaxSpeed;
	}
	//method : [접근제한자] [속성] 리턴유형 메소드명(매개변수리스트){}
}

