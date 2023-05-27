package Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EX_1 
{
	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add(101);
		v.add("pavan");
		v.add(null);
		v.add('A');
		v.add(null);
		v.add(67.89f);
		v.add(101);
		
		System.out.println("------Print data using Iterator-----");
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----Print data using ListIterator----");
		ListIterator l1=v.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("-----Print data using for loop----");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("-----Print data using for each loop-----");
		for(Object v1:v)
		{
			System.out.println(v1);
		}
		System.out.println("--Print data using enumiration----");
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}

	}

}
