class MyThread3 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}//run
}

class ThreadDemo3
{
	public static void main(String args[])
	{
		MyThread3 t3 = new MyThread3();

		//t3.run();
		t3.start();

		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}//main
}