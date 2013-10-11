public class CoinGame {
    private double pot;
    private BankAccount p1,p2;
    private Coin c1,c2;

    public CoinGame() {
	p1 = new BankAccount("p1", 1);
	p2 = new BankAccount("p2", 2);
	c1 = new Coin();
	c2 = new Coin();
	
	
    }

    public void turn() {
	int least;
	pot += 10;
	c1.flip();
	c2.flip();
	if (c1.getFace() == "heads" && c2.getFace() == "heads") {
	    p1.deposit(pot);
	    pot = 0;
	} else if (c1.getFace() == "tails" && c2.getFace() == "tails") {
	    p2.deposit(pot);
	    pot = 0;
	}
    }
    
    public void play(int n) {
	while (n > 0) {
	    turn();
	    n = n - 1;
	}
    }

    public void printStatus() {
	System.out.println("p1 has " + p1.getBalance());
	System.out.println("p2 has " + p2.getBalance());
    }

  

    

}