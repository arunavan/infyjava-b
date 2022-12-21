class ThreadB2 extends Thread
{

  int total=0;

  public void run()
  {
    synchronized(this)
    {
    
    System.out.println("child thread starts caliculation");

   for(int i=0;i<100;i++)
   {

    total=total+i;

   }//for
   System.out.println("child thread giving notification call");

   this.notify();
   
   }//sync

  }//run

 }

class ThreadA2 
{

 public static void main(String args[])throws Exception
 {

  ThreadB2 b2 = new ThreadB2();
  
    b2.start();

   synchronized(b2)
   {
    System.out.println(" main method calling wait method");
 
    b2.wait();
    
    System.out.println(" main thread got notification call");

    System.out.println(b2.total);

   }//sync

  }//main

 }