package com.javaex.ex05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			int x = sc.nextInt();
			if(x % 3 == 0 && x > 1) {
				System.out.println("3의 배수 입니다.");
			}else if(x % 3 != 0){
				System.out.println("3의 배수가 아닙니다.");				
			}else{
				System.out.println("종료");
				break;
			}
		}		
		sc.close();
	}
	
}
