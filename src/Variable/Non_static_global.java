package Variable;

public class Non_static_global
{
	int a=10;
	public static void main(String[] args)
	{
		Non_static_global NS=new Non_static_global();
		System.out.println(NS.a);
		Non_static_global2 NS2=new Non_static_global2();
		System.out.println(NS2.d);
		
	}
	public void m1()
	{
		System.out.println(a);
		
	}

}
 
