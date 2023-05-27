package Array;

import java.util.Arrays;

public class Sort_Int_Array 
{
	public static void main(String[] args)
	{
		int Stud_RollNo[]= {201,654,980,543,527,769};
		System.out.println("----Print original information from Array---");
		for(int i=0;i<=Stud_RollNo.length-1;i++)
		{
			System.out.println(Stud_RollNo[i]);
		}
		
		Arrays.sort(Stud_RollNo);
		System.out.println("--------Print Array in Ascending order--------");
		for(int i=0;i<=Stud_RollNo.length-1;i++)
		{
			System.out.println(Stud_RollNo[i]);
		}
		System.out.println("----Print Array in Deacending Order----");
		for(int i=Stud_RollNo.length-1;i>=0;i--)
		{
			System.out.println(Stud_RollNo[i]);
		}
	}

}
