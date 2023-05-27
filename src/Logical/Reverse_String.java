package Logical;

public class Reverse_String 
{
	public static void main(String[] args)
	{
		String original="nitin";//mom,madam
		String reverse="";
		
		System.out.println("Original String :"+original);
		
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
	
		System.out.println("reverse String : "+reverse);
		
		if(original.equals(reverse))
		{
			System.out.println("String is palindrom ");
		}
	}

}
