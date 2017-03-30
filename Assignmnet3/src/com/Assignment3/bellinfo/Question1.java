package com.Assignment3.bellinfo;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the class:");
		int a = sc.nextInt();
		Student[] studentarray = new Student[a];
		for (int i = 0; i < studentarray.length; i++) {
			Student studentobject = new Student();
			System.out.println("Enter the Student ID:");
			studentobject.setId(sc.nextInt());
			System.out.println("Enter the Student Name:");
			studentobject.setName(sc.next());
			System.out.println("Enter the Student fee:");
			studentobject.setFee(sc.nextDouble());
			System.out.println("Enter the Student Section:");
			studentobject.setSection(sc.next().charAt(0));
			studentarray[i] = studentobject;
		}
		System.out.println("------------Class Record by Creating Student objec and storing in Array----------------");
		System.out.println("--------------------Q3---------------------------");
		Student stobject2 = new Student();
		System.out.println("St ID \tSt Name \tSt Fee \t St Section:");
		for (int i = 0; i <= a - 1; i++) {
			stobject2 = studentarray[i];
			System.out.println(stobject2.getId() + "\t" + stobject2.getName() + "\t" + stobject2.getFee() + "\t"
					+ stobject2.getSection());
		}
	}
}