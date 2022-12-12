import java.util.*;

public class ComparatorDemo
{
	public static void main(String args[])
	{
		TreeSet t = new TreeSet(new MyComparator());
	
		t.add(new Integer(10));
		t.add(new Integer(15));
		t.add(new Integer(5));
		t.add(new Integer(0));
		t.add(new Integer(2));

		System.out.println(t);
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		
		int i1 = I1.intValue();
		int i2 = I2.intValue();

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