package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.PrimitiveIterator.OfDouble;

public class SelectTest02 {

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
			//executeQuery()의 return 형태는 ResultSet
			rs = pstmt.executeQuery();
			
			//4. 추가작업 select empno, ename, sal, hiredate
			if (rs!=null) {
				while (rs.next()) {
					MemberDTO mDTO = new MemberDTO();
					//member 테이블의 mno 컬럼을 가져와서
					//memberDTO클래스의 setmNo()메서드 파라미터로 제공하면
					//memberDTO클래스의 필드에 데이터가 세팅된다.
					mDTO.setmNo(rs.getInt("mno"));
					mDTO.setmName(rs.getString("mname"));
					mDTO.setmId(rs.getString("mid"));
					mDTO.setmPw(rs.getString("mpw"));
					mDTO.setmDate(rs.getDate("mdate"));
					System.out.println(mDTO);
					
					//int mno = rs.getInt("mno");
					//String mname = rs.getString("mname");
					//String mid = rs.getString("mid");
					//String mpw = rs.getString("mpw");
					//Date mdate = rs.getDate("mdate");
					//System.out.printf("%5d %6s %6s %6s %s\n",mno,mname,mid,mpw,mdate);
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
