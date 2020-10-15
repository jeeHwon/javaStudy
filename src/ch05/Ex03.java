package ch05;

//배열변수 생성과 값 할당
//방법1 : 생성후 값을 할당
//방법2 : 생성하면서 값을 할당
public class Ex03 {

	public static void main(String[] args) {
		//방법1 : 생성후 값을 할당
		int[] nums = new int[3]; //배열 생성 한 후
		nums[0] = 10; //값을 할당
		nums[1] = 20;
		nums[2] = 30;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums["+i+"] = "+nums[i]);
		}
		
		//방법2 : 생성하면서 값을 할당
		//데이터타입[] 배열변수명 = new 데이터타입[] {초기값, ..., 초기값};
		char[] c = new char[] {'a', '뷁', '★'};
		//char[] c = new char[3] {'a', '뷁', '★'}; error 나대지마라 하나만해 알아서한다내가
		for (char i : c) {						//초기값 주면서 배열크기 명시하지마라
			System.out.println(i);
		}
		
		//방법3 : 방법2 업글버젼
		//데이터타입[] 배열변수명 = {초기값, ..., 초기값};
		double[] d = {1, 2, 3.14, 100};
		for (double i : d) {
			System.out.println(i);
		}
	}
}
