package View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

import yahtzeeDice_DTO.Yacht;

public class asdf {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Yacht y = new Yacht();
//		ArrayList<Integer> a = new ArrayList<>();
//		a.add(1);
//		a.add(1);
//		a.add(1);
//		a.add(1);
//		a.add(1);
//		y.countDices(a);
//		System.out.println(y.aces());
//		System.out.println(y.fives());
		

//		String test[] = new String[5];
//		
//	
//		
//		for(int i = 0; i < test.length; i++) {
//			test[i]="20";
//		}
//		
//		int num = Integer.parseInt(test[1]);
//		System.out.println(num+10);
		int num = 20;
		String num2 = String.valueOf(num);
		System.out.println(num2+10);
		
		String borad[] = { "1.  Aces", "2.  Deuces", "3.  Threes", "4.  Fours", "5.  Fives", "6.  Sixes", "\t Bonus",
				"8.  Choice", "9.  4 of a Kind", "10. Full House", "11. S.Straight", "12. L.Straight", "13. Yacht" };
		
		String test[] = new String[13];
		Arrays.fill(test, "");
		String score_1P[] = new String[13];
		Arrays.fill(score_1P, "");
		
		System.out.println("=============================================");
		for (int i = 0; i < 13; i++) {
			System.out.println(borad[i] + "\t" + ":" + "\t" + test[i] +  " ㅣㅣ");

		}
		
		String[] dice = new String[6];

        // ASCII representations of dice faces
        dice[0] = "+-------+\n|       |\n|   o   |\n|       |\n+-------+";
        dice[1] = "+-------+\n| o     |\n|       |\n|     o |\n+-------+";
        dice[2] = "+-------+\n| o     |\n|   o   |\n|     o |\n+-------+";
        dice[3] = "+-------+\n| o   o |\n|       |\n| o   o |\n+-------+";
        dice[4] = "+-------+\n| o   o |\n|   o   |\n| o   o |\n+-------+";
        dice[5] = "+-------+\n| o   o |\n| o   o |\n| o   o |\n+-------+";

        for (int i = 0; i < 6; i++) {
            System.out.println("Dice " + (i + 1) + ":\n" + dice[i] + "\n");
        }
	}

}
