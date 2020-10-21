package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class exam01 {
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
			String sql = "select mno, mname, mid, mpw, mdate "
					+ " from member";

			pstmt = conn.prepareStatement(sql);
			
			int cnt = pstmt.executeUpdate();
			if (cnt>0) {
				System.out.println("ok");
			}else {
				System.out.println("fail");
			}
			rs = pstmt.executeQuery();
			
			while(rs.next())
				System.out.printf("[%d, %s, %s, %s, %s, %d]\n", rs.getInt("no"), rs.getString("writer"), rs.getString("title"), rs.getString("content"), rs.getDate("writeDate"), rs.getInt("hit"));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) { rs.close(); }
				if (pstmt != null) { pstmt.close(); }
				if (conn != null) { conn.close(); }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}