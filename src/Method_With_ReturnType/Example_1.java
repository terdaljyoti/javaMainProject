package Method_With_ReturnType;

public class Example_1 
{
	public static int add(int a,int b) 
	{
		int c=a+b;
		return c;
	}
	public int mul(int c,int d)
	{
		int e=c*d;
		return e;
		
	}
	public static void main(String[] args) 
	{
		int num1=add(10,20);
		
		Example_1 obj1=new Example_1();
		int num2=obj1.mul(20, num1);
		System.out.println(obj1.mul(num1, num2));
		
		
		System.out.println("===========================================");
		
		
	}

}
