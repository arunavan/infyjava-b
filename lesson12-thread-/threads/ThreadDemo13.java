class MyThread13 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("i am lazy thread");

			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException ie)
			{
				System.out.println("i was interrupted");
			}
		}
	}//run
}

class ThreadDemo13
{
	public static void main(String args[])throws Exception
	{
		MyThread13 t13 = new MyThread13();

		t13.start();

		t13.interrupt();

		System.out.println("main thread");
	}//main
}