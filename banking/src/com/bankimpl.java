package com;

public class bankimpl  implements bank
{

	double balance;

	bankimpl(double balance)//constructor
	{
		this.balance=balance;
	}

	@Override
	public void deposit(int amt) 
	{
		if(amt>0)
		{
			balance=balance+amt;
			System.out.println("deposited amt is:"+amt);
		}

	}

	@Override
	public void withdraw(int amt) 
	{
		if(amt>0&&balance>amt)
		{
			balance=balance-amt;
			System.out.println("withdrawn amt is:"+amt);
		}

		else
		{
			try
			{
				throw new InsuficiantBalanceException("INSUFFICIENT BALANCE ");
			}

			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}



		}

	}

	@Override
	public double checkbalance() 
	{

		return balance;
	}
}
