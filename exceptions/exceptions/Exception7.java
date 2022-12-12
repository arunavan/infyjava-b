class Test11
{
	public static void main(String args[])
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ClassCastException e)
		{
			System.out.println("catch block");
		}
		finally
		{
			String s=null;
			try
			{
				System.out.println(s.length());
			}
			catch(NullPointerException ne)
			{
				System.out.println("-----n p e-----");
			}
		}
	}//main
}//class