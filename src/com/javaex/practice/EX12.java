package com.javaex.practice;

import java.util.Scanner;

public class EX12 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double b =3.14;
		
		System.out.println("반지름을 입력하세요");
		double i= sc.nextDouble();
		double c = i*i;
		System.out.println("원의 "+"넓이는 "+c*b);
		sc.close();
	}

}
