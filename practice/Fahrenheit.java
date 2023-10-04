package com.java.practice;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a temperature in celcius:");
		float cel=sc.nextFloat();
		float fahr=((cel*9)/5)+32;
		System.out.println("Temperature in Fahrenheit is:"+ fahr);
		
		

	}

}
