package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentManager03 {

	public static void main(String[] args) {
		//1.lv 선언
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner scanner = new Scanner(System.in);
		String sql = null;
		
		//2.학생테이블(st1)생성(이거까지 쿼리구현해주자)
		
		try {
			//3.n명의 학생정보 입력화면 구현
			int n = 2;	//최초 학생수를 n에 부여한다
			int count = 0; //count 변수 사용하여 부여된 n값만큼 학생 데이터 입력을 받는다
			String[] res = new String[4]; //크기 4인 res배열을 생성한다
			System.out.printf("%d명의 학생이름,학과,학번,학점평균 형식으로 입력하세요.\n",n);
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			while (count!=n) {
				System.out.print("학생"+(count+1)+">>");
				String str = scanner.nextLine();
				res = str.split(",");
				sql = "insert into st1(name, department, id, grade) "
						+ " values('"+res[0]+"', '"+res[1]+"', '"+res[2]+"', "+Double.parseDouble(res[3])+")";
				
				pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				count++;
			}	
			//4.학생정보 입력후 모든학생 데이터 출력하는 결과화면 구현
			sql = "select name, department, id, grade "
					+ " from st1";

			pstmt = conn.prepareStatement(sql);
			
			
			rs = pstmt.executeQuery();	
			
				
				
				
			
		} catch (Exception e) {
			System.out.println("querry error"+e);
		} finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if (conn!=null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	
	
		
		
		
		
		
		
	}
}
