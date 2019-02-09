package com.capg.beans;

public class Account {
	
	public enum AccountType{SAVING,CURRENT};
	private long accNum;
	private double balance;
	private Person accHolder;
	private AccountType accountType;
	
	
	

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + ", accountType="
				+ accountType + "]";
	}

	
	public long getAccNum() {
		return accNum;
	}


	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Person getAccHolder() {
		return accHolder;
	}


	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}


	public AccountType getAccountType() {
		return accountType;
	}


	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}


	public boolean withdraw(double balance) {
		this.balance = this.balance-balance;
		return true;
	}
	
	public void deposit(double balance) {
		this.balance = this.balance+balance;
	}

	public boolean withdraw(Account account, double balance2) {
		// TODO Auto-generated method stub
		return false;
	}
}