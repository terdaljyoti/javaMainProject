package ExceptionHandling;

public class Example_1
{
	public static void main(String[] args)
	{
		int arr[]= {30,10,50,70};
		try 
		{
		System.out.println(arr[9]);
	    }
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception Handled");
			System.out.println(arr[arr.length-1]);
		}
		
		System.out.println("Array element");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
