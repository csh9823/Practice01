package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름: ");
		
		double a= sc.nextInt();
		
		double c = a*a*a;
		
		double b =(double)4/(double)3;
		
		double  d= b*3.14*c; 
		
		System.out.println("구의 부피는: "+d);
		sc.close();
		
	}
}
