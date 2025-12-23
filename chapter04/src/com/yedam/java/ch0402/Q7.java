package com.yedam.java.ch0402;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.println("선택> ");

			String inputData = scanner.nextLine();
			if (inputData.equals("1")) {
				System.out.println("예금액> ");
				String inputData1 = scanner.nextLine();
				balance += Integer.parseInt(inputData1);
				
			} else if (inputData.equals("2")) {
				System.out.println("출금액> ");
				String inputData1 = scanner.nextLine();
				if(balance > Integer.parseInt(inputData1)) {
					balance -= Integer.parseInt(inputData1);
				} else {
					System.out.println("잔고보다 출금액이 많습니다.");
				}
				
			} else if (inputData.equals("3")) {
				System.out.println("잔고> " + balance);
				
			} else if (inputData.equals("4")) {
				break;
			} else {
				System.out.println("1, 2, 3, 4 중 하나를 입력하세요.");
			}

		}
		scanner.close();
		System.out.println("프로그램 종료");

	}

}
