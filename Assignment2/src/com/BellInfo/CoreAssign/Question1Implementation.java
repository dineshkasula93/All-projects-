package com.BellInfo.CoreAssign;

import java.util.Scanner;

public class Question1Implementation implements Question1 {
	public float A(int a, int b, float c, float d) {
		if (a > b) {
			c = a / b;
			System.out.println("Value of c:"+c);
			return c;
		} else {
			d = a * b;
			System.out.println("Value of d:"+d);
			return d;
		}
	}

	public String B(String f, String e) {
		String f1 = f + "\t" + e;
		System.out.println(f1);
		return f1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Question1Implementation Q1 = new Question1Implementation();
		System.out.println("Enter the value of A and B");
		Q1.A(s.nextInt(), s.nextInt(), 10, 20);
		System.out.println("Enter the String E and F");
		Q1.B(s.next(), s.next());
		
		StringBuilder sb = new StringBuilder();
	}

	
}
