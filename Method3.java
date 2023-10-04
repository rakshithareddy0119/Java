package com.kn.methodInJava;

import java.util.Scanner;

public class Method3 {

	public static void main(String[] args) {

		short sub = sub();
		System.out.println("Substraction=" + sub);
	}

	public static short sub() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		short a = sc.nextShort();
		short b = sc.nextShort();
		short sub = (short) (a-b);
		sc.close();
		return sub;
		
	}

}
