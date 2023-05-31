package function;

public class ScoreBorad {

	String borad[] = { "1.  Aces", "2.  Deuces", "3.  Threes", "4.  Fours", "5.  Fives", "6.  Sixes", "\t Bonus",
			"8.  Choice", "9.  4 of a Kind", "10. Full House", "11. S.Straight", "12. L.Straight", "13. Yacht" };

	int score_1P[] = new int[13];
	int count_1P[] = new int[13];

	int score_2P[] = new int[13];
	int count_2P[] = new int[13];

	int totalScore_1P = 0;
	int totalScore_2P = 0;



	public int scoreUpdate_1P(int score, int choice) {

		int check = 0;

		if (count_1P[choice - 1] == 0) {
			this.score_1P[choice - 1] = score;
			if (choice < 7) {
				bonusScore_1P();
			}
			count_1P[choice - 1]++;

		} else if (count_1P[choice - 1] > 0) {
			check++;
		}

		return check;
	}

	public int scoreUpdate_2P(int score, int choice) {

		int check = 0;

		if (count_2P[choice - 1] == 0) {
			this.score_2P[choice - 1] = score;
			if (choice < 7) {
				bonusScore_2P();
			}
			count_2P[choice - 1]++;

		} else if (count_2P[choice - 1] > 0) {
			check++;
		}

		return check;
	}

	public void totalUpdate_1P() {
		int sum = 0;
		for (int x : score_1P) {
			sum += x;
		}

		totalScore_1P = sum;
	}

	public void totalUpdate_2P() {
		int sum = 0;
		for (int x : score_2P) {
			sum += x;
		}

		totalScore_2P = sum;
	}

	public void bonusScore_1P() {
		int sum = 0;
		for (int i = 0; i < 6; i++) {
			sum += score_1P[i];
		}

		if (sum >= 63) {
			score_1P[6] = 35;
		} else {
			score_1P[6] = 0;
		}
	}

	public void bonusScore_2P() {
		int sum = 0;
		for (int i = 0; i < 6; i++) {
			sum += score_2P[i];
		}

		if (sum >= 63) {
			score_2P[6] = 35;
		} else {
			score_2P[6] = 0;
		}
	}

	public void showScoreBorad() {

		System.out.println("=============================================");
		for (int i = 0; i < 13; i++) {
			System.out.println(borad[i] + "\t" + ":" + "\t" + score_1P[i] + "\tㅣ\t" + score_2P[i] + " ㅣㅣ");

		}
		System.out.println();
		System.out.println("\t Total \t:\t" + getTotalScore_1P() + "\tㅣ\t" + getTotalScore_2P() + " ㅣㅣ");
		System.out.println("============================================");
	}

	public String[] getBorad() {
		return borad;
	}

	public int getTotalScore_1P() {
		totalUpdate_1P();
		return totalScore_1P;
	}

	public int getTotalScore_2P() {
		totalUpdate_2P();
		return totalScore_2P;
	}

	public int Update_1P(int score, int choice) {
		int cnt = 0;

		if (choice > 13 || choice == 7 || choice < 1) {
			cnt = 2;
			return cnt;
		}

		int check = scoreUpdate_1P(score, choice);

		if (check > 0) {
			cnt = 1;
		} else {
			cnt = 0;
		}
		return cnt;
	}

	public int Update_2P(int score, int choice) {
		int cnt = 0;

		if (choice > 13 || choice == 7 || choice < 1) {
			cnt = 2;
			return cnt;
		}
		int check = scoreUpdate_2P(score, choice);

		if (check > 0) {
			cnt = 1;
		} else {
			cnt = 0;
		}
		return cnt;
	}

}
