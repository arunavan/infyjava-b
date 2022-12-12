import java.io.*;
import java.util.*;

public class Demo8 
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("d:/test/mydir/notes.txt");

		FileReader fr = null;

		try 
		{
			fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);

			String line = null;

			while ((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
			// fr.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		finally
		{
			try 
			{
				fr.close();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
}