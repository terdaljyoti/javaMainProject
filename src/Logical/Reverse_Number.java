package Logical;

public class Reverse_Number
{
	public static void main(String[] args)
	{
	//	int num=1234;
		int rem;
		int rev=0;
		/*
		for(int i=num;i>=1;i=i/10)
		{
			rem=i%10;
			rev=(rev*10)+rem;
		}
		
		System.out.println(rev);  */
		
	    System.out.println("_______________________________________________________________");
	     
	    int num2=34567;
	   // int i=num2;
	    while(num2!=0)
	    {
	    	rem=num2%10;
	    	rev=(rev*10)+rem;
	    	num2=num2/10;
	    }
	    System.out.println(rev);
	}
	 

}
