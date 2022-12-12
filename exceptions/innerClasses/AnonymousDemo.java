class Popcorn
{
	public void taste()
	{
		System.out.println("------salty-----");
	}
}

class AnonyousDemo
{
	public static void main(String args[])
	{
		Popcorn p = new Popcorn()
					{
						public void taste()
						{
							System.out.println("-----spicy-----");
						}
					};
		p.taste();
	}//main
}