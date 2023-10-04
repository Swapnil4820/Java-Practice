package com.java.practice;
/*
  Take input as an integer 'a' 
  if condition- if(a%2==0) will result in false as 11 in not divisible by 2.And it will enter the else condition.
  % means that it calculate the remainder. Here remainder is 11%2=1, so 1!=0. 
  Hence output would be number is odd
 */

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		if(a%2==0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
	

}
}