package com.Assignment3.bellinfo;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter the size of class");
		}
		int i = sc.nextInt();
		int Id[] = new int[i];
		String Name[] = new String[i];
		double Fee[] = new double[i];
		char Section[] = new char[i];
		Student[] size = new Student[i];
		for (int a = 0; a < size.length; a++) {
			System.out.println("Enter the Student Id:");
			Id[a] = sc.nextInt();
			System.out.println("Enter the Student Name:");
			Name[a] = sc.next();
			System.out.println("Enter the Student Fee:");
			Fee[a] = sc.nextDouble();
			System.out.println("Enter the Student Section:");
			Section[a] = sc.next().charAt(0);
		}
		System.out.println("-----------Student record Details----------------");
		System.out.println("-----Q1------Student Details Displayed as the way they are entered------------");
		for (int c = 0; c < i; c++) {
			System.out.println("St ID \tSt Name \tSt Fee \t St Section:");
			System.out.println(Id[c] + "\t" + Name[c] + "\t" + Fee[c] + "\t" + Section[c]);
		}
		System.out.println("-------Q2-----Student Details Pulled based on the Section requiements---------");
		System.out.println("\n Enter the Section name of which the details you want to pull");
		char sec = sc.next().charAt(0);
		for (int b = 0; b <= i - 1; b++) {
			if (sec == Section[b]) {

				System.out.println("Student ID \tStudent Name \tStudent Fee \t Student Section:");
				System.out.println(Id[b] + "\t" + Name[b] + "\t" + Fee[b] + "\t" + Section[b]);

			}
		}
	}
}