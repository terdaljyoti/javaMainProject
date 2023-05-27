package Logical;

public class ArmstrongNoFrom1_100
{
	public static void main(String[] args)
	{
		
		int rem,num,sum=0;
		for(int i=1;i<=500;i++)
		{
			
			num=i;
			while(num>0)
			{
				rem=num%10;
				sum=sum+(rem*rem*rem);
				num=num/10;
			}

			if(i==sum)
			{
				System.out.print(i+" ");
			}
			sum=0;
		}
	}

}
