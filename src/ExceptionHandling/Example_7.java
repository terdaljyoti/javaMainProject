package ExceptionHandling;

public class Example_7 
{
	public static void main(String[] args) 
	{
		int arr[]= {30,10,50,70};

		String s1="madam";
		try 
		{
		System.out.println(arr[9]);
	    }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception Handled");
			System.out.println(arr[arr.length-1]);
		}
		try
		{
			 System.out.println(s1.charAt(-1));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bounds Exception handeled");
			System.out.println(s1.charAt(0));
			 
		}
		
	}

}
