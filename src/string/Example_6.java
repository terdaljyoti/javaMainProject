package string;

public class Example_6
{
	public static void main(String[] args)
	{
		
		String s5="my name is abc";
		String arr[]=s5.split(" ");//==================================>IMP
		
		System.out.println(arr[0]);
		
		System.out.println("_____________________________________________________________");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		
		
		
		
		System.out.println("_________________________________________________________________");
		
		//WAP TO find length of string without using string.length()
		String s6="velocity";
		String ar[]=s6.split("");//================================>IMP
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("______________________________________________________________________");
		System.out.println(ar.length);
		
		
	}

}
