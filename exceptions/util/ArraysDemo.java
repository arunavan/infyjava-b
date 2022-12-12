//sorting and searching in an array 
//Arrays class
import java.io.*;
import java.util.*;

public class ArraysDemo
{
	public static void main(String s[]) throws IOException
	{
		int arr[] = new int[5];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i=0;i<5;i++)
		{
			System.out.print("Enter an interger:");

			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("Contents of array:");

		display(arr);
		
		Arrays.sort(arr);
		
		System.out.println("sorted elements:");
		
		display(arr);
		
		System.out.println("Which element to search:");
		
		int search = Integer.parseInt(br.readLine());
		
		int index = Arrays.binarySearch(arr,search);
		
		System.out.println("Location of "+search+":"+(index+1));
	}

	static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)

		System.out.println(arr[i]);
	}
}