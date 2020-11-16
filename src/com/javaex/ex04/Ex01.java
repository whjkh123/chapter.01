package com.javaex.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int java =  0;
		
		while(java < 5) {
			System.out.println("I like Java" + java);
			java++;
		}
		sc.close();
		
	}

}
