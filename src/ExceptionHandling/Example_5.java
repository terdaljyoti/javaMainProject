package ExceptionHandling;

public class Example_5 
{
	public static void main(String[] args) 
	{
        String s1="abcd";
		
		try
		{
			System.out.println(s1.charAt(5));
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("generic Exception Handeled");
		}
		System.out.println("hi");
		System.out.println("hello");
	}

}
