package com.IllegalArgumentException;

public class Banking {
	String name ;
	double amount;
	double balance=2000;
	public void With(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance" );
			System.out.println("Available Balance = " +balance);
		}else
		{
			System.out.println(amount + "Withdrawal Sucessful");
			System.out.println("Updated Balance = " + (balance-amount));
		}
	}
		public static void main(String[] args) {
			Banking b = new Banking();
			b.With(500);
		}

}