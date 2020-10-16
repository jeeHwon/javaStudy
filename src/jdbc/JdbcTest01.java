package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//JEBC :DB연동여부 테스트
public class JdbcTest01 {
	//field
	
	//constructor JdbcTest01(){	}
	
	//method
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
		//다중 catch 절 : 주의-하위클래스부터 먼저 작성할것
		//try { 위험코드,위험코드..
		//} catch(하위Exception클래스명 참조변수){
		//	예외발생 처리코드
		//} catch(상위Exception클래스명 참조변수){
		//	예외발생 처리코드
		//} catch(Exception클래스명 참조변수){
		//	예외발생 처리코드
		//} finally {
		// catch절에 들어가던 들어가지 않던 무조건 실행해야하는 코드 작성
		// 자원반납을 반드시 하게 하려면 블럭안에 코드 작성
		// 예) DB 연동시 자원반납
		//}
		//코드..
		
		
		try {
			//1. JDBC 드라이버 로드
			//JDBC 드라이버를 로드하기 위해 드라이버 클래스 파일을 로드한다
			//자바의 Class 클래스의 forName() 메소드를 이용하면
			//특정 클래스 파일을 읽어들일 수 있다
			//mySql 이면 Class.forName("com.mysql.jdbc.Driver");
			//Oracle
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
			
			
			//2.자바 응용프로그램과 JDBC의 연결
			//DriverManager는 자바응용프로그램을 JDBC 드라이버에 연결
			//시켜주는 클래스이다
			//DriverManager.getConnection() 메소드를 호출하여
			//데이터베이스에 연결하고 Connection 객체를 반환한다
			//DriverManager.getConnection(url, user, password)
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("connection 얻기 성공");
			
			//3. 쿼리실행할 객체를 생성 및 쿼리 실행
			//자바에서 SQL 문을 실행하기 위해서는 Statment 클래스
			//객체 생성
			stmt = conn.createStatement();
			System.out.println("Statement 객체 생성 성공");
			//쿼리 실행
			//쿼리문 주의사항, 문법, 테이터타입, ; -> 포함 X
			//int executeUpdate(String sql): insert, update, delete
			//sql 문을 실행하고, sql 실행으로 영향을 받은 행의 개수나 0반환
			//int cnt = stmt.executeUpdate("insert into dept values(90,'IT','서울')");
			//int cnt = stmt.executeUpdate("delete from dept where deptno=90");
			int cnt = stmt.executeUpdate("update dept set loc='독도'	where deptno=90");
			if (cnt>0) {
				System.out.println("쿼리가 정상적으로 실행 cnt="+cnt);
			} else {
				System.out.println("쿼리가 정상적으로 실행 X cnt="+cnt);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL 관련 에러발생");
			e.printStackTrace();
		} finally{
			System.out.println("finally 블럭 안");
			
			if (stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn!=null) {
				try {
					conn.close();//처음에 생성던걸 나중에 반납
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		//쿼리문 기본
//		select * from tab;
//		select * from DEPT;
//
//		*delete 문법
//		delete from tablename 
//			[where 조건];
//
//		*update 문법
//		update tablename set column = ''
//			[where 조건];
//
//		*insert 문법
//		insert into tablename values('','','');
//
//		*select 문법
//		select columnname from tablename
//			[where 조건]
//			[group by 그룹기준]
//			[having 그룹조건]
//			[order by 정렬기준 정렬방식]
//		정렬방식
//		-오름차순(기본, asc) : 숫자-12345, 문자-abcdef, 예전->최근
//		-내림차순(desc)
	}
}
