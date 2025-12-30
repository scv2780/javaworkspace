package com.yedam.java.package3;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		Student[] scoreList = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.println("학생수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scoreList = new Student[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.print("이름> ");
					String name = scanner.nextLine();
					System.out.print("국어점수> ");
					int koScore = Integer.parseInt(scanner.nextLine());
					System.out.print("수학점수> ");
					int maScore = Integer.parseInt(scanner.nextLine());
					System.out.print("영어점수> ");
					int enScore = Integer.parseInt(scanner.nextLine());
					
					Student student = new Student(name, koScore, maScore, enScore);
					scoreList[i] = student;
				}

			} else if (selectNo == 3) {
				System.out.println("이름 | 국어 | 수학 | 영어");
				for (int i = 0; i < studentNum; i++) {
					scoreList[i].showInfo();
				}

			} else if (selectNo == 4) {
				String koName = null;
				String maName = null;
				String enName = null;
				int koMax = 0;
				int maMax = 0;
				int enMax = 0;
				
				for (int i = 0; i < studentNum; i++) {
					Student student = scoreList[i];
					if(koMax < student.getKoScore()) {
						koMax = student.getKoScore();
						koName = student.getName();
					}
					if(maMax < student.getMaScore()) {
						maMax = student.getMaScore();
						maName = student.getName();
					}
					if(enMax < student.getEnScore()) {
						enMax = student.getEnScore();
						enName = student.getName();
					}
				}
				
				System.out.printf("국어 최고점을 받은 학생은 %s이고 점수는 %d이다\n", koName, koMax);
				System.out.printf("수학 최고점을 받은 학생은 %s이고 점수는 %d이다\n", maName, maMax);
				System.out.printf("영어 최고점을 받은 학생은 %s이고 점수는 %d이다\n", enName, enMax);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
