package Method_With_ReturnType;

public class Example_2
{
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	public static int add(int c,int d,int e)
	{
		 int f=c+d+e;
		 return f;
	}

    public int add()
   {
    int a=10,b=20;
    int c=a+b;
    return c;
   }
	
	public static void main(String[] args)
	{ 
		Example_2 e1=new Example_2();
		
		int num1=e1.add();  //30
		
		int num2=Example_2.add(20,num1);   //50=20+30
		
		int num3=Example_2.add(20,num1, num2);  //100=20+30+50
		
		System.out.println(num3);
		
	}

}
