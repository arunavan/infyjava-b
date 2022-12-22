package com.lock;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PrinterQueue
{
   private final Lock queueLock = new ReentrantLock();
 
   public void printJob()
   {
      queueLock.lock();
      try
      {
         Long duration = (long) (Math.random() * 100);
         System.out.println(Thread.currentThread().getName() + ": PrintQueue: Printing a Job during " + (duration / 1000) + " seconds :: Time - " + new Date());
         Thread.sleep(duration);
      } catch (InterruptedException e)
      {
         e.printStackTrace();
      } finally
      {
         System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
         queueLock.unlock();
      }
   }
}
