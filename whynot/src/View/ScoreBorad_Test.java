package View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Controller.ScoreBoradController;
import yahtzeeDice_DTO.Yacht;

public class ScoreBorad_Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ScoreBoradController scon = new ScoreBoradController();
		Yacht ya = new Yacht();
	
		int turn = 0;
		int sco = 0;
		
		ArrayList<Integer> test = new ArrayList<>();
		test.add(1);
		test.add(3);
		test.add(2);
		test.add(4);
		test.add(5);
		
		ya.countDices(test);
		
		HashMap<Integer, Integer> yaMap = new HashMap<Integer, Integer>();
		yaMap.put(1, ya.aces());
		yaMap.put(2, ya.deuces());
		yaMap.put(3, ya.threes());
		yaMap.put(4, ya.fours());
		yaMap.put(5, ya.fives());
		yaMap.put(6, ya.sixex());
		yaMap.put(8, ya.choice());
		yaMap.put(9, ya.fourOfAKind());
		yaMap.put(10, ya.fullHouse());
		yaMap.put(11, ya.littleStraight());
		yaMap.put(12, ya.bigStraight());
		yaMap.put(13, ya.Yacht());
		
		
		while (turn < 3) {

			scon.show();
			while (true) {				
				
				System.out.print("번호 : ");
				int cho = scan.nextInt();
				
				sco = yaMap.get(cho);
				
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

				System.out.print("번호 : ");
				int cho = scan.nextInt();

				sco = yaMap.get(cho);
				
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
