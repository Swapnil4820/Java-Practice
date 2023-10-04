package com.java.practice;
/*
 * Take two inputs integers from user as a(10) and b(20)
 * res=10+20=30
 * output: Sum of numbers is 30
 */
import java.util.Scanner;

public class UserInput {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a+b;
		System.out.print("Sum of numbers is:"+ res);
	}
}
