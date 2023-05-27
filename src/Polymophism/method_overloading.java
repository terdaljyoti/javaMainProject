package Polymophism;

public class method_overloading
{
	public void Addition(int a,int b)
	{
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
		
	}
	
	public void Addition(int a,int b,int c)
	{
		System.out.println("Addition of "+a+","+b+" and "+c+" is "+(a+b));
		
	}
	
	public static void main(String[] args)
	{
		method_overloading obj=new method_overloading();
		obj.Addition(20, 50);
		obj.Addition(30, 50, 10);
		
	}

}
