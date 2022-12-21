public class PriorityDemo extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			String str=Thread.currentThread().getName();
			System.out.println(str+":"+i);
		}
	}

	public static void main(String args[])
	{
		PriorityDemo pd1=new PriorityDemo();
		PriorityDemo pd2=new PriorityDemo();

		pd1.setName("First");
		pd2.setName("Second");
		
		pd2.setPriority(MAX_PRIORITY);
		pd1.setPriority(MIN_PRIORITY);

		pd1.start();
		pd2.start();

		System.out.println("Priority of pd1 is "+pd1.getPriority());
		System.out.println("Priority of pd2 is "+pd2.getPriority());
	}
}