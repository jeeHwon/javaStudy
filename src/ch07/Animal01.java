package ch07;

//추상클래스
//(실체)클래스들의 공통적인 특성(필드,메서드)를 추출해서 선언한 클래스
//(실체)클래스: 호랑이, 강아지, 유니콘, 드래곤, 킹콩
public abstract class Animal01 {
	//field
	public String type;
	
	//constructor
	
	//method - [public | protected] abstract 리턴유형 메소드명(){}
	public abstract void move();    //움직인다
	public abstract void sound();	//소리낸다
	
	//일반 method
	public void breath() {
		System.out.println("쒸익쒸익");
	}
	
	
	
}	
