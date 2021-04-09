package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
	public static void main(String[] args) {
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//주소
							//고정		    상황에 따라 달라짐
		String user = "jihye";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스
		//드라이버 : 서로 다른 애들을 연결해주는 중간 다리
		try {
			//try ~ catch로 감싸주지 않으면 예외가 발생할 수 있는 가능성을 잡아주지 않아서 컴파일 에러가 남
			con = DriverManager.getConnection(url, user, password);
								//Connection 객체 반환
			
			
			String sql = "SELECT * FROM MEMBER";
			ps = con.prepareStatement(sql);
					 //PreparedStatement 객체 반환
			
			
			//select 쿼리를 작성한 경우
			rs = ps.executeQuery();
					//ResultSet 객체 반환
			
			
			//insert, update, delete 쿼리를 작성한 경우
			//int result = ps.executeUpdate();
						 //테이블에서 영향 받은 행의 개수를 반환
						 //테이블에 아무 영향도 없는 경우 0 반환
			
			
			//rs에서 결과 추출
			while(rs.next()) {
				  //rs가 바라보는 행이 있으면 실행, 없으면 false로 while이 끝남
				
				String memId = rs.getString(1);
				String memPass = rs.getString("MEM_PASS");
				System.out.println("MEM_ID : " + memId + " / MEM_PASS : " + memPass);
				//컬럼의 자료형에 따라 호출하는 메소드가 달라짐 (CHAR, VARCHAR2 > String)
				//rs.getInt(columnIndex);
				//rs.getDate(columnIndex);
				//파라미터 : 컬럼의 순서 or 컬럼 명
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
		}
		
		
	}
}
