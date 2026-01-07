package com.yedam.java.ch1401.chek;

public class Q4 {

	public static void main(String[] args) {
		// test
		while(true) {
			int randomNum = (int)(Math.random() * 16) + 5;
			System.out.println(randomNum);
			if(randomNum == 20) {
				break;
			}
		}

	}

}
