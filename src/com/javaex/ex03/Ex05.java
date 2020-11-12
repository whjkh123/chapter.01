package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		
		int time01 = sc.nextInt();
		int pay01 = 10000;
		double pay02;
		int result01;
		double result02;
		
		if(time01 <= 8) {
			pay01 = 10000;
			result01 = pay01 * time01;
			System.out.println("임금은 " + result01 + "원 입니다.");
		} else if(time01 > 8) {
			int time02 = time01 - 8;
			pay02 = pay01 * 1.5;
			result02 = (8 * pay01) + (pay02 * time02);
			System.out.println("임금은 " + (int)result02 + "원 입니다.");
		}
		sc.close();

	}

}
