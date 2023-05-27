package Logical;

public class String_spilt
{
	public static void main(String[] args)
	{
		String s1="my name is jyoti";
		
		String ar[]= s1.split(" ");
		
		 for(int i=0;i<=ar.length-1;i++)
		 {
			 System.out.println(ar[i]);
		 }
		
		System.out.println("---------------------------------------------------------------");
		
		String s2="velocity";
		
		String arr[]=s2.split("");
		
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}

}
