package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteTest01 {
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
			String sql = "delete from dept "
					+ "	where deptno=90";

			pstmt = conn.prepareStatement(sql);
			
			int cnt = pstmt.executeUpdate();
			if (cnt>0) {
				System.out.println("ok");
			}else {
				System.out.println("fail");
			}
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
