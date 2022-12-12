import java.io.*;

public class Demo9
{
	public static void main(String[] args) 
	{
		String data = "Nexwave";

		byte[] bytes = data.getBytes();

		try 
		{
			FileOutputStream fos = new FileOutputStream("d:/mydata.txt");
			fos.write(bytes);
			fos.flush();
			fos.close();

			System.out.println("Done....");

			// Read File as 8-bits
			File file = new File("d:/mydata.txt");

			FileInputStream fis = new   FileInputStream(file);
			
			InputStreamReader isr = new InputStreamReader(fis);
			
			BufferedReader br = new BufferedReader(isr);
			
			String a = br.readLine();
			
			System.out.println(a);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}