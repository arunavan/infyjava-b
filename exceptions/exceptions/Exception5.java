class Test9
{
	public static void main(String args[])
	{
		try
		{
			System.out.println(10/0);
		}
		catch(NullPointerException e)
		{
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("finally block");
		}
	}//main
}//class