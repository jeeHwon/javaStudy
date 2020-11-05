package ch10;

//TryCatchFinally
//try블록에는 예외발생가능성이 있는 코드를 위치 시킨다
//try블럭에서 예외가 발생하면 발생한 예외를 처리할 catch블럭을 찾는다

//일반예외처리 : 컴파일 과정에서 예외를 처리할 수 있다
public class TryCatchFinally01 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			//System.out.println("해당클래스가 존재하지 않는다");
			System.out.println("e.getMessage()"+e.getMessage());
			
		}
		System.out.println("catch 블럭 밖");
		
	}

}