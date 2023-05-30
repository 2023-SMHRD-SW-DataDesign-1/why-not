package Model;

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
			bonusScore_1P();
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
			bonusScore_2P();
			count_2P[choice - 1]++;

		} else if (count_2P[choice - 1] > 0) {
			check++;
		}

		return check;
	}

	public int totalUpdate_1P() {
		int sum = 0;
		for (int x : score_1P) {
			sum += x;
		}

		totalScore_1P = sum;

		return totalScore_1P;
	}

	public int totalUpdate_2P() {
		int sum = 0;
		for (int x : score_2P) {
			sum += x;
		}

		totalScore_2P = sum;

		return totalScore_2P;
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
		System.out.println("\t Total \t:\t" + totalUpdate_1P() + "\tㅣ\t" + totalUpdate_2P() + " ㅣㅣ");
		System.out.println("=============================================");
	}

	public int[] getScore_1P() {
		return score_1P;
	}

	public int[] getScore_2P() {
		return score_2P;
	}

	public String[] getBorad() {
		return borad;
	}

}
