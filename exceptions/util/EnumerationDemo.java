import java.util.*;

public class EnumerationDemo
{
	public static void main(String args[])
	{
		Vector v = new Vector();

		for(int i=0;i<=10;i++)
		{
			v.addElement(new Integer(i));
		}

		System.out.println(v);
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			Integer I = (Integer)e.nextElement();
		
			System.out.println(I);
		}
		System.out.println(v);
	}
}