package jdbc;
//fla0242@nate.com
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Scanner;
//DB 연동 있는 version
public class StudentManager02 {

	public static void main(String[] args) {
		//1.lv 선언
		String driver = "oracle.jdbc.driver.OracleDriver"; //불러올 드라이버
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //오라클 url
		String user = "scott";	//접속 ID
		String password = "tiger"; // 접속 PW
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner scanner = new Scanner(System.in);

		//2.n명의 학생정보 입력화면 구현
		int n = 2;	//최초 학생수를 n에 부여한다
		int count = 0; //count 변수 사용하여 부여된 n값만큼 학생 데이터 입력을 받는다
		String[] res = new String[4]; //크기 4인 res배열을 생성한다
		System.out.printf("%d명의 학생이름,학과,학번,학점평균 형식으로 입력하세요.\n",n);
		while (count!=n) {
			System.out.print("학생"+(count+1)+">>");
			String str = scanner.nextLine();
			res = str.split(",");//","기준으로 4개 파라미터로 분할하여 객체 생성해 list에 넣는다
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
				String sql = "insert into st1(name, department, id, grade) "
						+ " values('"+res[0]+"', '"+res[1]+"', '"+res[2]+"', "+Double.parseDouble(res[3])+")";
				pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
			} catch (Exception e) {System.out.println("querry error"+e);
			} finally {
				try {if(pstmt!=null) {pstmt.close();}if (conn!=null) {conn.close();}
				} catch (Exception e2) {e2.printStackTrace();}
			}//try-catch-finally 문 end
			count++; //1명 입력 완료 후 count +1
		}//while문 end
		
		//3.학생정보 입력후 모든학생 데이터 출력하는 결과화면 구현
		try {//전체 main method 안에 하나의 try-catch-finally로 합치려다 복잡해서 실패.. 좀 더 고민해보자 
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select name, department, id, grade "
					+ " from st1";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); 
			
			if (rs!=null) {//rs 객체 존재한다면
				while (rs.next()) {//모든 rs에 대해 파라미터 값 가져와서 StudentDTO 객체로 만들어 준 후 출력
					String name = rs.getString("name");
					String department = rs.getString("department");
					String id = rs.getString("id");
					double grade = rs.getDouble("grade");
					StudentDTO02 sDTO = new StudentDTO02(name, department, id, grade);
					System.out.println("--------------------");
					System.out.println(sDTO);
					System.out.println("--------------------");
				}
			}
		} catch (Exception e) {System.out.println("querry error"+e);
		} finally {
			try {if(pstmt!=null) {pstmt.close();}if (conn!=null) {conn.close();}
			} catch (Exception e2) {e2.printStackTrace();}
		}
		
		//4. 학생이름 입력후 결과화면
		while (true) {//특별히 요구사항 없으므로, 학생정보 입력 후 학생이름 입력 받기 반복
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
				System.out.print("학생 이름>>");
				String SearchName = scanner.nextLine();
				String sql = "select name, department, id, grade "
						+ " from st1"
						+ " where name='"+SearchName+"'";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				if (rs!=null) {
					while (rs.next()) {
						String name = rs.getString("name");
						String department = rs.getString("department");
						String id = rs.getString("id");
						double grade = rs.getDouble("grade");
						System.out.printf("%s, %s, %s, %.1f\n",name,department,id,grade);
					}
				}
			} catch (Exception e) {System.out.println("querry error"+e);
			} finally {
				try {if(pstmt!=null) {pstmt.close();}if (conn!=null) {conn.close();}
				} catch (Exception e2) {e2.printStackTrace();}
			}
		}
	}
}
