package Method_With_ReturnType;

public class Example_3
{
	 public static int add(int a,int b)
	 {
		 int c=a+b;
		return c;
	 }
	 public int mul(int a,int b)
	 {
		int c=a*b; 
		return c;
	 }

	 public static void main(String[] args) 
	 {
		 int num1=Example_3.add(10,20);
		 System.out.println(num1);
		 
		 System.out.println(add(10, num1));
		 
		 Example_3 e1=new Example_3();
		 int num2= e1.mul(20, num1);
		 System.out.println(num2);
		 
		 System.out.println("=====================================================");
		 
		 String_test s=new String_test();
		 
		 System.out.println(s.ConvertCase("saurabh"));
		 
		
	}
}
