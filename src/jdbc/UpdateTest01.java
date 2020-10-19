package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateTest01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			String sql = "update emp set sal=sal+300 "
					+ " where empno=8000";
			pstmt = conn.prepareStatement(sql);
			
			int cnt = pstmt.executeUpdate();
			if (cnt>0) {
				System.out.println("입력 되었습니다");
			}else {
				System.out.println("입력 실패");
			}
			
			
		} catch (Exception e) {
			System.out.println("쿼리실행관련 error 발생 : "+e);
		} finally {
			//5.사용한 객체는 반납 : 객체.close();
			try {
				if (pstmt!=null) {pstmt.close();}
				if (conn!=null) {conn.close();}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
