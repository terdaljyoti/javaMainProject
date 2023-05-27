package Constructor;

public class UserDefined_Parameterized
{
	int num1;
	int num2;
	int num3;
	
	UserDefined_Parameterized(int a,int b)
	{
		num1=a;
		num2=b;
	}
	UserDefined_Parameterized(int a,int b,int c)
	{
		num1=a;
		num2=b;
		num3=c;
	}
	
	public void add()
	{
		System.out.println(num1+num2);
		
	}
	public void mul()
	{
		System.out.println(num1*num2);
		
	}
	public void sum()
	{
		System.out.println(num1+num2+num3);
		
	}
	public static void main(String[] args)
	{
		UserDefined_Parameterized ud1=new UserDefined_Parameterized(20,10);
		ud1.add();
		ud1.mul();
		UserDefined_Parameterized ud2=new UserDefined_Parameterized(20,10,5);
		ud2.sum();
		
		UserDefined_Parameterized2 obj=new UserDefined_Parameterized2(50,10);
		obj.sub();
	}

}
