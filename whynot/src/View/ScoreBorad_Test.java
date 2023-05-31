package View;

import java.util.Scanner;

import Model.ScoreBoradDTO;

public class ScoreBorad_Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ScoreBoradDTO score = new ScoreBoradDTO();
		
		int turn = 0;
		
		while(turn < 3) {
			while(true) {
				score.showScoreBorad();
				
				System.out.print("점수 >>");
				int point = scan.nextInt();
				
				System.out.print("점수를 넣을 번호 >> ");
				int choice = scan.nextInt();
				
				while(choice > 13 || choice == 7) {
						System.out.println("잘못된 번호입니다.");
						System.out.print("점수를 넣을 번호 >> ");
						choice = scan.nextInt();					
				}
				
				
				int check = score.scoreUpdate_1P(point, choice);
				
				if (check > 0) {
					System.out.println("이미 채워진 칸입니다.");
				} else {
					System.out.println("점수를 저장했습니다.");
					break;
				}
				System.out.println("====================");
			}
			
			while(true) {
				score.showScoreBorad();
				
				System.out.print("점수 >>");
				int point = scan.nextInt();
				System.out.print("점수를 넣을 번호 >> ");
				int choice = scan.nextInt();
				
				while(choice > 13 || choice == 7) {
						System.out.println("잘못된 번호입니다.");
						System.out.print("점수를 넣을 번호 >> ");
						choice = scan.nextInt();
					
				}
				
				int check = score.scoreUpdate_2P(point, choice);
				
				if (check > 0) {
					System.out.println("이미 채워진 칸입니다.");
				} else {
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
		score.showScoreBorad();
		if(score.getTotalScore_1P() > score.getTotalScore_2P()) {
			System.out.println("승자는 1Player입니다!");
		}else if(score.getTotalScore_1P() < score.getTotalScore_2P()) {
			System.out.println("승자는 2Player입니다!");
		}else {
			System.out.println("무승부 입니다!");
		}
	}

}
