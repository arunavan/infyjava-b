class MyThread11 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}//run
}

class ThreadDemo11
{
	public static void main(String args[])throws Exception
	{
		MyThread11 t11 = new MyThread11();

		t11.start();

		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");

			Thread.sleep(1000);
		}
	}//main
}