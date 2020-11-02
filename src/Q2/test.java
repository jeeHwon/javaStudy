package Q2;

public class test {

	public static void main(String[] args) {
		//phone : 360 * 720
		//webpage : 1440 * 2048 (360 720 1080 1440)
		//90의 배수 : 90 180 270 360 450 540 630 720 810
		
		try {
			System.out.println(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("메세지"+e.getMessage());
		}
		 
	}

}
