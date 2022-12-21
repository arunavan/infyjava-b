//creating and running a thread using extends Thread
class Tdemo1 extends Thread 
{
	String msg;
	Tdemo1(String s)
	{
		msg = s;
	}

	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread()+"     helo");
			}
		}
	}
}

class SynchBlock
{
	public static void main(String args[])
	{
		Tdemo1 obj1=new Tdemo1("one");
		//Tdemo1 obj2=new Tdemo1("two");
		//Tdemo1 obj3=new Tdemo1("third");
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj1);
		Thread t3=new Thread(obj1);

		System.out.println("from main");
		//obj1.start();
		t1.start();
		t2.start();
		t3.start();
		//obj3.start();
	}
}