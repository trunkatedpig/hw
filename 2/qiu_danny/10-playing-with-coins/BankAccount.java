public class BankAccount {

    private String name;
    private int money;

    public BankAccount(String name) {
        this.name = name;
        money = 0;
    }

    public BankAccount(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void deposit(int amt) {
        money = money + amt;
    }

    public void withdraw(int amt) {
        if (money >= amt) {
            money = money - amt;
        }
        else {
            System.out.println(name + " does not have enough money to withdraw!");
        }
    }

    public void giveMoney(BankAccount other, int amt) {
        if (money >= amt) {
            other.deposit(amt);
            this.withdraw(amt);
        }
        else {
            System.out.println(name + " does not have enough money to give away!");
        }
    }

    public void takeMoney(BankAccount other, int amt) {
        other.giveMoney(this, amt);
    }

    public String getName() {   
        return name;
    }
    public int getMoney() {
        return money;
    }
}
