import java.io.*;

public class WriteToFile
{
    public void writeToFile(String filename)
	{
        BufferedOutputStream bf = null;

		try
		{
			bf = new BufferedOutputStream(new FileOutputStream(filename));            
			//Start writing to the output stream

			bf.write("Line one".getBytes());
			
			bf.write("\n".getBytes()); 
			
			bf.write("\n".getBytes());            
			
			bf.write(65);            
			
		}
		catch (FileNotFoundException ex)
		{
			System.out.printt(ex);
		}
		catch (IOException ex) 
		{
			System.out.printt(ex);
		}
		finally
		{
			//Close the BufferedOutputStream
			try
			{
				if (bf != null) 
				{
					bf.flush();
					bf.close();
				}
			}
			catch (IOException ex)
			{
				System.out.printt(ex);
			}        
		}    
	}
	
    public static void main(String[] args)
	{
        new Main().writeToFile("myFile.txt");
    }
}