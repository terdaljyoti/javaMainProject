package Array;

public class Int_Array
{
	public static void main(String[] args)
	{
		int Stud_RollNO[]=new int[5];
		Stud_RollNO[0]=120;
		Stud_RollNO[1]=193;
		Stud_RollNO[2]=312;
		Stud_RollNO[3]=213;
		Stud_RollNO[4]=132;
		
		System.out.println("-----Print all information from int array-----");
		for(int i=0;i<=Stud_RollNO.length-1;i++)
		{
			System.out.println(Stud_RollNO[i]);
		}
		
	}

}
