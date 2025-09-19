package edu.kh.control.branch;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===ATM 프로그램 시작===");
		System.out.println("현재잔액:10000원");

		int money = 10000;
		int input = 5;
		int sum = 0;

		while (input != 4) {

			System.out.println("메뉴를 선택하세요:");
			System.out.println("1. 입금하기");
			System.out.println("2. 출금하기");
			System.out.println("3. 잔액조회");
			System.out.println("4. 종료");

			System.out.print(">> ");
			input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("1. 입금하기");

				System.out.print("입금할 금액을 입력하세요 : ");
				int num1 = sc.nextInt();
				sum = num1 + money;
				System.out.println("입금 완료! 현재 잔액:" + sum);

				break;
			case 2:
				System.out.println("2. 출금하기");

				System.out.print("출금할 금액을 입력하세요:");
				int num2 = sc.nextInt();

				if (sum < num2) {
					System.out.print("잔액 부족! 현재 잔액은" + (sum) + "원입니다.");
				} else {
					System.out.print("출금 완료! 현재 잔액은" + (sum - num2) + "원입니다.");

				}
				break;
			case 3:
				System.out.println("3. 잔액조회");
				System.out.println("현재잔액은:" + sum + "원입니다.");
				break;
			default:
				System.out.println("4. 종료");
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다!");

			}

		}
	}
}
