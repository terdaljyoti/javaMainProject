package Logical;

public class Palindrom_No 
{
	public static void main(String[] args)
	{
		int num=171,rem,rev=0;
		int i=num;
		while(i>0)
		{
			rem=i%10;
			rev=(rev*10)+rem;
			i=i/10;
		}
		if(rev==num)
		{
			System.out.println(num+" is palindrom");
		}
	}

}
