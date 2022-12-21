class ThreadDemo5
{
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getName());

		Thread.currentThread().setName("hero");

		System.out.println(Thread.currentThread().getName());
	}
}