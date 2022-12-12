class Outer9
{
	int x=10;
	static int y = 20;

	public void m1()
	{
		class Inner9
		{
			public void m2()
			{
				System.out.println(x);
				System.out.println(y);
			}
		}//inner

		Inner9 i9= new Inner9();
		i9.m2();
	}//m1

	public static void main(String args[])
	{
		new Outer9().m1();
	}//main
 }//Outer