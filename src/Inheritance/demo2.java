package Inheritance;

public class demo2 extends demo1
{

	int a=20;
	public void m1()
	{
		int a=30;
		System.out.println("value of local variable :"+a);
		System.out.println("value of current class global variable :"+this.a);
		System.out.println("value of super class global variable :"+super.a);
		
	}
	public static void main(String[] args) 
	{
		demo2 d2=new demo2();
		d2.m1();
		
		
	}
}
