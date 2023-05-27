package Array;
                                                                                // 0  1   2
public class MultiDimentionalArray                                              // 10 20 30        0
{                                                                               // 40 50 60        1
	public static void main(String[] args)
	{
		int arr[][]= {{10,20,30},{40,50,60}};
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------");
		
		int ar[][]=new int[2][3];
		ar[0][0]=10;
		ar[0][1]=20;
		ar[0][2]=30;
		ar[1][0]=40;
		ar[1][1]=50;
		ar[1][2]=60;
		
		System.out.println("----Print data---");
		for(int i=0;i<=1;i++)      //outer for loop-----ROw
		{
			for(int j=0;j<=2;j++)  //inner for loop-----column
			{
				System.out.print(ar[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		
		System.out.println(ar[0][2]);
	}

}
