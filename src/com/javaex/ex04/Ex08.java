package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
				
		int star = 1;
		
		for(int line = 1; line <= 6; line++) {
			for(int x = 0; x < star; x++) {
				System.out.print('*');
			}						
			star += 1;
			System.out.println();
		}
	}
}