package Polymophism;

public class Static_method_overload
{
	 public static void add(int a,int b)
	 {
		 System.out.println(a+b);
		
	 }
	 public static void add(double a,double b)
	 {
		 System.out.println(a+b);
		
	 }
	 public static void add(String a,String b)
	 {
		 System.out.println(a+b);
		
	 }

	 public static void main(String[] args) 
	 {
		 add(3,6);
		 add(5.4,1.9);
		 add("Software","Testing");
		
	}
}
