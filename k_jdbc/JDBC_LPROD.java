package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_LPROD {
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jihye";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * "
					   + "FROM LPROD "
					   + "WHERE LPROD_ID BETWEEN 3 AND 5"
					   + "ORDER BY LPROD_ID";
			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			System.out.println("제품번호\t분류코드\t제품명");
			System.out.println("------------------------");
			while(rs.next()) {
				int lprod_ID = rs.getInt("LPROD_ID");
				String lprod_gu = rs.getString("LPROD_GU");
				String lprod_nm = rs.getString("LPROD_NM");
				System.out.println(lprod_ID + "\t" + lprod_gu + "\t" + lprod_nm);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		
		
		
		
		
	}
}
