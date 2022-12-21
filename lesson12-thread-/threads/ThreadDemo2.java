class MyThread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}//run
}

class ThreadDemo2
{
	public static void main(String args[])
	{
		MyThread2 t2 = new MyThread2();

		//t2.start();
		t2.run();

		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}//main
}