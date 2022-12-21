class MyThread1 implements Runnable
{
	Thread t;
	MyThread1(String s)
	{

		t=new Thread(this,s);
		t.start();

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

public class RunnableThread1
{
	public static void main(String args[])
	{
		System.out.println("Thread Name :"+Thread.currentThread().getName());   
		MyThread1 m1=new MyThread1("My Thread 1");
		MyThread1 m2=new MyThread1("My Thread 2");

	}

}