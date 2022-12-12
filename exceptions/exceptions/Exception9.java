class Test15
{
	public static void main(String args[])throws Exception
	{
		doStuff();
	}

	public static void doStuff()
	{
		doMoreStuff();
	}

	public static void doMoreStuff()throws Exception
	{
		Thread.sleep(1000);
	}
}