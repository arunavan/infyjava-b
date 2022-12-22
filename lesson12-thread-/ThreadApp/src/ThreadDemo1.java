// type 1
class ChildThread extends Thread{
	public void run() {
		System.out.println("current thread name is :"+this.currentThread().getName());
	}
}
class ChildThread1 extends Thread{
	public void run() {
		System.out.println("current thread name is :"+this.currentThread().getName());
	}
}
//Thread
public class ThreadDemo1 {
	public static void main(String[] args) {
	    ChildThread c=new ChildThread();
	    c.setName("ModelN-UserThread");
	    System.out.println(c.getName());
	    System.out.println(c.getId());
	    c.setPriority(0);
	    c.start(); //to call run
	    ChildThread1 c1=new ChildThread1();
	  //  c1.setName("ModelN-UserThread");
	    c1.start(); //to call run
	    //c.run();
	    System.out.println(Thread.activeCount());
	    //System.out.println(c.isInterrupted());
	    //c.interrupt();
		/*
		 * c.suspend(); c.resume(); c.stop(); c.yield(); c.setDaemon(true);
		 * System.out.println(c.isDaemon()); System.out.println(c.isAlive());
		 */
		System.out.println("current thread name is :"+Thread.currentThread().getName());
		try {
			c.join();
			c1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   System.out.println(Thread.activeCount());
			//System.exit(0);;
	}

}
