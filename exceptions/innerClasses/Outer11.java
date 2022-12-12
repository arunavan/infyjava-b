class Outer11
{
	public void m1()
	{
		// if x is non final we can not access
		final int x=10;
		class Inner11
		{
			public void m2()
			{
				System.out.println(x);
			}
		}//inner

		Inner11 i11= new Inner11();
		i11.m2();
	}//m1

	public static void main(String args[])
	{
		new Outer11().m1();
	}//main
 }//Outer