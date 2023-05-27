package collection;

import java.util.*;

public class TreeSet_EX_2
{
	public static void main(String[] args)
	{
	
		TreeSet tr=new TreeSet();
		tr.add(101);
		tr.add(109);
		tr.add(104);
		tr.add(107);
		tr.add(105);
		tr.add(103);
		tr.add(106);
		tr.add(102);
		
		System.out.println(tr.isEmpty());
		System.out.println(tr.size());
		System.out.println(tr.first());
		System.out.println(tr.last());
		System.out.println("===================================================================");
		
		Iterator itr=tr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("===================================================================");
		tr.remove(101);
		tr.pollFirst();
		tr.pollLast();
		
		System.out.println("Print Data using For each loop");
		for(Object s:tr)
		{
			System.out.println(s);
		}
	}

}
