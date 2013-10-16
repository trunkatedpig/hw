public class CoinGame {
    private double pot;
    private Coin c1;
    private Coin c2;
    private BankAccount ba1 = new BankAccount("Player 1", 345);
    private BankAccount ba2 = new BankAccount("Player 2", 345);
    private int startAmt;
    
    public CoinGame (int startAmt){
	c1 = new Coin();
	c2 = new Coin();
	startAmt = startAmt;
	ba1.deposit(startAmt);
	ba2.deposit(startAmt);
	pot = 0.0;
    }
    
    public double getPot(){
	double p = Math.random();
	if (ba1.getBalance()>= p){
	    ba1.withdraw(pot);}
	if (ba2.getBalance()>= p){
	    ba2.withdraw(pot);}
	pot = pot + p + p;
	return pot;
    }
    
    public void turn(){
	c1.flip();
	c2.flip();
	if (c1.getFace().equals(c2.getFace())){
	    if (c1.getFace().equals("heads")){
		ba1.deposit(pot);
		System.out.println("Player 1 wins!");
		pot = 0.0;
	    }
	    else {
		ba2.deposit(pot);
		System.out.println("Player 2 wins!");
		pot = 0.0;
	    }
	}
	else {
	    System.out.println("No One Wins!");}
	System.out.println(ba1.getBalance());
	System.out.println(ba2.getBalance());
    }
    public void play (int n){
	while (n != 0){
	    System.out.println ("Turns Left: " + n);
	    turn();
	    n = n-1;
	}
    }
}
