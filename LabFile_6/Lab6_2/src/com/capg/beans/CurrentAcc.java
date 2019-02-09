package com.capg.beans;


public class CurrentAcc extends Account{
		
		private final long over_draft_limit = -5000;
		@Override
		public boolean withdraw(Account account,double balance) {
			if(over_draft_limit>=(account.getBalance()-balance)) {
				return false;
			}
			account.setBalance(account.getBalance()-balance);
			return true;
		}
}
