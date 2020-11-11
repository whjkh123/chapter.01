package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		//산술연산자
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println("=======");
		
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println("=======");
		
		System.out.println(7.0/8.0);
		System.out.println(7.0%8.0);
		System.out.println("=======");
		
		//부호연산자
		int var01 = -3;
		System.out.println(var01);
		System.out.println(-var01);
		System.out.println(+var01);
		System.out.println("=======");
		
		//증감연산자
		System.out.println(a);
		System.out.println(++a);//실제 변수 a값 변경
		System.out.println(a);
		
		System.out.println("=======");
		
		System.out.println(b);
		System.out.println(b++);//실제 변수 b값 고정
		System.out.println(b);
		
		System.out.println("=======");
		
		System.out.println(a);
		System.out.println(--a);//실제 변수 a값 변형
		System.out.println(a);
		
		System.out.println("=======");
		
		System.out.println(b);
		System.out.println(b--);//실제 변수 b값 고정
		System.out.println(b);
		
		System.out.println("=======");
		
		//관계연산자
		int n1 = 5;
		int n2 = 3;
		System.out.println(n1 < n2);
		System.out.println(n1 > n2);
		
		System.out.println("=======");
		
		System.out.println(n1 <= n2);
		System.out.println(n1 >= n2);
		
		System.out.println("=======");
		
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		System.out.println("=======");
		
		//&&연산자
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("=======");
		
		//||연산자
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("=======");
		
		//!연산자
		System.out.println(!true);
		System.out.println(!false);

	}

}
