package Sample;

public class Demo
{
	public static void main(String[] args)
	
	{
		System.out.println("HI");
	         m1();                //static regular method call from same class
	         m2();
	    System.out.println("Hello");
		
	}
	public static void m1()      //static regular method declaration
	{
		System.out.println("Running Regular Method:m1");
	}
	
	public static void m2()
	{
		System.out.println("Running Regular Method:m2");
	}

}
