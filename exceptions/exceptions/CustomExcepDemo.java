// UserDefine Exception

class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
	}
}

class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}

class CustomExcepDemo
{ 
	public static void main(String args[])
	{
		int age = Integer.parseInt(args[0]);

		if(age > 60)
		{
			throw new TooYoungException("please wait for some more time");
		}

		if(age < 16)
		{
			throw new TooOldException("you r too old");
		}
		else
		{
			System.out.println("thanks for registering");
		}
	}
}