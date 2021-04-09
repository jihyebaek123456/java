package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC_SELECT {
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jihye";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//2005년 5월 구매 목록 조회
		//회원아이디, 회원명, 제품명, 수량, 총금액
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT M.MEM_ID AS 아이디,"
					   		 + " M.MEM_NAME AS 회원명,"
					   		 + " P.PROD_NAME AS 제품명,"
					   		 + " C.CART_QTY AS 수량,"
					   		 + " (C.CART_QTY*P.PROD_PRICE) AS 구매금액"
					  + " FROM CART C, MEMBER M, PROD P"
					  + " WHERE C.CART_MEMBER = M.MEM_ID"
					  	+ " AND C.CART_PROD = P.PROD_ID"
					  	+ " AND CART_NO LIKE ?";
			
			ps = con.prepareStatement(sql);
			ps.setString(1, "200505%");
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			for(int i=1 ; i<=columnCount ; i++) {
				System.out.print(metaData.getColumnName(i) + "\t");
			}
			System.out.println("\n---------------------------------------------------");
			
			while(rs.next()) {
				for(int i=1 ; i<=columnCount ; i++) {
					Object value = rs.getObject(i);
					System.out.print(value + "\t");
				}
				System.out.println();
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
