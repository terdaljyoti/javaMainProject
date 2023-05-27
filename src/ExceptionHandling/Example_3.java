package ExceptionHandling;

public class Example_3 
{
	public static void main(String[] args)
	{
		int num1=10,num2=0,div;
		
		try
		{
			div=num1/num2;
		}
		catch(ArithmeticException e)
		{
			div=num1/1;
			System.out.println("Arithmetic Exception handeled");
		}
		System.out.println(div);
	}

}
