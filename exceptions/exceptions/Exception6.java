class Test10
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("try block");
			return;
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