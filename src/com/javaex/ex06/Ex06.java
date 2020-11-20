package com.javaex.ex06;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] arrA = {3,6,9};
		int[] arrB = arrA;
		
		for(int i = 0; i < arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		for(int i = 0; i < arrB.length; i++) {
			System.out.println(arrB[i]);
		}
	}

}
