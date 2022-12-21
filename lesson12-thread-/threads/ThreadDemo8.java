class MyThread8 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getPriority());
	}//run
}

class ThreadDemo8
{
	public static void main(String args[])
	{
		MyThread8 t8 = new MyThread8();

		t8.start();
	}//main
}