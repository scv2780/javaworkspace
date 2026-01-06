package com.yedam.java.ch1201.object;

public class Box { // Box<T> 뭐든 담을수 있는 객체
	
	// Generic Type : 클래스의 필드나 메소드의 매개변수에 실제 타입 대신 선언 대문자 한글로 표시 T, A
	private Object content;
	
	public void setContent(Object content) {
		this.content = content;
	}
	
	public Object getContent() {
		return this.content;
	}

}
