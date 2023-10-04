package com.kn.Rainbow;

import java.util.Scanner;

public class RainbowDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Rainbow rainbow = new Rainbow();
		System.out.println("enter a colour");
		String colour = scan.next();
		rainbow.checkRainbowColour(colour);
		
	}

}
