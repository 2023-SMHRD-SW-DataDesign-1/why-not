package Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	int cnt = 0;
	
	public void open() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1524:xe";
			String userid = "campus_g_0530_4";
			String userpw = "smhrd4";

			conn = DriverManager.getConnection(url, userid, userpw);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if( rs != null) {
				rs.close();
			}
			if( pst != null ) {
				pst.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public int join(MemberDTO dto) {
		open();
		
		try {
			String sql = "insert into JDBC_member values(?,?,?)";
			
			pst = conn.prepareStatement(sql);
			
			pst.setString(1, dto.getId());
			pst.setString(2, dto.getPw());
			pst.setString(3, dto.getName());
			
			int cnt = pst.executeUpdate();
			
			if(cnt > 0) System.out.println("회원가입에 성공하였습니다.");
			else System.out.println("회원가입에 실패하였습니다.");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			close();
		}
		
		return cnt;
		
	}
	
}
