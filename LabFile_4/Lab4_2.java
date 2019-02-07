public class Lab4_2 {
	
	class Account {
		  double balance;
		  boolean withdraw(double bal){
		    this.balance = this.balance - bal;
		    return true;
		  }
		}
	class SavingAccount extends Account{
	    
	    SavingAccount(){
	        
	    }
	    
	    SavingAccount(double bal){
	        saving.balance += bal;
	    }
	    
	    Account saving = new Account();
	    
	    final double minBalance = 500;
	    
	    @Override
	    public boolean withdraw(double bal){
	        if(saving.balance - bal >= 500){
	            saving.balance -= bal;
	            return true;
	        }
	        else
	            return false;
	    }
	}

	class CurrentAccount extends Account{
	    
	    CurrentAccount(){
	        
	    }
	    
	    CurrentAccount(double bal){
	        current.balance += bal;
	    }
	    
	    Account current = new Account();
	    
	    double OverDraftLimit = -2000;
	    
	    @Override
	    public boolean withdraw(double bal){
	        if(current.balance - bal >= -2000){
	            current.balance -= bal;
	            return true;
	        }
	        else
	            return false;
	    }
	    
	}

}
