package ch07;

//Singleton 클래스에서 객체 얻기
public class Singleton_Ex01 {

	public static void main(String[] args) {
		//Singleton s = new Singleton(); private 기본생성자 못불러와
		System.out.println(Singleton.getInstance());
	}
}
