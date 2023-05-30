package View;

import Model.ScoreBorad;

public class ScoreBorad_Test {

	public static void main(String[] args) {

		int num = 30;
		int num2 = 5;

		ScoreBorad score = new ScoreBorad();

		score.scoreUpdate(num, num2);

		int[] scoreNum = score.getScore();
		String[] borad = score.getBorad();

		for (int i = 0; i < 13; i++) {
			System.out.println(borad[i] + "\t" + ":" + "\t" + scoreNum[i]);

		}
		System.out.println();

		int total = score.totalUpdate();
		
		System.out.println("Total \t : \t" + total);
	}

}
