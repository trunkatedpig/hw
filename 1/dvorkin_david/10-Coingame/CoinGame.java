public class CoinGame {
    
    private BankAccount bankAccount1, bankAccount2;
    private Coin coin1, coin2;
    private double pot;
    private double x = Math.random() * 10;

    public CoinGame () { 
	pot = 0;
    }

    public CoinGame(BankAccount bankAccount1, BankAccount bankAccount2) {
        this.bankAccount1 = bankAccount1;
        this.bankAccount2 = bankAccount2;
        this.coin1=new Coin();
        this.coin2=new Coin();
    }

    public double createPot (BankAccount a, BankAccount b) {
       
    
        a.withdraw(x);
        b.withdraw(x);

	pot = pot +  2* x;
	return pot;
    }

    public String turn () {
	String a, b;
	a = coin1.flip();
	b = coin2.flip();
	createPot(bankAccount1, bankAccount2);

	if (a.equals("Heads") && b.equals("Heads")) {


	    bankAccount1.deposit(pot);
	    pot = 0;
	    return "Player 1 Wins";
	}
	else if (a.equals("Tails") && b.equals("Tails")) {
	    bankAccount2.deposit(pot);
	    pot = 0;
	    return "Player 2 Wins";
	}
        return "pot is currently " + pot;
    }
	public void play (int n){
	    while (n >= 1){
            System.out.println(turn());
		n = n - 1;
	    }
    }

   
}
