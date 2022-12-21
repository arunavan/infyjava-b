class MyThread4 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}//run
}

class ThreadDemo4
{
	public static void main(String args[])
	{
		MyThread4 t4 = new MyThread4();

		//t3.run();
		t4.setName("robo");

		t4.start();

		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}//main
}