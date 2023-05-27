package Array;

import java.util.Arrays;

public class Sort_String_Array 
{
	public static void main(String[] args) 
	{
		String Stud_Name[]= {"ram","sham","ganesh","priya","rima"};
		System.out.println("----Print original information in Array----");
		for(int i=0;i<=Stud_Name.length-1;i++)
		{
			System.out.println(Stud_Name[i]);
		}
		Arrays.sort(Stud_Name);
		
		System.out.println("----Print Array information in Ascending Order ---");
		for(int i=0;i<=Stud_Name.length-1;i++)
		{
			System.out.println(Stud_Name[i]);
		}
		
		System.out.println("----Print Array information in Descending Order----");
		for(int i=Stud_Name.length-1;i>=0;i--)
		{
			System.out.println(Stud_Name[i]);
			
		}
	}

}
