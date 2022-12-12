class OuterClass
{
	class Inner4
	{
		public void m1()
		{
			System.out.println("-------inner class method-------");
		}
	}//inner
}//outer

class Outer4
{
	public static void main(String args[])
	{
		OuterClass o4= new OuterClass();
		OuterClass.Inner4  i4 = o4.new Inner4();
		i4.m1();
	}
}