// Demonstrate PrintWriter 
import java.io.*; 

public class PrintWriterDemo
{
	public static void main(String args[])
	{
		PrintWriter pw = new PrintWriter(System.out, true); 
		
		pw.println("This is a string"); 
		
		int i = -7; 

		pw.println(i); 
	} 
}