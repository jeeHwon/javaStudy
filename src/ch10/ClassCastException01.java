package ch10;


//ClassCastException :
//타입변환(Casting)은 상위클래스와 하위클래스간 발생
//구현클래스와 인터페이스 간에도 발생
//발생원인 : 강제로 타입변환을 시도할 경우 발생
public class ClassCastException01 {

	public static void main(String[] args) {
		Cameleon cm = new Cameleon();
		Wolf wf = new Wolf();
		changeCameleon(wf);//runtime error
		//발생이유 : wolf 객체를 changeCameleon()의 매개값으로 주었기 때문
		//	따라서 Cameleon 타입으로 변환할 수 없다
	}
	
	public static void changeCameleon(Animal ani) {
		//해결방법 : 타입을 먼저 체크하자 
		if (ani instanceof Cameleon) {
			Cameleon cameleon = (Cameleon)ani;
		}
		
	}

}
class Animal{}
class Cameleon extends Animal{}
class Wolf extends Animal{}
