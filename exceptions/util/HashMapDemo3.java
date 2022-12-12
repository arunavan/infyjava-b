import java.util.*;

public class HashMapDemo3
{
	public static void main(String args[])
	{
		HashMap hm = new HashMap();

		hm.put("rajni", new Integer(1000000000));
		hm.put("ajith", new Integer(1000000));
		hm.put("vijay", new Integer(1000000));
		hm.put("abc", new Integer(2000));

		Set s = hm.entrySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry m1 = (Map.Entry)itr.next();
		
			System.out.println(m1.getKey()+"--------"+m1.getValue());
		}
	}
}