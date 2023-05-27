package Variable;

public class Static_global 
{
	static int i=20;
	public static void main(String[] args)
	{
		System.out.println(i);
		m4();
		Static_global SG=new Static_global();
		SG.m3();
		 System.out.println(static_global_variable_callFromDiffClass.c);
	}
	public void m3() 
	{
		System.out.println(i);
	}
	public static void m4() 
	{
		System.out.println(i);
	}

}
