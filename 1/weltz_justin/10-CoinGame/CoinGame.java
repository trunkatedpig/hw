import java.io.*;
import java.util.*;
//worked with Brian
public class CoinGame {
    private double pot = 0.0;
    private Coin c1 = new Coin();
    private Coin c2 = new Coin();
    private BankAccount b1 = new BankAccount("player1", 1);
    private BankAccount b2 = new BankAccount("player2", 2);
    private String win = " ";
    public void BankAccounts() {
	b1.deposit(100);
	b2.deposit(100);
    }
    public void setPot(BankAccount x, BankAccount y){
        Random q = new Random();
	if (x.getBalance() <= y.getBalance()){
	    double z = q.nextInt((int)(x.getBalance()));
	    x.withdraw(z);
	    y.withdraw(z);
	    z = 2.0*z;
	    pot = pot + z;
	}
	else{
	    double d = q.nextInt((int)(y.getBalance()));
	    y.withdraw(d);
	    x.withdraw(d);
	    d = 2.0*d;
	    pot = pot + d;
	}
    }
    public void Flip(Coin a, Coin b){
	a.flip();
	b.flip();
	String r = a.getFace();
	String l = b.getFace();
	if (r.equals("Heads") &&  l.equals( "Heads")){
	    win = "b1";}
	if (r.equals("Tails") &&  l.equals( "Tails")){
	    win = "b2";}
    }
    public void setBankAccounts( BankAccount x, BankAccount y){
	if (win.equals("b1"))
	    {
		x.deposit(pot);
		pot = 0.0;
	    }
	if (win.equals("b2"))
	    {
		y.deposit(pot);
		pot = 0.0;
	    }
	win = " ";
    }
    public void Turn(){
	setPot(b1,b2);
	Flip(c1,c2);
	setBankAccounts(b1,b2);
    }
    public void play(int n){
	while (n > 0){
	    Turn();
	    n = n - 1;
	}
    }
    public String winning(){
	String answer = "player 1 has " + b1.getBalance() + " player 2 has " + b2.getBalance();
	return answer;
    }
    public double getPot(){
	return pot;
    }
}
       
	    
	   
	
	
    


