package com.java.practice;
import java.util.*;

public class Perfectnumber {
	
	public static void main(String args[]) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=sc.nextInt();
		for(int i=1;i<n/2;i++) {
			if(n/i==0) {
				sum=sum+i;
			}
		}
		sum=sum+n;
		if(sum==n) {
			System.out.println(+n+"is a perfect number");
		}
		else {
			System.out.println(+n+"is not a perfect number");
		}
	}

}
