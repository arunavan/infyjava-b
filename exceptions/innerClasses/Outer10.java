class Outer10
{
	//int x=10;
	static int y = 20;

	public static  void m1()
	{
		class Inner10
		{
			public void m2()
			{
				//System.out.println(x);
				System.out.println(y);
			}
		}//inner

		Inner10 i10= new Inner10();
		i10.m2();
	}//m1

	public static void main(String args[])
	{
		new Outer10().m1();
	}//main
}//Outer