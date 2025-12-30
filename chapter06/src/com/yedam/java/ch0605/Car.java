package com.yedam.java.ch0605;

public class Car {
	int speed;
	void run() {
		System.out.println(speed + "으로 달립니다.");
		}
	public static void test() {};
	//정적 메소드 : 인스턴스 멤버를 사용불가
	public static void main(String[] args) {
		test();
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
//객체 지향 프로그래밍 언어
//1) 추상화
//2) 캡슐화 <=> 정보은닉
//3) 상속
//4) 다형성