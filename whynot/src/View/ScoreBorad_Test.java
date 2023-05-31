package View;

import java.util.Scanner;

import Controller.ScoreBoradController;

public class ScoreBorad_Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ScoreBoradController scon = new ScoreBoradController();
	
		int turn = 0;

		while (turn < 3) {

			scon.show();
			while (true) {

				System.out.print("점수 : ");
				int sco = scan.nextInt();
				System.out.print("번호 : ");
				int cho = scan.nextInt();
				
				int cnt = scon.Update_1P(sco, cho);

				if (cnt == 1) {
					System.out.println("이미 입력된 번호입니다.");
				} else if (cnt == 2) {
					System.out.println("잘못된 번호입니다.");
				} else if (cnt <= 0) {
					System.out.println("점수를 저장했습니다.");
					break;
				}

				System.out.println("====================");
			}

			scon.show();
			while (true) {

				System.out.print("점수 : ");
				int sco = scan.nextInt();
				System.out.print("번호 : ");
				int cho = scan.nextInt();

				int cnt = scon.Update_2P(sco, cho);

				if (cnt == 1) {
					System.out.println("이미 입력된 번호입니다.");
				} else if (cnt == 2) {
					System.out.println("잘못된 번호입니다.");
				} else if (cnt <= 0) {
					System.out.println("점수를 저장했습니다.");
					break;
				}

				System.out.println("====================");
			}

			turn++;
		}

		System.out.println("==========================================");
		System.out.println("==========================================");
		System.out.println("게임이 종료되었습니다!");
		System.out.println("최종 점수판을 공개합니다!");
		scon.show();
		if (scon.total_1P() > scon.total_2P()) {
			System.out.println("승자는 1Player입니다!");
		} else if (scon.total_1P() < scon.total_2P()) {
			System.out.println("승자는 2Player입니다!");
		} else {
			System.out.println("무승부 입니다!");
		}
		
		scan.close();
	}

}
