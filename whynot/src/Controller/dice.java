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
		ArrayList<Integer> finalDice = new ArrayList<Integer>();  // 최종주사위 배열
		int dice_num = 3;  // 주사위 던질 기회
		int dice1 = 0; // 주사위 5개 
		int dice2 = 0;
		int dice3 = 0;
		int dice4 = 0;
		int dice5 = 0;
		
		// 3. 주사위 돌리기(랜덤숫자 산출)
		while(true) {
			
			dice1 = rd.nextInt(1,6);
			dice2 = rd.nextInt(1,6);
			dice3 = rd.nextInt(1,6);
			dice4 = rd.nextInt(1,6);
			dice5 = rd.nextInt(1,6);
			dice_num -= dice_num;
			
			System.out.println("[1번]: " + dice1 + "  [2번]: " + dice2 + "  [3번]: " + dice3 + "  [4번]: " + dice4 + "  [5번]: " + dice5);
			
			System.out.println("남길 주사위를 선택해주세요~");
			System.out.print("1. 선택하기   2. 선택안하기 >> ");
			int num = sc.nextInt(); // 선택하기 값 저장 변수
			if(num == 1) {
				System.out.println("1-1. 선택할 주사위의 번호를 이어서 숫자만 입력해주세요~ ex) 123");
				num = sc.nextInt();
				int pickNum = num%10;  // 숫자 
				num = num/10;
				
				
			}
		}
		// 4. 
		
		

	}

}
