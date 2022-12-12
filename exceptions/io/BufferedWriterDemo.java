import java.io.*;

public class BufferedWriterDemo
{
    public void writeToFile(String filename)
	{
		BufferedWriter bufferedWriter = null;

		try 
		{
			//Construct the BufferedWriter object
			bufferedWriter = new BufferedWriter(new FileWriter(filename));

			//Start writing to the output stream
			bufferedWriter.write("Writing line one to file");

			bufferedWriter.newLine();
			
			bufferedWriter.write("Writing line two to file");
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			//Close the BufferedWriter
			try
			{
				if (bufferedWriter != null)
				{
					bufferedWriter.flush();
					bufferedWriter.close();
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}
   
    public static void main(String[] args) 
	{
        new BufferedWrit().writeToFile("myFile.txt");
    }
}

