class Test5
{
	public static void main(String args[])
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			//ae.printStackTrace();
			//System.out.println(ae);
			System.out.println(ae.getMessage());
		}
	}
}