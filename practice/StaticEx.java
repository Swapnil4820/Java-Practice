package com.java.demo.intro;

class StaticDemo
{
	static int a=1;                // instance variable
	
	public void dispaly()
	{
		//int a=0;          // local variables.
		a++;
		System.out.println(a);
	}
}


public class StaticEx {

	
	public static void main(String[] args) {
		
		StaticDemo sd=new StaticDemo();
		sd.dispaly();
		StaticDemo sd2=new StaticDemo();
		sd2.dispaly();
		StaticDemo sd3=new StaticDemo();
		sd3.dispaly();

	}

}
