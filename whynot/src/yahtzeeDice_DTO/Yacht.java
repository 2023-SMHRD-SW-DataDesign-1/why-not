package yahtzeeDice_DTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Yacht {

	ArrayList<Integer> counts; // 주사위 값의 갯수를 저장할 리스트

	public void countDices(ArrayList<Integer> finalDice) { // 주사위의 값의 갯수를 세는 메소드
		counts = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0)); // 0 넣어주기

		for (int i = 0; i < finalDice.size(); i++) {
			counts.set(finalDice.get(i) - 1, counts.get(finalDice.get(i) - 1) + 1); // 원래 있던 counts리스트 값에 +1 해준다.

		}
	}

	public int aces() { // 1이 나온 주사위 눈의 총합. 최대 5점

		return counts.get(0) * 1;
	}

	public int deuces() { // 2가 나온 주사위 눈의 총합. 최대 10점.

		return counts.get(1) * 2;
	}

	public int threes() { // 3이 나온 주사위 눈의 총합. 최대 15점

		return counts.get(2) * 3;
	}

	public int fours() { // 4가 나온 주사위 눈의 총합. 최대 20점.

		return counts.get(3) * 4;
	}

	public int fives() { // 5가 나온 주사위 눈의 총합. 최대 25점.

		return counts.get(4) * 5;
	}

	public int sixex() { // 6이 나온 주사위 눈의 총합. 최대 30점.

		return counts.get(5) * 6;
	}

	// 동일한 주사위 눈 4개의 총합. = 최대 24점.
	public int fourOfAKind() {
		int point = 0;

		for (int i = 0; i < counts.size(); i++) {
			if (counts.get(i) == 4) {
				point = (i + 1) * 4;
			}
		}
		return point;
	}

	// 주사위 눈 5개의 총합. = 최대 28점.
	public int fullHouse() {
		int point = 0;
		boolean check1 = false;
		boolean check2 = false;

		for (int i = 0; i < counts.size(); i++) {
			if (counts.get(i) == 3) {

				check1 = true;
				point += (i + 1) * 3;

			}
			if (counts.get(i) == 2) {
				check2 = true;
				point += point + (i + 1) * 2;

			}

		}
		if (check1 && check2)
			return point;
		else
			return 0;

	}

	public int littleStraight() { // 주사위 눈이 각각 1, 2, 3, 4, 5일 때. 고정 30점
		int point = 0;


		if (counts.get(2) >= 1 && counts.get(3) >= 1) {
			if ((counts.get(0) >= 1 && counts.get(1) >= 1) || (counts.get(1) >= 1 && counts.get(4) >= 1)
					|| (counts.get(4) >= 1 && counts.get(5) >= 1)) {
				point = 20;

			}
//				if(counts.get(1) >= 1 && counts.get(4) >= 1) {
//					point = 30;
//				}
//				if(counts.get(4) >= 1 && counts.get(5) >= 1) {
//					point = 30;
//				}
		}
		

		return point;
	}

	public int bigStraight() { // 5개의 주사위가 값이 이어질때 30점 
		int point = 0;


		if (counts.get(1) >= 1 && counts.get(2) >= 1 && counts.get(3) >= 1 && counts.get(4) >= 1) {
			if (counts.get(0) >= 1) {
				point = 30;
			}
			if (counts.get(5) >= 1) {
				point = 30;
			}
		}
		

		return point;
	}

	public int Yacht() { // 동일한 주사위 눈이 5개일 때 = 고정 50점.
		int point = 0;

		for (int i = 0; i < counts.size(); i++) {
			if (counts.get(i) == 5) {
				point = 50;
			}
		}

		return point;
	}

	public int choice() { // 주사위 눈 5개의 총합. 최대 30점.
		int point = 0;

		for (int i = 0; i < counts.size(); i++) {
			point += counts.get(i) * (i + 1);
		}

		return point;
	}
}
