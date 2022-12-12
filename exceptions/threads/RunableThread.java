class MyThread1 implements Runnable{
	Thread t;
	String s=null;
	MyThread1(String s1)	{
		s=s1;
		t=new Thread(this);
		t.start();

	}
	
	public void run()	{
		
		
			System.out.println(s);
			
	}
}

public class RunableThread{
	public static void main(String args[])	{
		
		MyThread1 m1=new MyThread1("Thread started....");
		
	}

}