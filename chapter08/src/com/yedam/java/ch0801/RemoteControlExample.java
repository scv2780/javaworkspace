package com.yedam.java.ch0801;

import java.util.Scanner;

public class RemoteControlExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RemoteControl rc = null;
		while (true) {

			int selected = Integer.parseInt(sc.nextLine());

			if (selected == 1) { // 페어링 1번 : TV
				rc = new Television();
				rc.turnOn();
			} else if (selected == 2) { // 페어링 2번 : Audio
				rc = new Audio();
				rc.turnOn();
				rc.setVolume(12);
			} else {
				break;
			}
		}
		System.out.println("종료");
		sc.close();
		
		Television tv = new Television(); // 이 방식과 위의 방식 둘중 하나를 씀, 위에가 더 많이 씀

	}

}
