package Control_Statement;

public class Example_3_Else_if_ladder 
{
	public static void main(String[] args)
	{
		int marks=58;
		
		
	    if(marks>=65)
	   {
		System.out.println("Distinction");
   
	   }
	    else if(marks>=60 & marks<=64)
	    {
	    	System.out.println(" 1'st lass");
	    }
	    else if(marks>=50 & marks<59)
	    {
	    	System.out.println(" 2'nd Class");
	    }
	    else if(marks>=35&marks<=49)
	    {
	    	System.out.println("PASS");
	    }
	    else
	    {
	    	System.out.println("FAIL");
	    }
	
	}

}
