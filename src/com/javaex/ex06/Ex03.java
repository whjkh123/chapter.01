package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] num = new int[6];
		
		num[0] = (int)(Math.random()*45)+1;
		num[1] = (int)(Math.random()*45)+1;
		num[2] = (int)(Math.random()*45)+1;
		num[3] = (int)(Math.random()*45)+1;
		num[4] = (int)(Math.random()*45)+1;
		num[5] = (int)(Math.random()*45)+1;
		
		/*
		for(int i = 0; i <= 5; i++) {
			num[0] = (int)(Math.random()*45)+1;
		}
		*/
		/*
		for(int i = 0; i < num.length; i++) {
			num[0] = (int)(Math.random()*45)+1;
		}
		*/
		
		for(int i = 0; i <= 5; i++) {
			System.out.println(num[i]);
		}
	}

}
