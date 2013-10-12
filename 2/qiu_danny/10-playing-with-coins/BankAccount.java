public class BankAccount {

    private int money;

    public BankAccount() {
        money = 0;
    }

    public BankAccount(int money) {
        this.money = money;
    }

    public void deposit(int amt) {
        money = money + amt;
    }

    public void withdraw(int amt) {
        money = money - amt;
    }

    public void giveMoney(BankAccount other, int amt) {
        other.deposit(amt);
        this.withdraw(amt);
    }

    public void takeMoney(BankAccount other, int amt) {
        other.giveMoney(this, amt);
    }

    public int getMoney() {
        return money;
    }
}
