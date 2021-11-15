package com.javaex.practice;

import java.util.Scanner;

public class EX13 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("환전할 원화를 입력하세요");
		int a= sc.nextInt();
		
		double b =1230.95;
		System.out.println("받으실 "+"달러는 "+a/b);
		
		sc.close();
		
	}
}
