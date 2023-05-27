package Constructor;

public class Mathematicaloperation 
{
	int num1;
	int num2;
	

	Mathematicaloperation()
	{
		num1=90;
		num2=30;
	}
	Mathematicaloperation(int a,int b)
	{
		num1=a;
		num2=b;
	}
	
	
	public void add()
	{
		System.out.println(num1+num2);
		
	}
	public void sub()
	{
		System.out.println(num1-num2);
		
	}
	public void div()
	{
		System.out.println(num1/num2);
		
	}
	public void mul()
	{
		System.out.println(num1*num2);
		
	}
	public static void main(String[] args)
	{
		Mathematicaloperation op=new Mathematicaloperation();
		op.add();
		op.sub();
		op.div();
		op.mul();
		System.out.println("----------------------------------------------------------------------------");
		Mathematicaloperation op1=new Mathematicaloperation(40,20);
		op1.add();
		op1.sub();
		op1.div();
		op1.mul();
		
	}
	
}
