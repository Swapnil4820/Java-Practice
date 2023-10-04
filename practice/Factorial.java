package com.java.practice;
/*
 * Take input as num=3j  
 * enter function factorial()
 * int factorial(int n)
 * num=3
 * if(n==0)false
 * else 
 * return 3*factorial(3-1)i.e return 3*factorial(2)
 * if(n==0)false
 * else 
 * return 2*factorial(2-1)i.e return 2*factorial(1)
 * if(n==1)true
 * return 1;
 * we will have
 * 1*1=1.....factorial(1)
 * 2*1=2.....factorial(2)
 * 3*2=6.....factorial(1)   output
 */

import java.util.Scanner;


public class Factorial {
	static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		int num, fact;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		num= sc.nextInt();
		fact=factorial(num);
		/*for(int i=1; i<=num;i++) {
			fact=fact*i;
		}*/
		System.out.println("factorial of num is:"+fact);
		// TODO Auto-generated method stub

	}

}
