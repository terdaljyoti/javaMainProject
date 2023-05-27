package Array;

import java.util.Arrays;

public class Find_Largest_Smallest_NO_from_Array
{
	public static void main(String[] args)
	{
		int arr[]= {20,50,90,40,64,10,89};
		int smallest=arr[0];
		int largest=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			else if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println("Smallest no is :"+smallest);
		System.out.println("Largest no is :"+largest);
		
		System.out.println("---------------------------------------------------------------");
		
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		
		
	}

}
