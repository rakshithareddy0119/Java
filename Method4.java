package com.kn.methodInJava;

import java.util.Scanner;

public class Method4 {

	public static void main(String[] args) {
		mul();
	}

	public static void mul() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double ans = a * b * c;
		System.out.println("Multiply of three numbers==" + ans);
		sc.close();
	}

}
