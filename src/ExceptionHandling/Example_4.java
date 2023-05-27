package ExceptionHandling;

public class Example_4
{
	public static void main(String[] args)
	{
		String s1="abcd";
		
		try
		{
			System.out.println(s1.charAt(5));
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Handeled");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception Handeled");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bounds Exception Handeled");
		}
	}

}
