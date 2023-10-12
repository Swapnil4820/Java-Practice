package com.streamdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

	public static void main(String[] args) throws IOException {
		System.out.println("hello");
		String text;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter the value:");
		text=br.readLine();
		System.out.println("text"+" "+text);
	}

}
