import java.util.*;

public class CompDemo1
{
	public static void main(String s[])
	{
		Comparator r = Collections.reverseOrder();

		TreeSet ts = new TreeSet(r);
		
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