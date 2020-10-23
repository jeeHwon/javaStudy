package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CompanyManager {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver"; //불러올 드라이버
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //오라클 url
		String user = "scott";	//접속 ID
		String password = "tiger"; // 접속 PW
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {//드라이버호출>연결>sql날리고>pstmt에 담아>resultSet에넣어
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select cno, cname, ceo, tel, dam "
					+ " from company";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs!=null) {//rs객체가 있으면 모든 객체에 대해 출력
				while (rs.next()) {
					CompanyDTO cDTO = new CompanyDTO();
					cDTO.setCno(rs.getInt("cno"));
					cDTO.setCname(rs.getString("cname"));
					cDTO.setCeo(rs.getString("ceo"));
					cDTO.setTel(rs.getString("tel"));
					cDTO.setDam(rs.getString("dam"));
					System.out.println(cDTO);
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
