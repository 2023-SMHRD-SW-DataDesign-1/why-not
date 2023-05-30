package View;

import Model.ScoreBorad;

public class ScoreBorad_Test {

	public static void main(String[] args) {

		int num = 30;
		int num2 = 5;

		ScoreBorad score = new ScoreBorad();

		score.scoreUpdate_1P(num, num2);
		score.scoreUpdate_2P(24, 4);

		int[] score_1P = score.getScore_1P();
		int[] score_2P = score.getScore_2P();
		String[] borad = score.getBorad();

		for (int i = 0; i < 13; i++) {
			System.out.println(borad[i] + "\t" + ":" + "\t" + score_1P[i] + "\tㅣ\t" + score_2P[i]);

		}
		System.out.println();

		int total_1P = score.totalUpdate_1P();
		int total_2P = score.totalUpdate_2P();
		
		System.out.println("Total \t : \t" + total_1P + "\tㅣ\t" + total_2P);
	}

}
