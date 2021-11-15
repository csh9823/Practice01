package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨: ");
		double f= sc.nextDouble();
		double a= (double)5;
		double b= (double)9;
		double resut = a/b*(f-32.0);
		System.out.println("화씨 "+f+" 의 섭씨온도는"+resut+" 입니다.");
		sc.close();
	}

}
