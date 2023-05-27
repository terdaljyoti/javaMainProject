package ArrayList;

import java.util.ArrayList;

public class EX_1
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(101);
		a1.add("Ram");
		a1.add(68.87f);
		a1.add(null);
		a1.add('A');
		a1.add(null);
		a1.add(101);
		a1.add(null);
		
		System.out.println(a1.get(4));
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
	
		System.out.println(a1);
		a1.add(3,"pass");
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);
	}

}
