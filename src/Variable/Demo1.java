package Variable;

public class Demo1
{
	static int c=40;//static global
	int a=20;//non static global
	Demo2 d2=new Demo2();
	public static void main(String[] args)
	{
		Demo1 d1=new Demo1();
		System.out.println(d1.a);
		System.out.println(c);
		System.out.println(Demo2.d);
		Demo2 d2=new Demo2();
		System.out.println(d2.e);
		
	}
	public void m1()
	{    int b=30;//local
	    System.out.println(b);
		System.out.println(a);
		System.out.println(c);
		System.out.println(Demo2.d);
		System.out.println(d2.e);
		 
		 
	}

}
