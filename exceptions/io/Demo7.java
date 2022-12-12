import java.io.*;
import java.util.*;

public class Demo7
{
	public static void main(String[] args) throws IOException 
	{
		File file = new File("d:\\test\\mydir\\notes.txt");
		
		file.createNewFile();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Java Notes");
		
		String notes = sc.nextLine();

		FileWriter fw = new FileWriter(file, true); 	
		fw.write(notes);
		fw.write(" By abc");
		fw.flush(); 
		fw.close(); 

		System.out.println("Notes Saved...");
	}
}