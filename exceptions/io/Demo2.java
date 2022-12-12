import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo2 
{
	public static void main(String[] args) throws IOException
	{
		// Get Name Form User / Print in Console.

		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Name:");

		//int uc = isr.read();

		String str = br.readLine();

		// System.out.println((char) uc);

		System.out.println(str);
	}
}