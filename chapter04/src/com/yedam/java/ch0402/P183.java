package com.yedam.java.ch0402;

public class P183 {

	public static void main(String[] args) {
		// Q3
		while(true) {
			int ran = (int)(Math.random() * 7) + 1;
			int ran2 = (int)(Math.random() * 7) + 1;
			System.out.println(ran + " + " + ran2 + " = " + (ran + ran2));
			if(ran + ran2 == 5) {
				break;
			}
		}
		
		// Q6
		// 1) 네줄을 출력하는 부분을 담당하는 for문 처리
		for(int len = 1; len <= 4; len++) {
			// 2) 한줄을 구성하는 부분
			// => 네칸을 출력하는 부분을 담당하는 for문 처리
			for(int ch = 4; ch > 0; ch--) {
				if(ch > len) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
