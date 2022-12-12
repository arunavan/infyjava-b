class Outer8
{
	public void m1()
	{
		class Inner8
		{
			public void sum(int x,int y)
			{
				System.out.println("the sum is "+(x+y));
			}
		}//inner

		Inner8 i8 = new Inner8();
		i8.sum(10,20);
	}//m1

	public static void main(String args[])
	{
		new Outer8().m1();
	}//main
}//Outer