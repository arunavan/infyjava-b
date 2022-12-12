class DemoAlive extends Thread {

    int value;

    public DemoAlive(String str)
    {
        super(str); 
        value=0;
        start();    
    }


	 public void run()
	 {
	
        try
	 {
            while (value < 5) {
              
	  System.out.println(getName() + ": " + (value++));
                Thread.sleep(250);  
            }
        } catch (Exception e) {}

        System.out.println("Exit from thread: " + getName());
    }
}





public class DemoJoin
{
    public static void main(String[] args)
	 {

        DemoAlive da = new DemoAlive("Thread a");
        DemoAlive db = new DemoAlive("Thread b");

        try
	 {
            System.out.println("Wait for the child threads to finish.");
            da.join();

            if (!da.isAlive())
                System.out.println("Thread A not alive.");
            db.join();
            if (!db.isAlive())
                System.out.println("Thread B not alive.");
        } catch (Exception e) { }

        System.out.println("Exit from Main Thread.");
    }
}
