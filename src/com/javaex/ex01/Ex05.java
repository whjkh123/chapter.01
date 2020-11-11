package com.javaex.ex01;

public class Ex05 {
	public static void main(String[] args) {
		final double pi = 3.14;
		
		//일반적인 경우
		double result01 = pi*5*5;
		System.out.println(result01);
		
		//pi값을 변경했을 경우
		//pi = 3.141519;
		double result02 = pi*5*5;
		System.out.println(result02);
		
		//상수정의
		final double PI = 3.14;
	}
	
}
