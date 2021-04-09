package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_DELETE {
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jihye";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//EMPIDX 테이블에서 데이터 모두 삭제
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "DELETE FROM DEPT_DDL"
					  + " WHERE 1=1";
			
			ps = con.prepareStatement(sql);
			int countDelete = ps.executeUpdate();
			
			System.out.println(countDelete + "개 행 삭제");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
	}
}
