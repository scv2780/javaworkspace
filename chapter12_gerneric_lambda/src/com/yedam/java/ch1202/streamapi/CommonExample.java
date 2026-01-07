package com.yedam.java.ch1202.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		// Stream API : 컬렉션, 배열 등읠 데이터 소스로부터 데이터를 받아와서
		//              원하는 형태로 가공하거나 필터링할 수 있는 기능을 제공
		List<Integer> evenNumbers = numbers.stream() // 1) stream을 연다
									.filter(n -> n%2 == 0) // 2) 중간연산
									.collect(Collectors.toList());
		evenNumbers.stream().forEach(System.out::println);

	}

}
