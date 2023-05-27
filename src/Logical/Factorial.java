package Logical;

public class Factorial
{
	public static void main(String[] args) 
	{
		int num=3,fact=1;
	//	            3  3>1
		for(int i=num;i>=1;i--)
		{
			fact=(fact*i);         // 3 6 6
		}                         
		
		System.out.println(num+" factorial is "+fact);
	}

}
