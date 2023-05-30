package Controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class dice {

	public static void main(String[] args) {

		// 1. 도구준비
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		// 2. 변수 및 arraylist
		ArrayList<Integer> finalDice = new ArrayList<Integer>(); // 최종주사위 저장
		ArrayList<Integer> pickDice = new ArrayList<Integer>(); // 주사위 던진 값들 저장
		int dice_life = 3; // 주사위 던질 기회
		int dice_count = 5;
		int print = 0;
		finalDice.clear();  // 초기화
		
		// 3. 주사위 돌리기(랜덤숫자 산출)
		while (true) {
			pickDice.clear();
			// 처음 5개 주사위 값
			
			
			for (int i = 0; i < dice_count; i++) {
				pickDice.add(i, rd.nextInt(1, 6));
				System.out.print("[" + (i + 1) + "번]:  " + pickDice.get(i) + "  ");
			}
			dice_life -= 1; // 횟수 차감

				
				System.out.println();
				System.out.println();
				System.out.println("**남길 주사위를 선택해주세요~**");
				System.out.print("1. 선택하기   2. 선택안하기 >> ");
				int num = sc.nextInt(); // 선택하기 값 저장 변수
				
				
				
				if (num == 1) {
					System.out.print("1-1. 선택할 주사위의 번호를 이어서 숫자만 입력해주세요~ ex) 123 >>");
					num = sc.nextInt();
					while (true) {
						int pickNum = num % 10; // 숫자 분리 후 저장
						num = num / 10;
						finalDice.add(pickDice.get(pickNum - 1));
						dice_count-=1;
						print += 1;
						if(num == 0) {
							System.out.print("지금까지 저장된 주사위: ");
							for(int i = 0; i<print ; i++) {
								System.out.print(finalDice.get(i) + "  ");
							}
							System.out.println();
							break;
						}
					}
				}else if(num==2) {
					System.out.println("최종주사위로 선택됩니다.");
					for(int i=0 ; i<dice_count; i++) {
						finalDice.add(pickDice.get(i));
					}
					
					System.out.print("최종주사위: ");
					for(int i = 0; i<dice_count ; i++) {
						System.out.print(finalDice.get(i) + "  ");
					}
					break;
				}			
				
				
			
			
			if (dice_life == 1 || dice_count==1 ) {
				System.out.println();
				for (int i = 0; i < dice_count; i++) {
					finalDice.add(i, rd.nextInt(1, 6));
					System.out.print("[" + (i + 1) + "번]:  " + finalDice.get(i) + "  ");
				}
				System.out.println();
               
                System.out.print("최종주사위: ");
				for(int i = 0; i<dice_count ; i++) {
					System.out.print(finalDice.get(i) + "  ");
				}
				break;
			}
			System.out.println();
		}
			// 4.
//		System.out.println(finalDice.get(0));
//		System.out.println(finalDice.get(1));
//		System.out.println(finalDice.get(2));
//		System.out.println(finalDice.get(3));
//		System.out.println(finalDice.get(4));

//		}


	}
	
}
