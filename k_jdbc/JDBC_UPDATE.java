package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_UPDATE {
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jihye";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//DEPT_DDL 테이블의 부서 번호가 40 이상인 부서들을 70으로 갱신
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "UPDATE DEPT_DDL"
					  + " SET DEPTNO = ?"
					  + " WHERE DEPTNO >= ?";
			
			ps = con.prepareStatement(sql);
			ps.setInt(1, 70);
			ps.setInt(2, 40);
			
			int countUpdate = ps.executeUpdate();
			
			System.out.println(countUpdate + "행 업데이트");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
	}
}
