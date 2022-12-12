import java.util.*;

class MyComp implements Comparator
{
	public int compare(Object a,Object b)
	{
		String aStr,bStr;

		aStr=(String)a;
		bStr=(String)b;
		
		return bStr.compareTo(aStr);
	}
}

public class CompDemo
{
	public static void main(String s[])
	{
		TreeSet ts = new TreeSet(new MyComp());

		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		Iterator i = ts.iterator();
		
		while(i.hasNext())
		{
			Object element = i.next();
			System.out.print(element+" ");
		}
	}
}