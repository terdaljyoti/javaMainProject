package Method;

public class Addition
{
	public static void Add(int a,int b)
	{
		System.out.println("Static method with Parameter");
		System.out.println(a+b);
		
	}

	public void Sum(int num1,int num2)
	{
		System.out.println("Non Static method with Parameter");
		int sum;
		sum=num1+num2;
		System.out.println("Addition is:"+sum);
	}
	public static void main(String[] args)
	{
		
		Add(20,50);
		Add(50,27);
		Addition A1=new Addition();
		A1.Sum(20, 30);
		A1.Sum(30, 40);
		 
		
	}

}

