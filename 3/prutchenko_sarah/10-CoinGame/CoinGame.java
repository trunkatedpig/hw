public class CoinGame{
    private int pot;
    private BankAccount p1, p2;
    private Coin c1, c2;
    private int turns;
    public CoinGame(int t){
	t = turns;
	play(t);
    }
    public void turn(){
	p1.withdraw(20);
	p2.withdraw(20);
	pot = pot + 40;
	c1.flip();
	c2.flip();
	while (p1.balance != 0 && p2.balace != 0){
	    if (c1.equals(c2) && c1.getFace== "heads"){
		p1.deposit(pot);
		pot = 0;
	    }
	    if (c1.equals(c2) && c1.getFace == "tails"){
		p2.deposit(pot);
		pot = 0;
	    }
	    else {
		p1.withdraw(5);
		p2.withdraw(5);
		pot = pot + 10;
	    }
	}
    }
	    
	
	
    }
    public void setup(){
	p1.balance = 100;
	p2.balance = 100;
	pot = 0;
    }
    public void play(int n){
	setup();
	while (n > 0){
	    turn();
	    n = n - 1;
    }
}
