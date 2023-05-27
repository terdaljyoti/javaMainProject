
public class String_Array
{
	public static void main(String[] args)
	{
		String Stud_Name[]=new String[5];
		Stud_Name[0]="suresh";
		Stud_Name[1]="ramesh";
		Stud_Name[2]="ganesh";
		Stud_Name[3]="mahesh";
		Stud_Name[4]="rahesh";
		
		System.out.println("Size of array :"+Stud_Name.length);
		
		System.out.println(Stud_Name[2]);
		
		System.out.println("-----Print all information from String Array----");
		for(int i=0;i<=Stud_Name.length-1;i++)
		{
			System.out.println(Stud_Name[i]);
			
		}
	}

}
