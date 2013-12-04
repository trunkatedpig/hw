public class CoinGame {
    private BankAccount p1;
    private BankAccount p2;
    private Coin c1;
    private Coin c2;
    private double ante;
    private double pot;
    private int round;

    public CoinGame(BankAccount pp1, BankAccount pp2) {
	p1=pp1;
	p2=pp2;
	c1=new Coin();
	c2=new Coin();
	ante=0.25;
	pot=0;
	round=0;
    }
    
    public int turn() {
	if (p1.getBalance()<ante || p2.getBalance()<ante) {
	    System.out.println("Someone doesn't have enough money to play.");
	    return 1;
	} else {
	    p1.withdraw(ante);
	    p2.withdraw(ante);
	    pot=pot+(2*ante);
	    c1.flip();
	    c2.flip();
	    round=round+1;
	    System.out.println("--round "+round+"--");
	    if (c1.getFace()==0 && c2.getFace()==0) {
		System.out.println("p1 won the pot");
		p1.deposit(pot);
		pot=0;
	    } else if (c1.getFace()==1 && c2.getFace()==1) {
		System.out.println("p2 won the pot");
		p2.deposit(pot);
		pot=0;
	    } else {
		System.out.println("No one won the pot.");
	    }
	    printStatus();
	    return 0;
	}
    }

    public void play(int turns) {
	boolean ok=true;
	while (turns>0 && ok) {
	    if (turn()==1) {ok=false;}
	    turns=turns-1;
	}
    }

    public void printStatus() {
	System.out.println("p1: "+p1.getBalance()+" | p2: "+p2.getBalance());
        System.out.println("pot: "+pot+" | ante: "+ante);
	System.out.println();
    }
}
