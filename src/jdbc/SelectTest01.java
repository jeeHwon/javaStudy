package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.PrimitiveIterator.OfDouble;

public class SelectTest01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select empno, ename, sal, hiredate "
					+ " from emp "
					+ " where empno>=7900 "
					+ " order by empno desc";

			pstmt = conn.prepareStatement(sql);
			
			int cnt = pstmt.executeUpdate();
			if (cnt>0) {
				System.out.println("ok");
			}else {
				System.out.println("fail");
			}
			//executeQuery()의 return 형태는 ResultSet
			rs = pstmt.executeQuery();
			
			//4. 추가작업 select empno, ename, sal, hiredate
			if (rs!=null) {
				while (rs.next()) {
					int empno = rs.getInt("empno");
					String ename = rs.getString("ename");
					double sal = rs.getDouble("sal");
					Date hiredate = rs.getDate("hiredate");
					System.out.printf("%5d %s %7.2f %s\n",empno,ename,sal,hiredate);
				}
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
