package Polymophism;

public class EX_overloading 
{
	public void addition(int a,int b)
	{
		System.out.println("Addition is "+(a+b)); 
		
	}
	public void addition(double a,double b)
	{
		System.out.println("Addition is "+(a+b));
		
	}
	public void addition(String a,String b)
	{
		System.out.println("Addition is "+(a+b));
		
	}
	 public static void main(String[] args)
	 {
		 EX_overloading e=new EX_overloading();
		 e.addition(10, 30);
		 e.addition(33.22, 45.29);
		 e.addition("well", "come");
		 
		 
		
	 }

}
