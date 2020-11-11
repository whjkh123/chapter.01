package com.javaex.ex01;

public class Ex02 {
	public static void main(String[] args) {
		
		//실수형
		double var01 = 3.14;
		System.out.println(var01);
		float var02 = 3.14F;//float값 뒤에 F 사용
		System.out.println(var02);
		
		//double형이 좀 더 정확한 값을 표현
		double var03;
		float var04;
		var03 = 0.1234567890123456789;
		var04 = 0.1234567809123456789F;
		System.out.println(var03);
		System.out.println(var04);
		
		//변수표현
		int var11;//변수 선언 < 값 대입
		var11 = 25;
		System.out.println(var11);
		
		int var12 = 25;//변수 선언 + 값 대입
		System.out.println(var12);
		//
		int v01;//변수 선언 > 값 대입
		int v02;
		int v03;
		v01 = 25;
		v02 = 26;
		v03 = 27;
		
		int v04 = 25;//변수 선언 + 값 대입
		int v05 = 26;
		int v06 = 27;
	}

}
