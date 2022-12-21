class MyThread9 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}//run
}

class ThreadDemo9
{
	public static void main(String args[])
	{
		MyThread9 t9 = new MyThread9();

		//t9.setPriority(10);

		t9.setPriority(20);

		t9.start();

		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}//main
}