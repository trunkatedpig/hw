public class BankAccount{
    private double balance;
    private String name;
    private int acctnumber;

    public BankAccount(String n){
        name = n;
    }

    public void deposit(double amt){
	balance = balance + amt;
    }
    public void withdraw(double amt){
	if (balance >= amt){
	    balance = balance - amt;
	}
    }
    public double getBalance(){
	return balance;
    }

    public void takeMoneyFrom(BankAccount other, double amt){
	if (other.balance >= amt){
	    other.withdraw(amt);
	    this.deposit(amt);
	}
    }

    public void giveMoneyTo(BankAccount other, double amt){
	if (balance >= amt){
	    balance = balance = amt;
	    other.balance = other.balance + amt;
	}
    }
}
