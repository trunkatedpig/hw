
public class BankAccount {
    private double balance;
    private String name;
    private double interestRate;
    private int acctnumber;
    public BankAccount(double b) {
	balance = b;
    }
    public BankAccount(String n, int act) {
	name=n;
	acctnumber = act;
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
    public String getName() {
	return name;
    }

    public String takeMoneyFrom(BankAccount other, double amt) {
	if (other.balance >= amt) {
	    other.withdraw(amt);
	    this.deposit(amt);
	    String y= "";
	    return y;
	}
	else {
	    String x= other.name+" is bankrupt and has lost.";
	    return x;
	}
    }
    public void giveMoneyTo(BankAccount other, double amt) {
	if (balance >= amt) {
	    balance = balance - amt;
	    other.balance = other.balance + amt;
	}
	
    }
}


