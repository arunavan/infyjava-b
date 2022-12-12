// try with multiple catch blocks
class Test6
{
	public static void main(String args[])
	{
		try
		{
			String s=null;
			System.out.println(s.length());
			//System.out.println(10/0);
		}
		catch(NullPointerException ne)
		{
			System.out.println("catching NPE");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("catching AE");
		}
	}
}