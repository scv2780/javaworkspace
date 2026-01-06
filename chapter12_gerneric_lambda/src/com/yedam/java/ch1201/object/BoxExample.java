package com.yedam.java.ch1201.object;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.setContent(new Object());
		Object date = box.getContent();
		box.setContent("홍길동");
		Object name = box.getContent();
		box.setContent(1012);
		Object value = box.getContent();

	}

}
