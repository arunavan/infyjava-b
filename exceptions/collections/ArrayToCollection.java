import java.util.*;
import java.io.*;

public class ArrayToCollection{
	public static void main(String args[]) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How many elements you want to add to the array: ");
		int n = Integer.parseInt(in.readLine());
		String[] name = new String[n];
		for(int i = 0; i < n; i++){
			name[i] = in.readLine();
		}
		List<String> list = Arrays.asList(name); //Array to Collection
		System.out.println("Elements of the list: ");
		for(String li: list){
			String str = li;
			System.out.print(str + " ");
		}
	}
}
