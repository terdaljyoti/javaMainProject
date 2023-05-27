package string;

public class Example_4 
{
	public static void main(String[] args)
	{
		//object creation without using new keyword-------->constant pool area
		String s1="abc";
		String s2="abc";
		String s3="abc1";
		
		//object creation using new keyword----------------->non constant pool area
		
		String s4=new String("abc");
		String s5=new String("abc");
		String s6=new String("abc1");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s4==s5);
		
	}

}
