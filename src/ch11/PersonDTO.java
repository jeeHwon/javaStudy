package ch11;

//TreeSet 이용(정렬과 크기 비교에 특화된 구조)

//Interface를 구현하는 클래스 선언
//[접근제어자][속성] class 클래스명 [extends 조상클래스명] implements 인터페이스명

//인터페이스는 상수와 추상메서드만으로 구성된 (추상)클래스의 일종이므로
//인터페이스는 상속받은 구현클래스에서는
//인터페이스 선언한 추상메서드를 반드시 오버라이딩(재정의)해야 한다

//여기에서는 Comparable 인터페이스의 int compareTo(Object o)
public class PersonDTO implements Comparable<PersonDTO>{
	//field
	private String name;
	private int age;
	//constructor
	//order by 정렬기준 정렬방법
	//
	public PersonDTO() {}
	public PersonDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//method
	//기준 1 비교 100 : 음수
	//기준 100 비교 100 : 0
	//기준 100 비교 1 : 양수

	@Override
	public int compareTo(PersonDTO p) {
		if (this.age<p.age) {
			return -1;
		} else if(this.age==p.age) {
			return 0;
		} else {
			return 1;
		}
	}
	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + "]";
	}
}
