class ThreadB extends Thread
{

  int total=0;

  public void run()
  {

   for(int i=0;i<100;i++)
   {

    total=total+i;

   }//for

  }//run

 }

class ThreadA 
{

 public static void main(String args[])throws Exception
 {

  ThreadB b = new ThreadB();
  
    b.start();

    b.join();
    
    System.out.println(b.total);

  }//main

 }