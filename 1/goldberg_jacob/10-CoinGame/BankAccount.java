public class BankAccount{
    private double balance;
    private String name;
    private double interestRate;
    private int acctNumber;

    public BankAccount(String n, double b){
	balance = b;
	name = n;
	interestRate = Math.random();
	acctNumber = (int)Math.round(10000000*(Math.random()));
    }

    public void deposit(double amt){
	balance = balance +  amt;
    }

    public void withdraw(double amt){
	balance = balance - amt;
	if (balance < 0){
	    balance = 0;
	}
    }

    public double getBalance(){
	return balance;
    }

    public String getName(){
	return name;
    }

    public int getAcct(){
	return acctNumber;
    }

    public void setBalance(double b){
	balance = b;
    }

    public void takeMoneyFrom(BankAccount other, double amt){
	if ((other.getBalance())>=amt){
	    balance = balance + amt;
	    other.withdraw(amt);
	}

	else {
	    balance = balance + other.getBalance();
	    other.withdraw(amt);
	}
    }

    public void giveMoneyTo(BankAccount other, double amt){
	if (balance >= amt){
	    balance = balance - amt;
	    other.setBalance(other.getBalance()+amt);
	}

	else{
	    other.setBalance(other.getBalance()+this.balance);
	    balance = 0;
	}
    }
	    
	    


}
