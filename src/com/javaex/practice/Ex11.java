package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월급을 입력하세요");
		int b = 120;
		int i = sc.nextInt();
		System.out.println("10년동안 "+"최대 "+"저축액은 "+i*b+"원 "+"");
		sc.close();
	}
}
