package com.javaex.ex05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		
		do {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계: " + sum);
		}while(num != 0);
		System.out.println("종료");
		
		sc.close();
	}

}
