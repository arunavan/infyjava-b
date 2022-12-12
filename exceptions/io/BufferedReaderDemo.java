// Use a BufferedReader to read characters from the console.
import java.io.*;

class BufferedReaderDemo
{ 
	public static void main(String args[])throws IOException 
	{ 
		char c; 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter characters'q' to quit."); 
		// read characters 
		do
		{ 
			c = (char)br.read(); 

			System.out.print(c); 
		}while(c!='q'); 
	} 
} 
