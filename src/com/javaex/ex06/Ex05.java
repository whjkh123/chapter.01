package com.javaex.ex06;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] num01 = {3,6,9};		
		
		int[] num02 = new int[3];
		num02[0] = num01[0];
		num02[1] = num01[1];
		num02[2] = num01[2];
		
		for(int i = 0; i < num01.length; i++) {
			System.out.println(num01[i]);
		}
		
		for(int i = 0; i < num02.length; i++) {
			System.out.println(num02[i]);
		}
	}

}
