package com.capg.main;

import java.util.Scanner;

import com.capg.beans.Account;
import com.capg.beans.Account.AccountType;
import com.capg.bl.Schedular;
import com.capg.exceptions.InvalidAgeException;


public class CITIBank {

	public static Scanner sc = new Scanner(System.in);
	public static Schedular sch = new Schedular();
	public static void main(String[] args) {
		showMenu();
	}

	private static void showMenu() {
		
		int ch;
		System.out.println("****************Welcome to my bank account project***************");
		while(true) {
			System.out.println("1.Create a new account");
			System.out.println("2.Deposit to account");
			System.out.println("3.Withdraw from account");
			System.out.println("4.Get Balance Details");
			System.out.println("5.Get Account Details");
			System.out.println("6.Exit");

			System.out.print("Enter your choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:createNewAccount();
			       break;
			case 2:deposit();
		       break;
			case 3:withdraw();
			       break;
			case 4:getBalance();
			       break;
			case 5:getAccountDetails();
			       break;
			case 6:System.exit(0);
			       break;
			default:System.out.println("***********You enter a wrong choice !!***************");
			
			}
		}
	}

	private static void createNewAccount() {
		System.out.print("Enter your name : ");
		String name = sc.next();
		System.out.print("Enter your age : ");
		float age = sc.nextFloat();
		System.out.print("Enter intial balance you want to deposit : ");
		double balance = sc.nextDouble();
		System.out.print("Enter type of account 1.Saving and 2.Current : ");
		int type = sc.nextInt();
		if(type==1||type==2) {
			Account.AccountType accountType = (type==1) ? AccountType.SAVING:AccountType.CURRENT;
			try {
				System.out.println(sch.createAccount(name,age,balance,accountType));
			}catch(InvalidAgeException ue) {
				System.out.println(ue.getMessage());
			}
			
		}else {
			System.out.println("You enter a wrong choice for account type.");
		}
	}

	private static void deposit() {
		System.out.print("Enter your account number : ");
		long accountNumber = sc.nextLong();
		System.out.print("Enter the balance you want to deposit in your account : ");
		double balance = sc.nextDouble();
		
		String msg=sch.deposit(accountNumber,balance);
		System.out.println(msg);
	}

	private static void withdraw() {
		System.out.print("Enter your account number : ");
		long accountNumber = sc.nextLong();
		System.err.print("Enter the balance you want to withdraw from your account : ");
		double balance = sc.nextDouble();
		
		String msg=sch.withdraw(accountNumber,balance);
		System.out.println(msg);
		
	}

	private static void getBalance() {
		System.out.print("Enter your account number : ");
		long accountNumber = sc.nextLong();
		
		String msg=sch.getBalance(accountNumber);
		System.out.println(msg);
		
	}

	private static void getAccountDetails() {
		System.out.print("Enter your account number : ");
		long accountNumber = sc.nextLong();
		
		Account account=sch.getAccountDetails(accountNumber);
		if(account!=null) {
			System.out.println(account);
		}
		else {
			System.out.println("You enter a wrong credentials.\nPlease check your account number!!");
		}
	}
}