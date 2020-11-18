package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0 && i % 3 == 0) {
				break;
			}
			System.out.println(i);
		}

	}

}
