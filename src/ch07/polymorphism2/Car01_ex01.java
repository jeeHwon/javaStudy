package ch07.polymorphism2;

//필드의 다형성을 살펴보자

public class Car01_ex01 {

	public static void main(String[] args) {
		//Car01 클래스의 객체생성
		Car01 car = new Car01();
		
		
		//Car01 객체의 run()을 8번 반복실행
		for (int i = 1; i < 8; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
				case 1 :
					System.out.println("전방좌측 HankookTire로 교체"); 
					car.tires[0] = new HankookTire("전방좌측",15);
					break;
				case 2 : 
					System.out.println("전방우측 KumhoTire로 교체"); 
					car.tires[1] = new KumhoTire("전방우측",16);
					break;
				case 3 : 
					System.out.println("후방좌측 HankookTire로 교체"); 
					car.tires[2] = new HankookTire("후방좌측",13); 
					break;
				case 4 : 
					System.out.println("후방우측 KumhoTire로 교체"); 
					car.tires[3] = new KumhoTire("후방우측",14);
					break;
				
			
			}
			System.out.println("--------------");//문제없이 잘 굴러간경우
			
		}
	}

}
