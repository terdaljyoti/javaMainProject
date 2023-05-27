package Polymophism;

public class Main_metho_overload
{
	 public static void main(int a,int b)
	 {
		 System.out.println(a+b);
	 }
	 public static void main(double a,double b)
	 {
		 System.out.println(a+b);
	 }
	 public static void main(int a,double b)
	 {
		 System.out.println(a+b);
	 }
	 
	 public static void main(String[] args) 
	 {
		 main(4,9);
		 main(2.8,8.4);
		 main(4,6.3);
		
	}
}
