package ExceptionHandling;

public class Example_6 
{
	public static void main(String[] args) 
	{
		  String s1="abcd";
			
			try
			{
				System.out.println(s1.charAt(5));
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index Out Of Bounds Exception Handeled");
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("String Index Out Of Bounds Exception Handeled");
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
