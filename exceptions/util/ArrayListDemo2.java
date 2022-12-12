import java.util.*;

public class ArrayListDemo2
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();

		al.add(1);
		al.add(10.5);
		al.add('a');
		al.add(null);
		al.add(null);

		System.out.println(al);
	}
}