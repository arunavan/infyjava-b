//stack Demo
import java.io.*;
import java.util.*;

public class Demostack
{
	static void stPush(Stack st,int a)
	{
		st.push(new Integer(a));
	}

	static void stpop(Stack st)
	{
		Integer a = (Integer)st.pop();
	}

	static int stsearch(Stack st,int a)
	{
		int i = st.search(new Integer(a));

		return i;
	}

	public static void main(String[] args) throws Exception
	{
		Stack st = new Stack();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int element,pos,choice = 0;
		
		while(choice<4)
		{
			System.out.println("stack operation menu");
			System.out.println("1 push element");
			System.out.println("2 pop element");
			System.out.println("3 search element");
			System.out.println("4 exit");
			System.out.println("Your choice");

			choice = Integer.parseInt(br.readLine());
			
			switch(choice)
			{
				case 1:	System.out.println("Enter an element");

						element = Integer.parseInt(br.readLine());
						
						stPush(st,element);
						
						break;
			
				case 2:	System.out.println("Enter element to delete");
						
						element = Integer.parseInt(br.readLine());
						
						stpop(st);
						
						break;
				
				case 3:	System.out.println("Enter an element to search");
						
						element = Integer.parseInt(br.readLine());
						
						pos = stsearch(st,element);
						
						if(pos == -1)
							System.out.println("Element not found");
						else
							System.out.println("Element found at position="+pos);
						break;
			   
			   default: return;
			}
			System.out.println("stack is="+st);
		}
	}
}