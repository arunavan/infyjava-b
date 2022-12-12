import java.io.*;

public class ReadFileUsingBufferedInputStream 
{
	public static void main(String[] args)
	{
		File file = new File("xyz.txt");	
	
		BufferedInputStream bin = null;	
		
		try		
		{
			FileInputStream fin = new FileInputStream(file);

			bin = new BufferedInputStream(fin);

			while( bin.available() > 0 )
			{
				System.out.print((char)bin.read());	
			}
		}
		catch(Exception e)
		{
			System.out.println("File not found" + e);	
		}		
		try
		{
			if(bin != null)	
				bin.close();
		}
		catch(IOException ioe)
		{
			System.out.println("Error while closing the stream : " + ioe);		
		}
	}
}