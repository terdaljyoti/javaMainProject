package Control_Statement;

public class Nested_if_ex1 
{
public static void main(String[] args)
{
	int PRE=400;
	int MEN=800;
	if(PRE>=300)
	{
		System.out.println("Eligible for main");
		if(MEN>=800)
		{
			System.out.println("got selected");
			
		}
		else
		{
			System.out.println("Rejected From Main Exam");
		}
	}
	
	else
		{
			System.out.println("not Eligible for main");
		}
			
		
	}
	
}
	

