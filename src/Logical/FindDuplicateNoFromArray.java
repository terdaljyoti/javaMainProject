package Logical;

public class FindDuplicateNoFromArray
{
	public static void main(String[] args)
	{
		int ar[]= {10,20,30,80,40,10,20,40};
		for(int i=0;i<=ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{

				if(ar[j]==ar[i])
				{
					System.out.println(ar[j]);
				}
			}
		}
	}

}
