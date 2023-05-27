package Method;

public class Sample
{
	 public static void addition()
	{
		int num1;
		int num2;
		int sum;
		num1=12;
		num2=19;
		sum=num1+num2;
		System.out.println("Running Static regular method without parameter");
		System.out.println("Addition is :"+sum);
	}
	 
	 public void addition1() 
	 {
		 int a;
		 int b;
		 int add;
		 a=10;
		 b=20;
		 add=a+b;
		 System.out.println("non static regular method without parameter is running");
		 System.out.println("addition is:"+add);
		
	}
	 
	 
	 public static void main(String[] args)
	 {
		 addition();
		 Sample s1=new Sample();
		 s1.addition1();
		
	}

}
