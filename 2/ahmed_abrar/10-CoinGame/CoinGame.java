import java.io.*;
import java.util.*;

public class CoinGame {
    private double pot = 0, bet;
    private Coin a = new Coin(), b = new Coin();
    private BankAccount p1 = new BankAccount( "p1", 1), p2 = new BankAccount( "p2", 2);
    private int game = 0;

    public CoinGame() {
	 p1.deposit(50.0);
	 p2.deposit(50.0);
	 bet = 5.0;
    }

    public CoinGame( double bet, double start) {
	p1.deposit ( start );
	p2.deposit ( start );
	this.bet = bet;
    }

    public void turn(){
	if ( p1.getBalance() >= bet )
		p1.withdraw( bet );
	else game = 2;
	if ( p2.getBalance() >= bet )
	    p2.withdraw( bet );
	else game = 1;
	if ( game == 0 ) {
	    pot += bet * 2;
	    String aflip,bflip;
	    aflip = a.flip();
	    bflip = b.flip();
	    if ( aflip.equals ( "Heads" ) && bflip.equals ( "Heads" ) ) {
		p1.deposit ( pot );
		pot = 0;
	    }
	    if ( aflip.equals ( "Tails" ) && bflip.equals ( "Tails" ) ) {
		p2.deposit ( pot );
		pot = 0;
	    }
	}
	//else endGame();
    }

    public void play ( int n ) {
	while ( n != 0 ) {
	    if ( game == 0 ) {
		turn();
	    }
	    n = n - 1;
	}
    }

    public String getScores() {
	if ( game == 0 ) {
		double oneScore, twoScore;
		oneScore = p1.getBalance();
		twoScore = p2.getBalance();
		return "P1:" + oneScore + "\nP2:" + twoScore;
	    }
	else return "Player " + game + " Wins";
    }
}
