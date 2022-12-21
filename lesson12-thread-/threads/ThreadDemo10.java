class MyThread10 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}//run
}

class ThreadDemo10
{
	public static void main(String args[])throws Exception
	{
		MyThread10 t10 = new MyThread10();

		t10.start();

		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");

			Thread.yield();
		}
	}//main
}