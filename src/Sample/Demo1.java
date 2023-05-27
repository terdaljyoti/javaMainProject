package Sample;

public class Demo1 
{
	public static void main(String[] args)
	{
	int temp=0;
	int a=10;
	int b=20;
	
	
	System.out.println("initial value of a:"+a);
	System.out.println("initial value of b:"+b);
	 temp=a;
	 a=b;
	 b=temp;
	System.out.println("after swapping a:"+a);
	System.out.println("after swapping b:"+b);
	}

}
