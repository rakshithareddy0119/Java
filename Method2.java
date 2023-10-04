package com.kn.methodInJava;

import java.util.Scanner;

public class Method2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double a = sc.nextDouble();
		double e = sc.nextDouble();
		div(a, e);
		sc.close();
	}

	public static void div(double a, double e) {
		double d = a / e;
		double d1=a%e;
		System.out.println("Quoitent = " + d);
		System.out.println("Reminder = "+d1);
	}

}
