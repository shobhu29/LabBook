package com.capg.beans;

public class SavingAcc extends Account{
	
	private final long min_balance = 500;
	@Override
	public boolean withdraw(Account account,double balance) {
		if(min_balance>=(account.getBalance()-balance)) {
			return false;
		}
		account.setBalance(account.getBalance()-balance);
		return true;
	}
	
}

