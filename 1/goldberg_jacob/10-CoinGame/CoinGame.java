import java.io.*;
import java.util.*;

public class CoinGame{
    private double pot;
    private BankAccount player1, player2;
    private Coin coin1, coin2;
    private String c1f, c2f;

    public CoinGame(BankAccount p1, BankAccount p2, Coin c1, Coin c2){
	player1 = p1;
	player2 = p2;
	coin1 = c1;
	coin2 = c2;
	pot = 0;
    }

    public void setPot(){
	int max = 0;
	int p1b = (int)(player1.getBalance());
	int p2b = (int)(player2.getBalance());
	if (p1b > p2b){
	    max = max + p2b;
	}
	else {
	    max = max + p1b;
	}

	/*creates a random ammount to withdraw from each based on how much they
	  can give*/
	Random a = new Random();
	pot = a.nextInt(max+1);
	player1.withdraw(pot);
	player2.withdraw(pot);
	pot = pot + pot;
    }

    public void FlipCoins(){
	c1f = coin1.Flip();
	c2f = coin2.Flip();

	/*The following if statement will use the results of the two flips,
	  which return either heads or tails */

	if (c1f.equals(c2f)){
	    if (c1f == "Heads"){
		player1.deposit(pot);
	    }
	    else{
		player2.deposit(pot);
	    }
	    pot = 0;
	    }
    }

    public void turn(){
	if (pot == 0){
	    setPot();
		}
	FlipCoins();
    }

    public void playLimit(int n){
	int turn = 1;
	while (n>0){
	    if (((int)player1.getBalance()==0) || ((int)player2.getBalance()==0)){
		break;
	    }
	    turn();
	    System.out.println("Turn" + turn);
	    turn = turn + 1;
	    n = n - 1;
		}
	System.out.println(player1.getName() + " has " + player1.getBalance() + " dollars");
	System.out.println(player2.getName() + " has " + player2.getBalance() + " dollars");
	if (player1.getBalance()>player2.getBalance()){
	    System.out.println(player1.getName() + " wins!");
		}
	else {
	    System.out.println(player2.getName() + " wins!");
		}
    }

    public void playDomination(){
	int turn = 1;
	while ((player1.getBalance()>0)&&(player2.getBalance()>0)){
	    turn();
	    System.out.println("Turn" + turn);
	    turn = turn + 1;
		}
	System.out.println(player1.getName() + " has " + player1.getBalance() + " dollars");
	System.out.println(player2.getName() + " has " + player2.getBalance() + " dollars");
	if (player1.getBalance()>player2.getBalance()){
	    System.out.println(player1.getName() + " wins!");
		}
	else {
	    System.out.println(player2.getName() + " wins!");
		}
    }
}
