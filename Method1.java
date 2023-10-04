package com.kn.methodInJava;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		//Take two numbers as user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers = ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//call the method
		int add=add(a,b);
		//Print the result
		System.out.println("sum = "+add);
		//Release the resource
		sc.close();
		
	}

	public static int add(int a, int b) {
		int sum=a+b;		
		return sum;
	}

}
