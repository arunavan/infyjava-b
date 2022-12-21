class MyThread extends Thread
{
	MyThread(String s)
	{
		super(s);
		start();

	}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread Name  :"+Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
			}catch(Exception e){}
		}

	}

}


public class MultiThread1
{
	public static void main(String args[])
	{
		System.out.println("Thread Name :"+Thread.currentThread().getName());   
		MyThread m1=new MyThread("My Thread 1");
		MyThread m2=new MyThread("My Thread 2");

	}

}
