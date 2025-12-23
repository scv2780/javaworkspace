package com.yedam.java.ch0302;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		// 교재 P151, 6번
		int value = 356;
		int result = value - (value%100);
		// int result = (value/100) * 100;
		System.out.println(result); // 300

	}

}
