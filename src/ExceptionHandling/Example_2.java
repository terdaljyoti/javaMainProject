package ExceptionHandling;

 
public class Example_2 
{
	public static void main(String[] args)
	{
		String s1="madam";
		
		try
		{
			 System.out.println(s1.charAt(-1));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bounds Exception handeled");
			System.out.println(s1.charAt(0));
			System.out.println("__________________________________________________");
		}
		
		 String ar[]=s1.split("");
		 for(int i=0;i<=ar.length-1;i++)
		 {
			 System.out.print(ar[i] +" ");
		 }
		 
	}


}
