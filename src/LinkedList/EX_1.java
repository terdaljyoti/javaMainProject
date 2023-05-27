package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EX_1 
{
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add(101);
		l.add("rohan");
		l.add('A');
		l.add(null);
		l.add(67.9f);
		l.add(null);
		l.add(101);
		
		System.out.println("Print data using Iterator");
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print data using ListIterator----");
		ListIterator l1=l.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("---Print data using for loop---");
		for(int i=0;i<=l.size()-1;i++)
		{
			System.out.println(l.get(i));
		}
		System.out.println("---Print data using for each loop----");
		for(Object l2:l)
		{
			System.out.println(l2);
		}
		
		
	}

}
