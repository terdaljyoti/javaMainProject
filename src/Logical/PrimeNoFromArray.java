package Logical;

public class PrimeNoFromArray
{
	public static void main(String[] args) 
	{
		int ar[]={13,42,32,71,71,37,47,43,57,59,69,17,23};int count;
		
		for(int i=0;i<=ar.length-1;i++)
		{
			count=0;
			for(int j=1;j<=ar[i];j++)
			{
			
				if(ar[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(ar[i]);
				
			}
		}
		
	}

}
