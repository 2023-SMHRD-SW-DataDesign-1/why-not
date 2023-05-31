package Controller;

import DAO.MemberDAO;
import DTO.MemberDTO;

public class JoinController {
	MemberDAO dao = new MemberDAO();

	public String join(MemberDTO memberDTO) {

		// 사용자가 입력한 데이터 확인하기
//		System.out.print("id : " + memberDTO.getId());
//		System.out.print(", pw : " + memberDTO.getPw());
//		System.out.println(", nickname : " + memberDTO.getNickname());
//		System.out.println("point : "+memberDTO.getPoint());

		// DB에 접속해서 값 추가하기
		int row = dao.join(memberDTO);

		String result = null;
		if (row > 0) {
			System.out.println("회원가입 성공!");
			result = "성공";
		} else {
			System.out.println("회원가입 실패...");
			result = "실패";
		}

		return result;

	}

	public void plusPoint(String winner) { // 이긴사람 포인트 + 200 메소드
		dao.plusPoint(winner);

		
	}
	public void minusPoint(String loser) { // 진 사람 포인트 -100 메소드
		dao.minusPoint(loser);
		
		
	}
	
	

}
