class CoinGame {
    private BankAccount p1;
    private BankAccount p2;
    private Coin c1;
    private Coin c2;
    private double pot;
    private boolean printing;

    public CoinGame() {
	p1 = new BankAccount("Player 1", 1);
	p2 = new BankAccount("Player 2", 2);
	c1 = new Coin(0.5);
	c2 = new Coin(0.5);
	pot = 0;
    }

    public CoinGame(String n1, String n2) {
	p1 = new BankAccount(n1, 1);
	p2 = new BankAccount(n2, 2);
	p1.deposit(1000);
	p2.deposit(1000);
	c1 = new Coin(0.5);
	c2 = new Coin(0.5);
	pot = 0;
    }

    public CoinGame(double w1, double w2) {
	p1 = new BankAccount("Player 1", 1);
	p2 = new BankAccount("Player 2", 2);
	c1 = new Coin(w1);
	c2 = new Coin(w2);
	pot = 0;
    }

    public CoinGame(String n1, String n2, double w1, double w2) {
	p1 = new BankAccount(n1, 1);
	p2 = new BankAccount(n2, 2);
	c1 = new Coin(w1);
	c2 = new Coin(w2);
	pot = 0;
    }

    public void reset() {
	p1.setBalance(1000);
	p2.setBalance(1000);
	pot = 0;
    }

    private double nearestCent(double value) {
	value = value*100;
	value = Math.round(value);
	return value / 100;
    }

    public void turn() {
	double max = Math.min(p1.getBalance(), p2.getBalance()) / 3;
	//max withdraw is 1/3 smallest bank balanace
	double withdraw = nearestCent(Math.random() * max);
	p1.withdraw(withdraw);
	p2.withdraw(withdraw);
	pot = nearestCent(pot + withdraw); //To prevent .00000001 or .9999999
	if (printing)
	    System.out.println("The pot is: " + pot);

	c1.roll();
	c2.roll();

	if (c1.equals(c2) && c1.getFace().equals("Heads")) {
	    p1.deposit(pot);
	    pot = 0;
	}
	else if (c1.equals(c2) && c1.getFace().equals("Tails")) {
	    p2.deposit(pot);
	    pot = 0;
	}
	
	if (printing) {
	    System.out.println(p1.getName() + " rolled " + c1.getFace() + ".");
	    System.out.println(p2.getName() + " rolled " + c2.getFace() + ".");	
	    System.out.println(p1.getName() + " has $" + p1.getBalance());
	    System.out.println(p2.getName() + " has $" + p2.getBalance());
	}
    }
    
    public double getP1() {
	return p1.getBalance();
    }

    public double getP2() {
	return p2.getBalance();
    }

    public void play(int n, boolean printing) {
	reset();
	this.printing = printing;
	for (; n > 0; n--) {
	    turn();
	    if (printing)
		System.out.println("_________________________________");
	}

	//After turns

	System.out.println(p1.getName() + " has $" + p1.getBalance());
	System.out.println(p2.getName() + " has $" + p2.getBalance());

	if (p1.getBalance() > p2.getBalance())
	    System.out.println(p1.getName() + " wins!");
	else if (p2.getBalance() > p1.getBalance())
	    System.out.println(p2.getName() + " wins!");
	else
	    System.out.println(p1.getName() + " and " + p2.getName() + " tie!");
    }
	    
}
