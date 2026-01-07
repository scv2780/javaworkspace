package com.yedam.java.ch1101.math;

public class RandomExample {

	public static void main(String[] args) {
		// 5 ~ 20까지 범위
		int num = (int)(Math.random() * 16) + 5;
		// (int)(Math.random() * 총몇개) + 시작지점;
		// (int)(Math.random() * a) + b;
		// 마지막 숫자 = a + b - 1
		System.out.println(num);

	}

}
