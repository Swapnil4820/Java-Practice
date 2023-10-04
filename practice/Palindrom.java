package com.java.practice;
/*
 num=121
 rev=0
 temp=121
 
 iteration1:rem=1
 			rev=0*10+1=1
 			num=12
 iteration1:rem=2
 			rev=1*10+2=12
 			num=1
 iteration1:rem=1
 			rev=12*10+1=121
 			num=0
 temp=rev , Hence output would be Number is Palindrome
 */

import java.util.Scanner;

public class Palindrom {
	public static void main(String args[]) {
		int num,temp,rem;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
		temp=num;
		while(num>0) {
			rem=num %10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("NUmber is palindrome");
		}
		else {
			System.out.println("NUmber is not palindrome");
		}
		
	}
	

}
