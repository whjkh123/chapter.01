package com.javaex.ex06;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] left = {10,20,30};
		int[] right = {20,30,40};
		
		if(left.length == right.length) {
			for(int i = 0; i < left.length; i++) {
				if(left[i] != right[i]) {
					System.out.println(i + "번째 값이 다릅니다.");
				}
			}
		}
		else {
			System.out.println("두 배열의 크기가 다릅니다.");
		}
		
	}

}
