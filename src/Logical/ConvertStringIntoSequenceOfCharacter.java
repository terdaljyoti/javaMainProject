package Logical;

public class ConvertStringIntoSequenceOfCharacter 
{
	public static void main(String[] args) 
	{
		String s1="jyoti";
		String[] ch = s1.split("");
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println(ch[i]);
		}
	}

}
