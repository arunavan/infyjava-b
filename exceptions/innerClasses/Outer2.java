class Outer2
{
	class Inner2
	{
		public void m1()
		{
			System.out.println("-------inner class method-------");
		}
	}//inner

	public static void main(String args[])
	{
		Outer2 o2 = new Outer2();
		Outer2.Inner2 i2 = o2.new Inner2();
		i2.m1();
	}//main
}//outer