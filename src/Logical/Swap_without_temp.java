package Logical;

public class Swap_without_temp 
{
	public static void main(String[] args)
	{
		int a=10;
		int b=20;
		
		System.out.println("before Swap a = "+a+" b = "+b);
		
		 a=a+b; //  a=10+20=30
		 b=a-b; //  b=30-20=10
		 a=a-b; //  a=30-10=20
		 
		 System.out.println("after Swap a = "+a+" b = "+b);
	}

}
