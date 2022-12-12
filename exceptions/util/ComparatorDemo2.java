import java.util.*;

public class ComparatorDemo2
{
	public static void main(String args[])
	{
		TreeSet t = new TreeSet(new MyComparator());

		t.add("aaa");
		t.add("aaaa");
		t.add("b");
		t.add("bb");
		t.add("ccccc");
		
		System.out.println(t);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = obj2.toString();

		int i1 = s1.length();
		int i2 = s2.length();
		
		if(i1<i2)
		{
			return -1;
		}
		else if(i1>i2)
		{
			return +1;
		}
		else
			return 0;
	}
}