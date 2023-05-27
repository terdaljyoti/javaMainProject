package Method;

 

public class StudentInfo1 
{
	public static void Sname(String S)
	{
		System.out.println(S);
		
	}
	public static void SFullName(String s1,String s2)
	{
		System.out.println(s1+" "+s2);
		
	}
	public static void main(String[] args)
	{
		Sname("JYOTI");
		SFullName("jyoti", "terdal");
		StudentInfo2.SInfo("jyoti",79,77.56f,'A');
		
	}

}
