package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_INSERT {
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jihye";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		//ResultSet rs = null;
		
		//INSERT, UPDATE, DELETE - 자동 COMMIT
		//DEPT_DDL 테이블에 신규 입력
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "INSERT INTO EMP_TEMP (EMPNO, ENAME, JOB, HIREDATE, SAL, DEPTNO, MGR)"
					  + " VALUES (?, ?, ?, ?, ?, ?, ?)";
			
			java.util.Date date = new java.util.Date();
			date.setYear(21);  	 //취소선 - 사용 권장 X
			date.setMonth(3);	 //0부터 시작해서 0이 1월
			date.setDate(9);
			date.setHours(16);
			date.setMinutes(43);
			date.setSeconds(30);
			
			ps = con.prepareStatement(sql);
			ps.setInt(1, 9999);
			ps.setString(2, "JAMES");
			ps.setString(3, "PRESIDENT");
			//ps.setInt(4, x); --null 삽입 시 컬럼 삭제 or
			ps.setDate(4, new Date(new java.util.Date().getTime()));
			ps.setDate(1, Date.valueOf("2021-04-09"));
			ps.setInt(5, 5000);
			ps.setInt(6, 50);
			ps.setObject(7, null);  //Object형을 사용해서 넣기
			
			int countInsert = ps.executeUpdate();
			
			System.out.println(countInsert + "행 신규 입력");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
	}
}
