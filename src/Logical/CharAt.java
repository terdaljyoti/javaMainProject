package Logical;

public class CharAt
{
	public static void main(String[] args) 
	{
		String s1="JYOTIterdal";
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')
			 {
				System.out.println(s1.charAt(i));
			 }
		}
		
	}
	

}
