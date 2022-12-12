class Test7
{
	public static void main(String args[])
	{
		try
		{
			String s=null;
			//System.out.println(s.length());
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(" catching Exception");
		}
		catch(NullPointerException ne)
		{
			System.out.println(" cathing NPE");
		}
	}
}