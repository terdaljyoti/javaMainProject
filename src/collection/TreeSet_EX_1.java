package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_EX_1 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tr=new TreeSet<Integer>();
		tr.add(101);
		tr.add(109);
		tr.add(105);
		tr.add(104);
		tr.add(102);
		tr.add(103);
		tr.add(106);
		tr.add(107);
		tr.add(102);
		tr.add(101);
		
		System.out.println("----Print data using Iterator-----");
		Iterator itr=tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next()); 
			
		}
		
		tr.remove(101);
		
		
		System.out.println("Print dat using for each loop");
		for(Integer i:tr)
		{
			System.out.println(i);
			
		}
	}

}
