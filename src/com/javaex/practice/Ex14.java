package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("가로를 입력하세요");
		double a= sc.nextDouble();
		
		System.out.println("세로를 입력하세요");
		
		double b= sc.nextDouble();
		
		double c= a*2+b*2;
		
		System.out.println("사각형의 넓이는 "+a*b+"\n사격형의 둘레는 "+c);
		sc.close();
	}

}
