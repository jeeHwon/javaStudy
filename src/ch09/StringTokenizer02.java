package ch09;

public class StringTokenizer02 {

	public static void main(String[] args) {
		String str = "조커,장첸 한니발-민소희&하야시";
		//str.split(String타입의 정규식)
		String[] names = str.split(",|&|-| ");//또는 으로 구분해야해
		for (String name : names) {
			System.out.println(name);
		}
		
		
		
		
	}

}
