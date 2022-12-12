class Outer5
{
	int x= 10;
	static int y=15;

	class Inner5
	{
		public void m1()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}//inner

	public static void main(String args[])
	{
		new Outer5().new Inner5().m1();
	}
}//outer