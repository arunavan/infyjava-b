import java.util.*;

public class ArrayListDemo
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		
		al.add("A");
		al.add(new Integer(10));
		al.add(null);
		al.add("A");
		al.set(1,"B");
		
		// al.remove(0);

		System.out.println(al);
	}
}