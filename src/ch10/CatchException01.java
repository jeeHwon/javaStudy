package ch10;


//다중 catch
//try 블럭 내부에는 다양한 종류의 예외가 발생할 수 있다
//예외별로 예외처리코드를 다르게 하려면 다중 catch를 이용한다
public class CatchException01 {

	public static void main(String[] args) {
		try {
			String data0 = args[0];//error 발생
			String data1 = args[1];
			System.out.println(data0);
			System.out.println(data1);
			
			String data11 = "100";
			String data22 = "a100";
			int value11 = Integer.parseInt(data11);
			int value22 = Integer.parseInt(data22);
			System.out.println(value11);
			System.out.println(value22);
			System.out.println("배열관련 에러발생");
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			System.out.println("숫자포맷관련 에러발생");
		}catch (Exception e) {
			System.out.println("Exception e");
		}finally {
			//catch절에 들어가던, 들어가지 않던 무조건 실행
			System.out.println("finally 블럭");
		}
		
		 
		
	}

}
