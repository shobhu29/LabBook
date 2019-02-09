package com.capg.bl;

import com.capg.beans.Account;
import com.capg.beans.Account.AccountType;
import com.capg.beans.CurrentAcc;
import com.capg.beans.Person;
import com.capg.beans.SavingAcc;
import com.capg.exceptions.InvalidAgeException;

public class Schedular {
	
	private Account[] acnt = new Account[10];
	private long accNumCounter=1001;
	private int counter;
	public String createAccount(String name, float age, double balance,AccountType accountType) throws InvalidAgeException {
		if(age>15f) {
			if(balance<500) {
				return "Your Account is not created.\nIntianl account balance should be atleast 500 rupees.";
			}else {
				Person accountHolder = new Person(name,age);
				if(accountType.equals(AccountType.SAVING)) {
					acnt[counter] = new SavingAcc();
				}
				else {
					acnt[counter] = new CurrentAcc();
				}
				acnt[counter].setAccHolder(accountHolder);
				acnt[counter].setAccNum(accNumCounter);
				acnt[counter].setAccountType(accountType);
				acnt[counter].setBalance(balance);
				accNumCounter++;
				counter++;
				return "Your Account is created sucessfully.\nYour account number is "+(accNumCounter-1);
			}
		}
		throw new InvalidAgeException();
		
	}
	public String deposit(long accountNumber, double balance) {
		for(int i=0;i<counter;i++) {
			if(acnt[i].getAccNum()==accountNumber) {
				acnt[i].deposit(balance);
				return "You balance is updated sucessfully.\nCurrent Balance in your account is : "+acnt[i].getBalance();
			}
		}
		return "You enter a wrong credentials.\nPlease check your account number!!";
	}
	public String withdraw(long accountNumber, double balance) {
		
		for(int i=0;i<counter;i++) {
			if(acnt[i].getAccNum()==accountNumber) {
				boolean msg=acnt[i].withdraw(acnt[i],balance);
				if(msg==false) {
					return "You have less amount in your account.\nYou can not access "+balance+" from your account!!";
				}
				return "You balance is updated sucessfully.\nCurrent Balance in your account is : "+acnt[i].getBalance();
			}
		}
		return "You enter a wrong credentials.\nPlease check your account number!!";
	}
	public String getBalance(long accountNumber) {
		
		for(int i=0;i<counter;i++) {
			if(acnt[i].getAccNum()==accountNumber) {
				return "Current Balance in your account is : "+acnt[i].getBalance();
			}
		}
		return "You enter a wrong credentials.\nPlease check your account number!!";
	}
	public Account getAccountDetails(long accountNumber) {
		
		for(int i=0;i<counter;i++) {
			if(acnt[i].getAccNum()==accountNumber) {
				return acnt[i];
			}
		}
		return null;
	}
	
	
}