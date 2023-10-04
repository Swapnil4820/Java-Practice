package com.java.demo.intro;

class Addition
{
	
	  public void add(int a, int b) //declaration of method 
	  {
		  int result=a*b;
	  System.out.println(result);
	  }
	 
	
	
	public double add(int a,int b, double c)
	{
		double result=a*b*c;
		//System.out.println(result);
		return result;
	}
	public void add(int a)
	{
		int result=a*a;
		System.out.println(result);
	}
	
}

public class Overloading {

	
	public static void main(String[] args) {
		
		Addition a=new Addition();
		a.add(4);
		a.add(3, 6);
		double b = a.add(3, 7, 8.0);
		System.out.println(b);

	}

}