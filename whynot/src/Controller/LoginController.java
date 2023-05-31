package Controller;

import DAO.MemberDAO;
import DTO.MemberDTO;

public class LoginController {
	
	public String login(MemberDTO memberDTO) {

//		// 사용자가 입력한 데이터 확인하기
//		System.out.println("id : " + memberDTO.getId());
//		System.out.println("pw : " + memberDTO.getPw());
		
		// DB에 접속해서 값 추가하기
		MemberDAO dao = new MemberDAO();
		String nickname = dao.login(memberDTO);
		
		return nickname;

	}

}
