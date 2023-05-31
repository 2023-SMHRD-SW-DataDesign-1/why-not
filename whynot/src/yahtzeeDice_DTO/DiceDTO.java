package yahtzeeDice_DTO;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DiceDTO {
	
	// methods
	public ArrayList<Integer> dicelist() {

		// 1. 도구준비
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		// 2. field
		ArrayList<Integer> finalDice = new ArrayList<Integer>(); // 최종주사위 저장
		ArrayList<Integer> pickDice = new ArrayList<Integer>(); // 주사위 던진 값들 저장
		int dice_life = 3; // 주사위 던질 기회
		int dice_begin = 5; // 초기에 던질 주사위 개수
		int dice_count = 5; // 던질 주사위 개수(계속 업데이트)
		int print = 0; // 지금까지 저장된 주사위 프린트하기 위한 변수
		
		finalDice.clear(); // 초기화

		// 3. 주사위 돌리기(랜덤숫자 산출)
		while (true) {
			pickDice.clear(); // 초기화

			// 처음 5개 주사위 값
			for (int i = 0; i < dice_count; i++) {
				pickDice.add(i, rd.nextInt(1, 6));
				System.out.print("[" + (i + 1) + "번]:  " + pickDice.get(i) + "  ");
			}
			

			System.out.println();
			System.out.println();
			System.out.println("**남길 주사위를 선택해주세요~**");
			System.out.print("1. 선택하기   2. 선택안하기 >> ");
			int num = sc.nextInt(); // 선택하기 값 저장 변수
			
			// 1,2가 아닌 번호를 입력한 경우
			while(true) {
				if(num != 1 && num != 2) {
					System.out.println("올바른 번호를 입력해주세요!");
					System.out.println();
					System.out.println("**남길 주사위를 선택해주세요~**");
					System.out.print("1. 선택하기   2. 선택안하기 >> ");
					num = sc.nextInt(); // 선택하기 값 저장 변수
				}else {
					break;
				}
				
			}
			
			// 선택하기 선택한 경우(1)
			if (num == 1) {
				dice_life -= 1; // 횟수 차감
				System.out.print("1-1. 선택할 주사위의 번호를 이어서 숫자만 입력해주세요~ ex) 123 >>");
				num = sc.nextInt();
				while (true) {
					int pickNum = num % 10; // 숫자 분리 후 저장
					num = num / 10;
					finalDice.add(pickDice.get(pickNum - 1));
					dice_count -= 1;
					// 중간에 지금까지 저장된 주사위값 보여주기
					print += 1;
					if (num == 0) {
						System.out.print("지금까지 저장된 주사위: ");
						for (int i = 0; i < print; i++) {
							System.out.print(finalDice.get(i) + "  ");
						}
						System.out.println();
						break;
					}
				}

				// 선택안하기 선택한 경우(2)
			} else if (num == 2) {
				dice_life -= 1; // 횟수 차감
			} 

			// 주사위 던질 기회가 1번만 남을 경우
			if (dice_life == 1 || dice_count == 0) {
				System.out.println();
				for (int i = 0; i < dice_count; i++) {
					finalDice.add(rd.nextInt(1, 6));
					System.out.print("[" + (i + 1) + "번]:  " + finalDice.get(i + (dice_begin - dice_count)) + "  ");
				}
				System.out.println();
				return finalDice;
				

//				System.out.println("------최종주사위가 선택되었습니다!------");
//				System.out.print("최종주사위: ");
//				for (int i = 0; i < dice_begin; i++) {
//					System.out.print(finalDice.get(i) + "  ");
//				}
//				break;
			}
			System.out.println();
		}

	}



}
	


