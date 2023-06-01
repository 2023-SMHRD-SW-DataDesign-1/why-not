
package View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Controller.JoinController;
import Controller.LoginController;
import DAO.MemberDAO;
import DTO.MemberDTO;
import function.Dice;
import function.HashMapMake;
import function.ScoreBorad;
import javazoom.jl.player.MP3Player;

public class yahtzeeDice_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		JoinController j = new JoinController();
		MP3Player mp3 = new MP3Player();
		mp3.play("music/BGM.mp3");

		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⠈⠉⠛⠛⠿⢿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠋⠀⠀⠀⣤⣦⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠛⠛⠿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⢸⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⢰⣦⣍⠻⢿⣿⡇⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⢸⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⡞⠀⠀⠀⠀⠀⠉⠛⠃⠀⠈⠙⠈⠛⠀⠀⠀⣄⡀⠀⣄⢸⠇⡟⣾⣾⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣿⣿⠏⠘⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⣀⠀⠀⠀⠀⠀⠉⠃⠀⣿⠀⡀⢠⣾⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣿⠏⡀⢠⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⠷⠀⠀⠀⠀⠰⣦⠀⢿⠰⣷⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣷⣱⢣⡟⠄⠀⠀⠸⢷⣦⣄⡀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠸⣶⣤⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⡷⠃⠃⠈⠀⠀⠀⠀⠀⠀⠈⠉⠛⠷⣦⣄⡀⠀⠀⠙⢿⣷⡀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⢀⠀⠀⠀⠀⠀⠀⣠⣶⣶⣦⡄⠀⠀⠀⠉⠻⢷⣶⣤⡀⠉⠁⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣏⡞⠀⠀⠀⠀⠀⠀⠙⠿⠿⠿⠇⣤⣶⣶⣤⠀⠀⠈⠉⠛⠳⠄⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⢙⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠿⣿⣿⠟⣡⣶⣶⣦⡀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⠀⠀⠀⠀⣠⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⠿⠿⠟⠁⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣦⡀⠀⠘⠿⣿⡿⠇⣠⣤⣤⣄⠀⠀⠀⠀⠀⠀⠀⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣿⣶⣦⣄⣀⠀⠛⠿⠿⠋⣴⣶⣶⣦⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣤⣄⣉⠛⠛⢁⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
		System.out.println("                      ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");

		System.out.println();
		System.out.println(
				"____    ____      ___        ______  __    __  .___________. _______   __    ______  _______ ");
		System.out.println(
				"\\   \\  /   /     /   \\      /      ||  |  |  | |           ||       \\ |  |  /      ||   ____|");
		System.out.println(
				" \\   \\/   /     /  ^  \\    |  ,----'|  |__|  | `---|  |----`|  .--.  ||  | |  ,----'|  |__   ");
		System.out.println(
				"  \\_    _/     /  /_\\  \\   |  |     |   __   |     |  |     |  |  |  ||  | |  |     |   __|  ");
		System.out.println(
				"    |  |      /  _____  \\  |  `----.|  |  |  |     |  |     |  '--'  ||  | |  `----.|  |____ ");
		System.out.println(
				"    |__|     /__/     \\__\\  \\______||__|  |__|     |__|     |_______/ |__|  \\______||_______|");
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

					System.out.println(
							"========================================= 게임시작(요트 다이스) =========================================");

					ScoreBorad scon = new ScoreBorad();

					Dice ddto = new Dice();
					HashMapMake hmcon = new HashMapMake();

					int turn = 0;
					int sco = 0;

					while (turn < 12) {

						HashMap<Integer, Integer> yaMap = new HashMap<>();
						scon.showScoreBorad();
						System.out.println(
								"============================================== 1P ==============================================");
						yaMap = hmcon.makeHashMap(ddto.dicelist());

						scon.showScoreBorad();
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

						scon.showScoreBorad();
						System.out.println(
								"============================================== 2P ==============================================");

						yaMap = hmcon.makeHashMap(ddto.dicelist());
						scon.showScoreBorad();
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
						System.out.println("==========2================================");

						turn++;
					}

					System.out.println("==========================================");
					System.out.println("==========================================");
					System.out.println("게임이 종료되었습니다!");
					System.out.println("최종 점수판을 공개합니다!");
					
					scon.showScoreBorad();
					String winner = "";
					String loser = "";

					System.out.println();
					System.out.println(
							"____    __    ____  __  .__   __. .__   __.  _______ .______       __   __   __  ");
					System.out.println(
							"\\   \\  /  \\  /   / |  | |  \\ |  | |  \\ |  | |   ____||   _  \\     |  | |  | |  | ");
					System.out.println(
							" \\   \\/    \\/   /  |  | |   \\|  | |   \\|  | |  |__   |  |_)  |    |  | |  | |  | ");
					System.out.println(
							"  \\            /   |  | |  . `  | |  . `  | |   __|  |      /     |  | |  | |  | ");
					System.out.println(
							"   \\    /\\    /    |  | |  |\\   | |  |\\   | |  |____ |  |\\  \\----.|__| |__| |__| ");
					System.out.println(
							"    \\__/  \\__/     |__| |__| \\__| |__| \\__| |_______|| _| `._____|(__) (__) (__) ");
					System.out.println();

					if (scon.getTotalScore_1P() > scon.getTotalScore_2P()) {
						System.out.println("승자는 1Player입니다!");
						winner = nickname;
						loser = nickname1;
					} else if (scon.getTotalScore_1P() < scon.getTotalScore_2P()) {
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
