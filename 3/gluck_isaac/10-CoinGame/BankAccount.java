public class BankAccount {
    private double balance, interestRate;
    private String name;
    private int acctnumber;

    public BankAccount(String name, double balance) {
	this.name = name;
	this.balance=balance;
	interestRate = 0.3;
	acctnumber = 0;
    }

    public void deposit(double amt) {
	balance = balance + amt;
    }

    public void withdraw(double amt) {
	if (amt < balance)
	    balance = balance - amt;
    }

    public double getBalance() {
	return balance;
    }

    public void takeMoneyFrom(BankAccount other, double amt) {
	if (amt < other.balance) {
	    other.withdraw(amt);
	    balance = balance + amt;
	}
    }

    public void giveMoneyTo(BankAccount other, double amt) {
	if (amt < balance) {
	    balance = balance - amt;
	    other.deposit(amt);
	}
    }

    public String getName() {
	return name;
    }
}

