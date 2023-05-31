package Controller;

import Model.ScoreBoradDTO;

public class ScoreBoradController {

	ScoreBoradDTO sbdto = new ScoreBoradDTO();
	
	public void show() {
		sbdto.showScoreBorad();
	}

	public int Update_1P(int score, int choice) {
		int cnt = 0;
		
		if (choice > 13 || choice == 7 || choice < 1) {
			cnt = 2;
			return cnt;
		}
		
		int check = sbdto.scoreUpdate_1P(score, choice);

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
		int check = sbdto.scoreUpdate_2P(score, choice);

		if (check > 0) {
			cnt = 1;
		} else {
			cnt = 0;
		}
		return cnt;
	}

	public int total_1P() {
		return sbdto.getTotalScore_1P();
	}

	public int total_2P() {
		return sbdto.getTotalScore_2P();
	}









}
