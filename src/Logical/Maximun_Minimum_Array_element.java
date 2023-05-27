package Logical;

public class Maximun_Minimum_Array_element
{
	public static void main(String[] args)
	{
		int ar[]= {30,60,90,10,50};
		int smallest=ar[0];
		int largest=ar[0];
		for(int i=0;i<=ar.length-1;i++)
		{
	     	if(ar[i]<smallest)
		    {
			smallest=ar[i];
		    }
	     	else if(ar[i]>largest)
	     	{
	     		largest=ar[i];
	     	}
	     }
		
		System.out.println("Smallest arrsy element is = "+smallest);
		System.out.println("Largest arrsy element is = "+largest);
	}

}
