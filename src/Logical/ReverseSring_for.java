package Logical;

public class ReverseSring_for 
{
	public static void main(String[] args) 
	{
		String original="AVAJ";
		String reverse="";
		
		for(int i=0;i<original.length();i++)
		{
			reverse=original.charAt(i)+reverse;
					 
		}
		System.out.println(reverse);
	}

}
