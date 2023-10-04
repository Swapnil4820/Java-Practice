package com.java.practice;
/*
 *sum=0
 *iteration 1: sum=0+1=1
 * iteration 1: sum=1+2=3
 * iteration 1: sum=3+3=6
 * iteration 1: sum=6+4=10
 * iteration 1: sum=10+5=15
 * iteration 1: sum=15+6=21
 * iteration 1: sum=21+7=28
 * iteration 1: sum=28+8=36
 * iteration 1: sum=36+9=45
 * iteration 1: sum=45+10=55
 * output would be Sum of first 10 natural numbers is 55
 */
public class Sum {

	public static void main(String args[]) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of first n natural numbers is:"+ sum);
	}

}
