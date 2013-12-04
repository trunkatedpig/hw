public class CoinGame {
    private BankAccount p1;
    private BankAccount p2;
    private Coin c1;
    private Coin c2;
    private double bet;
    private double pot;
    private int round;

    public CoinGame(BankAccount op1, BankAccount op2) {
	p1=op1;
	p2=op2;
	c1=new Coin();
	c2=new Coin();
	bet=0.25;
	pot=0;
	round=0;
    }
    
    public int turn() {
	if (p1.getBalance()<bet || p2.getBalance()<bet) {
	    System.out.println("Game aborted. Insuffiecent funds");
	    return 1;
	} else {
	    p1.withdraw(bet);
	    p2.withdraw(bet);
	    pot=pot+(bet *2);
	    c1.flip();
	    c2.flip();
	    round=round+1;
	    System.out.println("round number is  "+round);
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

    public void start(int turns) {
	boolean b=true;
	while (turns>0 && ok) {
	    if (turn()==1) {b=false;}
	    turns=turns-1;
	}
    }

    public void printStatus() {
	System.out.println("p1 balnce is "+p1.getBalance()+" and  p2 balnce is  "+p2.getBalance());
        System.out.println("pot is "+pot+" and bet is "+bet);
	System.out.println();
    }
}
