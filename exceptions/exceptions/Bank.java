//Custom/UserDefine Exception

class WithdrawException extends Exception
{
  WithdrawException(){}
  WithdrawException(String s)
  {
    super(s);
  }
}
class Account
{
  void withdraw(int amt) throws WithdrawException
  {
    if (amt > 5000)
      throw new WithdrawException("Balance is Less");
    else
      System.out.println("Balance:"+(5000-amt));
  }
}
class Bank
{
  public static void main(String[] args)
  {
    Account a = new Account();
    try
    {
      a.withdraw(6000);
    }
    catch(WithdrawException e)
    {
      System.out.println(e);
    }
  }
}