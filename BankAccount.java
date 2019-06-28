class BankAccount
{
	int accno;
	String name;
	String type;
	float bal;
	

	public BankAccount(int ac,String n,String t,float b)
	{
		accno=ac;
		name=n;
		type=t;
		bal=b;

	}
	
	public void deposit(float a)
	{
		try
		{
			if(a<=0) throw new Exception();
			else
				bal=bal+a;
			System.out.println("Balance deposited ");
		}
		catch(Exception e)
		{
			System.out.println("Invalid balance");
		}



	}
	public void withdraw(float amt)
	{
		
		try
		{
			if((bal-amt) <1000)
				if(type=="saving") throw new Exception("balance less than 1000");
			if((bal-amt) <5000)
				if(type=="current") throw new Exception("balance less than 5000");
			 bal=bal-amt;
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}




	}
	public void getBalance()
	{
		try
		{
			if((bal<1000)&&(type=="saving")) throw new Exception("Balance less than 1000");
			else if((bal<5000)&&(type=="current"))  throw new Exception("Balance less than 5000");
			else System.out.println("Balance is Rs"+bal);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
	


	}
	public static void main(String []args)
	{
		BankAccount b=new BankAccount(1001,"amit","saving",10000);
		b.withdraw(1000.0f);
		
		b.getBalance();

	}





}