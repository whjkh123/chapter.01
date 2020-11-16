package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력하세요.");
		System.out.print("단: ");
		
		int dan = sc.nextInt();
		
		int result;
				
		for(int x = 1; x < 10; x++) {
			result = dan * x;
			System.out.println(dan + " * " + x + " = " + result);			
		}
		sc.close();
		
		
	}

}
