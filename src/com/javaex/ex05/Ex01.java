package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		
		int x = 1;		
		
		while(true) {
			if(x % 6 == 0 && x % 14 == 0) {
				System.out.println(x);
				break;
			}
			x++;
		}

	}

}
