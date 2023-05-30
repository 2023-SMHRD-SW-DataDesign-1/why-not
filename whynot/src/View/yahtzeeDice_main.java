package View;

import java.util.Scanner;

public class yahtzeeDice_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;

		while (true) {
			System.out.println(
					"#     #    #     #####  #     # ####### ######  ###  #####  ####### ");
			System.out.println(
					" #   #    # #   #     # #     #    #    #     #  #  #     # #       ");
			System.out.println(
					"  # #    #   #  #       #     #    #    #     #  #  #       #       ");
			System.out.println(
					"   #    #     # #       #######    #    #     #  #  #       #####   ");
			System.out.println(
					"   #    ####### #       #     #    #    #     #  #  #       #       ");
			System.out.println(
					"   #    #     # #     # #     #    #    #     #  #  #     # #       ");
			System.out.println(
					"   #    #     #  #####  #     #    #    ######  ###  #####  ####### ");
			System.out.println();
			System.out.println(
					"============================== [1] 회원가입 [2] 로그인 [3] 랭킹확인 [4] 종료 ==============================");
			System.out.print("로그인시 자동으로 게임시작! >> ");
			num = sc.nextInt();

			if (num == 1) { // 회원가입
				System.out.println(
						"============================================== 회원가입 ==============================================");
				System.out.print("[ ID 입력 ] : ");
				String id = sc.next();
				System.out.print("[ Password 입력 ] : ");
				String pw = sc.next();
				System.out.print("[ Nick-name 입력 ] : ");
				String name = sc.next();

			} else if (num == 2) { // 로그인
				System.out.println(
						"============================================== 로그인 ==============================================");
				System.out.print("[ 1P_ID 입력 ] : ");
				String P1_id = sc.next();
				System.out.print("[ 1P_Password 입력 ] : ");
				String P1_pw = sc.next();
				System.out.print("[ 2P_ID 입력 ] : ");
				String P2_id = sc.next();
				System.out.print("[ 2P_Password 입력 ] : ");
				String P2_pw = sc.next();

			} else if (num == 3) { // 랭킹확인
				System.out.println(
						"============================================== 랭킹확인 ==============================================");
				System.out.print("[ ID 입력 ] : ");
				String id = sc.next();

			} else if (num == 4) {
				System.out.println(
						"============================================== 프로그램 종료 ==============================================");
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				System.out.println("숫자를 다시 입력해주세요.");
				System.out.println();
			}

		}

	}

}
