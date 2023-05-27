package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_List_Ex_2
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(101);
		a1.add("rohan");
		a1.add('A');
		a1.add(null);
		a1.add(67.87f);
		a1.add(null);
		a1.add(101);
		
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.get(4));
		a1.add(3,"pass");
		
		System.out.println("----print data using iterature cursor---------");
		Iterator itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		a1.remove(5);
		
		
		System.out.println("----Print data using ListIterator-----");
		ListIterator list = a1.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		System.out.println("----Print data using for loop-----");
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("----Print data using for each loop-----");
		 for(Object s1:a1)
		 {
			 System.out.println(s1); 
			 
		 }
		 a1.clear();
		 System.out.println(a1.size());
	}

}
