package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("마일을 입력하세요: ");
		double b= sc.nextDouble();
		double a= b*1.609;	
		System.out.println(b+"마을은 "+a+"킬로미터 입니다.");
		sc.close();
	}
	
	
	
}
