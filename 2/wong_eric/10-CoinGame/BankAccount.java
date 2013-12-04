
public class BankAccount {
    private double balance;
    private String name;
    private int acctnumber;

    public BankAccount(String n) {
	name=n;
	acctnumber = ((int)(Math.random() * 100000));
	balance = 1000.00;
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


