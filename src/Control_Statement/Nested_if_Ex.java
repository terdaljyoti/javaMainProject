package Control_Statement;

public class Nested_if_Ex
{
	public static void main(String[] args)
	{
		int SA=1000;
		if(SA>=500)
		{
			System.out.println("No delivery Carges Are Applied");
			
			if(SA>=1000)
			{
				System.out.println("Additional 10% discount is Given");
			}
			else
			{
				System.out.println("no any discount");
			}
		}
		else
		{
		System.out.println("Additional delivery charges are Applied");	
		}
	}

}
