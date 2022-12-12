class Test8
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("------try block stmt----");
			// System.out.println(10/0);
			System.out.println("-------try block stmt 2---");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("------catch block stmt----");
		}
		finally
		{
			System.out.println("-----finally block stmt----");
		}
	}//main
}//class   