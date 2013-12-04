
public class BankAccount {
    private double balance;
    private String name;
    private double interestRate;

    public BankAccount(String n, double bal) {
	name=n;
	balance = bal;
    }

    public void deposit(double amt) {
	// if to make sure amt > 0 would be better
	balance = balance + amt;
    }

    public void withdraw(double amt) {
	// this if is important
	if (balance >= amt) {
	    balance = balance - amt;
	}
    }

    public double getBalance() {
	return balance;
    }

    public void takeMoneyFrom(BankAccount other, double amt) {
	if (other.balance >= amt) {
	    other.withdraw(amt);
	    this.deposit(amt);
	}
    }

    public void giveMoneyTo(BankAccount other, double amt) {
	if (balance >= amt) {
	    balance = balance - amt;
	    other.balance = other.balance + amt;
	}
	
    }
}


