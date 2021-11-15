package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("상품가격: ");
		double a= sc.nextDouble();
		System.out.print("받은돈: ");
		double b= sc.nextDouble();
		double c = b-a;
		System.out.println("==================");
		System.out.println("받은돈: "+b);
		System.out.println("상품가격: "+a);
		System.out.println("부가세: "+a/10);
		System.out.println("잔액: "+c);
		sc.close();
	}
}
