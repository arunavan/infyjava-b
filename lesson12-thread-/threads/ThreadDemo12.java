class MyThread12 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("sita thread");

			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException ie){}
		}
	}//run
}

class ThreadDemo12
{
	public static void main(String args[])throws Exception
	{
		MyThread12 t12 = new MyThread12();

		t12.start();

		t12.join();

		for(int i=0;i<10;i++)
		{
			System.out.println("Rama thread");
		}
	}//main
 }