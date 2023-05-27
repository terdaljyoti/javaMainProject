package Logical;

public class findDuplicateStringFromArray
{
	public static void main(String[] args)
	{
		String s1[]= {"java","c","C++","java",".Net","C++","javaScript","php","Angular"};
		for(int i=0;i<=s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[j]==s1[i])
				{
					System.out.println(s1[i]);
				}
			}
			
		}
		
	}

}
