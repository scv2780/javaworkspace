package com.yedam.java.ch1401.chek;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택 : ");
			String inputData = scanner.nextLine();
			
			if(inputData.equals("1")) {
				System.out.print("예금액 : ");
				String inputData2 = scanner.nextLine();
				balance += Integer.parseInt(inputData2);
				
			} else if(inputData.equals("2")) {
				System.out.print("출금액 : ");
				String inputData2 = scanner.nextLine();
				
				if(balance < Integer.parseInt(inputData2)) {
					System.out.println("잔액이 부족합니다");
					System.out.println("출금 가능액 : " + balance);
				} else {
					balance -= Integer.parseInt(inputData2);
				}
				
			} else if(inputData.equals("3")) {
				System.out.println("현재 잔액 : " + balance);
				
			} else if(inputData.equals("4")) {
				System.out.println("이용해 주셔서 감사합니다!");
				break;
			} else {
				System.out.println("1, 2, 3, 4 중 번호를 입력해주세요");
			}
			
		}
		scanner.close();

	}

}
