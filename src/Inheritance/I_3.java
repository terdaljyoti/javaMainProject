package Inheritance;

public class I_3 implements I_1,I_2
{
	public void m1()
	{
		System.out.println("method m1 from I_1 completed in implementation class");
	}

	public void m2()
	{
		System.out.println("method m2 from I_1 completed in implementation class");
	}

	public	void m3()
	{
		System.out.println("method m3 from I_2 completed in implementation class");
	}

	public void m4()
	{
		System.out.println("method m4 from I_2 completed in implementation class");
	}

}
