package Constructor;

public class Sample
{
	int num1;
	int num2;
	Sample()
	{
		num1=10;
		num2=20;
		
	}
	public void add() 
	{
		System.out.println("Addition is : "+(num1+num2));
		
	}
	public void mul()
	{
		System.out.println("multiplication is : "+(num1*num2));
		
	}
	
	public static void main(String[] args)
	{
		Sample s1=new Sample();
		s1.add();
		s1.mul();
		Sample2 s2=new Sample2();
		s2.sub();
	}

}
