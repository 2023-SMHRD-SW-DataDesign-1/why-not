package View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Controller.HashMapController;
import Controller.JoinController;
import Controller.LoginController;
import Controller.ScoreBoradController;
import Member.MemberDAO;
import Member.MemberDTO;
import yahtzeeDice_DTO.DiceDTO;
import yahtzeeDice_DTO.Yacht;

public class yahtzeeDice_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		JoinController j = new JoinController();

		System.out.println("#     #    #     #####  #     # ####### ######  ###  #####  ####### ");
		System.out.println(" #   #    # #   #     # #     #    #    #     #  #  #     # #       ");
		System.out.println("  # #    #   #  #       #     #    #    #     #  #  #       #       ");
		System.out.println("   #    #     # #       #######    #    #     #  #  #       #####   ");
		System.out.println("   #    ####### #       #     #    #    #     #  #  #       #       ");
		System.out.println("   #    #     # #     # #     #    #    #     #  #  #     # #       ");
		System.out.println("   #    #     #  #####  #     #    #    ######  ###  #####  ####### ");
		System.out.println();

		while (true) {
			System.out.println(
					"============================== [1] 회원가입 [2] 로그인 [3] 랭킹확인 [4] 종료 ==============================");
			System.out.print("로그인시 자동으로 게임시작! >> ");
			num = sc.nextInt();

			if (num == 1) { // 회원가입
				System.out.println(
						"============================================== 회원가입 ==============================================");
				System.out.print("[ ID 입력 ] : ");
				String id = sc.next();
				System.out.print("[ Password 입력 ] : ");
				String pw = sc.next();
				System.out.print("[ Nick-name 입력 ] : ");
				String nickname = sc.next();

				JoinController joinCon = new JoinController();
				String result = joinCon.join(new MemberDTO(id, pw, nickname));

			} else if (num == 2) { // 로그인
				System.out.println(
						"============================================== 로그인 ==============================================");
				System.out.print("[ 1P_ID 입력 ] : ");
				String P1_id = sc.next();
				System.out.print("[ 1P_Password 입력 ] : ");
				String P1_pw = sc.next();
				System.out.print("[ 2P_ID 입력 ] : ");
				String P2_id = sc.next();
				System.out.print("[ 2P_Password 입력 ] : ");
				String P2_pw = sc.next();

				LoginController loginCon = new LoginController();
				String nickname = loginCon.login(new MemberDTO(P1_id, P1_pw));
				String nickname1 = loginCon.login(new MemberDTO(P2_id, P2_pw));

				if (nickname != null) {
					System.out.println(nickname + "님 로그인에 성공하셨습니다.");
				} else {
					System.out.println("아이디와 비밀번호를 잘못입력하셨습니다.");
				}

				if (nickname1 != null) {
					System.out.println(nickname1 + "님 로그인에 성공하셨습니다.");
				} else {
					System.out.println("아이디와 비밀번호를 잘못입력하셨습니다.");
				}

				// 게임시작
				if (nickname != null && nickname1 != null) {

					System.out.println("=============== 게임시작(주사위 그림) ================");

					ScoreBoradController scon = new ScoreBoradController();
					Yacht ya = new Yacht();
					DiceDTO ddto = new DiceDTO();
					HashMapController hmcon = new HashMapController();

					int turn = 0;
					int sco = 0;

//					ArrayList<Integer> test = new ArrayList<>();
//					test.add(6);
//					test.add(6);
//					test.add(6);
//					test.add(4);
//					test.add(5);

//					HashMap<Integer, Integer> yaMap = new HashMap<Integer, Integer>();
//					yaMap.put(1, ya.aces());
//					yaMap.put(2, ya.deuces());
//					yaMap.put(3, ya.threes());
//					yaMap.put(4, ya.fours());
//					yaMap.put(5, ya.fives());
//					yaMap.put(6, ya.sixex());
//					yaMap.put(7, 7);
//					yaMap.put(8, ya.choice());
//					yaMap.put(9, ya.fourOfAKind());
//					yaMap.put(10, ya.fullHouse());
//					yaMap.put(11, ya.littleStraight());
//					yaMap.put(12, ya.bigStraight());
//					yaMap.put(13, ya.Yacht());

					while (turn < 13) {

						HashMap<Integer, Integer> yaMap = new HashMap<>();
						scon.show();

						yaMap = hmcon.makeHashMap(ddto.dicelist());

						scon.show();
						while (true) {
							int cnt = 0;

							System.out.print("원하는 족보 번호 : ");
							int cho = sc.nextInt();

							if (cho < 1 || cho > 13) {
								cnt = 2;
							} else {
								sco = yaMap.get(cho);
								cnt = scon.Update_1P(sco, cho);
							}

							if (cnt == 1) {
								System.out.println("이미 입력된 번호입니다.");
							} else if (cnt == 2) {
								System.out.println("잘못된 번호입니다.");
							} else if (cnt <= 0) {
								System.out.println("점수를 저장했습니다.");
								break;
							}
						}

						System.out.println("=========2p==========");

						scon.show();

						yaMap = hmcon.makeHashMap(ddto.dicelist());
						scon.show();
						while (true) {
							int cnt = 0;
							System.out.print("원하는 족보 번호 : ");
							int cho = sc.nextInt();

							if (cho < 1 || cho > 13) {
								cnt = 2;
							} else {
								sco = yaMap.get(cho);
								cnt = scon.Update_2P(sco, cho);
							}				

							if (cnt == 1) {
								System.out.println("이미 입력된 번호입니다.");
							} else if (cnt == 2) {
								System.out.println("잘못된 번호입니다.");
							} else if (cnt <= 0) {
								System.out.println("점수를 저장했습니다.");
								break;
							}
						}
						System.out.println("====================");

						turn++;
					}

					System.out.println("==========================================");
					System.out.println("==========================================");
					System.out.println("게임이 종료되었습니다!");
					System.out.println("최종 점수판을 공개합니다!");
					scon.show();
					String winner = "";
					String loser = "";
					if (scon.total_1P() > scon.total_2P()) {
						System.out.println("승자는 1Player입니다!");
						winner = nickname;
						loser = nickname1;
					} else if (scon.total_1P() < scon.total_2P()) {
						System.out.println("승자는 2Player입니다!");
						winner = nickname1;
						loser = nickname;
					} else {
						System.out.println("무승부 입니다!");
					}
					j.plusPoint(winner);
					j.minusPoint(loser);
				}

			} else if (num == 3) { // 랭킹확인
				System.out.println(
						"============================================== 랭킹확인 ==============================================");
				MemberDAO dao = new MemberDAO();
				ArrayList<MemberDTO> Rank = dao.Rank();
				for (int i = 0; i < Rank.size(); i++) {
					if (Rank.get(i).getPoint() != 0) {
						System.out.println(i + 1 + "등 nickname : " + Rank.get(i).getNickname() + ", point : "
								+ Rank.get(i).getPoint());
					}
				}

			}

			else if (num == 4) {
				System.out.println(
						"============================================== 프로그램 종료 ==============================================");
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				System.out.println("숫자를 다시 입력해주세요.");
				System.out.println();
			}

		}

	}
}
