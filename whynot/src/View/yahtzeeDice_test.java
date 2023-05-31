package View;

import java.util.ArrayList;

import yahtzeeDice_DTO.DiceDTO;

public class yahtzeeDice_test {

	public static void main(String[] args) {
		

		DiceDTO DiceDTO = new DiceDTO();
		ArrayList<Integer> finalDiceArray = DiceDTO.dicelist();
		System.out.println("------최종주사위가 선택되었습니다!------");
		System.out.print("최종주사위: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(finalDiceArray.get(i) + "  ");
		}
		
		

	}

}
