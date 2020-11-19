package com.javaex.ex06;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] intArray = new int[3];
		
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		/*
		int[] intArray = new int[] {3, 6, 9};
		*/
		/*
		int[] intArray = {3, 6, 9};
		*/
		
		for(int i = 0; i <= 2; i++) {
			System.out.println(intArray[i]);
		}
	}
}
