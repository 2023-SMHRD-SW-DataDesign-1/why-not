package Model;

public class ScoreBorad {

	String borad[] = { "1.  Aces", "2.  Deuces", "3.  Threes", "4.  Fours", "5.  Fives", "6.  Sixes", "7.  Bonus", "8.  Choice",
			"9.  4 of a Kind", "10. Full House", "11. S.Straight", "12. L.Straight", "13. Yacht" };
	
	int score[] = new int[13];
	
	String total = "Total";
	int totalScore = 0;

	public void scoreUpdate(int score, int choice) {
		this.score[choice - 1] = score;
	}
	
	public int totalUpdate() {
		int sum = 0;
		for(int x : score) {
			sum += x;
		}
		
		totalScore = sum;
		
		return totalScore;
	}
	
	public void bonusScore() {
		int sum = 0;
		for(int i = 0; i < 6; i++) {
			sum += score[i];
		}
		
		if(sum >= 63) {
			score[8] = 35;
		}else {
			score[8] = 0;
		}
	}

	public String[] getBorad() {
		return borad;
	}

	public int[] getScore() {
		return score;
	}

}
