package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수:");
		int a= sc.nextInt();
		
		int b = 500*a;
		
		System.out.print("100원 개수:");
		int c= sc.nextInt();
		int d = 100*c;
		
		System.out.print("50원 개수:");
		
		int e= sc.nextInt();
		
		sc.nextLine();
		
		int f = 50*e;
		
		System.out.print("10원 개수:");
		
		int g= sc.nextInt();
		
		sc.nextLine();
		
		int h = 10*g;
		
		System.out.println("동전의 총합은 "+(b+d+f+h)+" 원 입니다.");
		
		sc.close();
		
	}

}
