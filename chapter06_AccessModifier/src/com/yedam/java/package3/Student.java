package com.yedam.java.package3;

public class Student {
	private String name;
	private int koScore;
	private int maScore;
	private int enScore;
	
	//생성자
	public Student() {}
	public Student(String name, int koScore, int maScore, int enScore) {
		this.name = name;
		this.koScore = koScore;
		this.maScore = maScore;
		this.enScore = enScore;
	}
	
	// getter/setter
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKoScore() {
		return this.koScore;
	}
	
	public void setKoScore(int koScore) {
		this.koScore = koScore;
	}
	
	public int getMaScore() {
		return this.maScore;
	}
	
	public void setMaScore(int maScore) {
		this.maScore = maScore;
	}
	
	public int getEnScore() {
		return this.enScore;
	}
	
	public void setEnScore(int enScore) {
		this.enScore = enScore;
	}
	
	// 기능
	public void showInfo() {
		String info = this.name + " | " 
					+ this.koScore + " | " 
					+ this.maScore + " | " 
					+ this.enScore;
		System.out.println(info);
	}
}
