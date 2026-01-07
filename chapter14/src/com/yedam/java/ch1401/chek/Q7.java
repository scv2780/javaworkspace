package com.yedam.java.ch1401.chek;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		int ranNum = (int)(Math.random() * 50) + 1;
		Scanner scanner = new Scanner(System.in);
		int inputData = 0;
		
		while(true) {
			System.out.print("숫자 입력 : ");
			inputData = Integer.parseInt(scanner.nextLine());
			if(inputData < ranNum) {
				System.out.println("up하세요!!");
			} else if(inputData > ranNum) {
				System.out.println("down하세요!!");
			} else {
				System.out.println("축하합니다!!");
				break;
			}
		}

	}

}
