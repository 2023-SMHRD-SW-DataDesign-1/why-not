package Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;

	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String dburl = "jdbc:oracle:thin:@project-db-stu.smhrd.com:1524:xe";
			String dbid = "campus_g_0530_4";
			String dbpw = "smhrd4";

			conn = DriverManager.getConnection(dburl, dbid, dbpw);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 회원가입
	public int join(MemberDTO dto) {

		getConn();
		int result = 0;
		try {
			String sql = "insert into YACHT_DICE(id,pw,nickname) values(?,?,?)";

			pstm = conn.prepareStatement(sql);
			pstm.setString(1, dto.getId());
			pstm.setString(2, dto.getPw());
			pstm.setString(3, dto.getNickname());
			// pstm.setInt(4, dto.getPoint());

			result = pstm.executeUpdate();

		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		} finally {
			close();

		}

		return result;
	}

	// 로그인
	public String login(MemberDTO dto) {
		getConn();
		String nickname = null;
		try {
			String sql = "select nickname from YACHT_DICE where id = ? and pw = ?";

			pstm = conn.prepareStatement(sql);
			pstm.setString(1, dto.getId());
			pstm.setString(2, dto.getPw());

			rs = pstm.executeQuery();

			if (rs.next()) {
				nickname = rs.getString("nickname");
			}

		} catch (SQLException e) {
			System.out.println("쿼리문 오류");
			e.printStackTrace();
		}
		close();
		return nickname;
	}

	// 랭킹확인
	public ArrayList<MemberDTO> Rank() {
		getConn();
		ArrayList<MemberDTO> Rank = new ArrayList<MemberDTO>();

		try {
			String sql = "select * from YACHT_DICE order by point desc";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nickname = rs.getString(3);
				int point = rs.getInt(4);

				MemberDTO dto = new MemberDTO(id, pw, nickname, point);
				Rank.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		close();
		return Rank;
	}
}