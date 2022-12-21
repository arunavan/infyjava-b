public class DemoWait extends Thread
{
	int val=20;
	public static void main(String args[])
	{
		DemoWait d=new DemoWait();
		d.start();
		new Demo1(d);
	}

	public void run()
	{

		try
		{
		synchronized(this)
		{
		wait();
		
		System.out.println("value is  :"+val);		
		}
		}catch(Exception e){}
	}

	public void valchange(int val)
	{
		
		this.val=val;
		
		try
		{
		synchronized(this)
		{
		notifyAll();
			
		
		}
		}catch(Exception e){}

	}
}



class Demo1 extends Thread
{
	DemoWait d;
	Demo1(DemoWait d)
	{
	this.d=d;
	start();
	}

	public void run()
	{
	
	try
	{
		System.out.println("Demo1 value is"+d.val);
		
		d.valchange(40);
	}catch(Exception e){}


	}


}