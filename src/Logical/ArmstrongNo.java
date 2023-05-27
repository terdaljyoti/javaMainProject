package Logical;

public class ArmstrongNo
{
	public static void main(String[] args)
	{
		int num=153;
		int rem,sum=0;
		
		int i=num;
		while(i>0)
		{
			rem=i%10;
			sum=sum+(rem*rem*rem);
			i=i/10;
			
		}
		if(sum==num)
		{
			System.out.println(num+" is armstrong No");
		}

		else
		{
			System.out.println(num+" is not armstrong No");
		}
		}
		
	}


