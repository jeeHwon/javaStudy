package ch15;

public class MemoryTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(10);
		System.out.println(sb.capacity());
		sb.append("가나다라마바사아자차");
		char c1 = sb.charAt(1);
		System.out.println(c1);
		System.out.println(sb);
	
		System.out.println(sb.capacity());
	
	}

}
