package Variable;

public class local_global_variable
{
	 int b=30;                               //global variable
	
	public void m1()                         //non static method
	{
		int a=10;                           //local variable
		System.out.println(a);
		System.out.println(b);
	}
	public void m2()                        //non static method
	{
		System.out.println(b);
	}
	

	public static void main(String[] args) 
	{
	     
		local_global_variable v=new local_global_variable();
		v.m1();
		v.m2();
		 
		
	}
	 

}
