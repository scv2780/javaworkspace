package com.yedam.java.ch1201.generic;

public class Box<T> { // Box<T> 뭐든 담을수 있는 객체
	
	// Generic : 아직 설계단계에서 결정되지 않은 타입을 파라미터로
	//           처리하고 실제 사용할 때 구체적인 타입으로 대체시키는 기능
	// Type parameter : 클래스의 필드나 메소드의 매개변수에 
	//                  실제 타입 대신 선언 대문자 한글로 표시 T, A
	// Generic Type : 타입 파라미터를 가진 클래스 or 인터페이스
	private T content;
	
	public void setContent(T content) {
		this.content = content;
	}
	
	public T getContent() {
		return this.content;
	}

}
