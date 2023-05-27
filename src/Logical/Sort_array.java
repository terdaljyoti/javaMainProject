package Logical;

import java.util.Arrays;

public class Sort_array 
{
	public static void main(String[] args)
	{
		int ar[]= {20,60,30,90,10};
		System.out.println("---Print Original Array----");
		for(int i=0;i<=ar.length-1;i++)
		{
			 System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		System.out.println("---Print Array element in Ascending order----");
		for(int i=0;i<=ar.length-1;i++)
		{
			 System.out.println(ar[i]);
		}
		
		System.out.println("largest array element is : "+ar[ar.length-1]);
		System.out.println("Smallest array element is : "+ar[0]);
		
		System.out.println("---Print Array element in Descending order----");
		for(int i=ar.length-1;i>=0;i--)
		{
			 System.out.println(ar[i]);
		}
		
		 
		
		System.out.println("====================================================================================");
		String arr[]= {"ganesh","rmesh","puja","rohit","pravin"};
		
		System.out.println("---Print Original Array----");
		for(int i=0;i<=arr.length-1;i++)
		{
			 System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		System.out.println("---Print Array element in Ascending order----");
		for(int i=0;i<=arr.length-1;i++)
		{
			 System.out.println(arr[i]);
		}
		
		System.out.println("---Print Array element in Descending order----");
		for(int i=arr.length-1;i>=0;i--)
		{
			 System.out.println(arr[i]);
		}
		
	}

}
