import java.io.*;
import java.util.*;

public class Coingame{

    private Coinpurse p1 = new Coinpurse(500);
    private Coinpurse p2 = new Coinpurse(500);
    private int pot = 0;
    private Coin c1 = new Coin();

    public void potHelper(int amt){
	pot = pot + (2*amt);
	p1.removeAmt(amt);
	p2.removeAmt(amt);
    }
    public void setPot(){
	Random r = new Random();
	int x = r.nextInt(5);
	while (x >= 0){
	    int y = r.nextInt(4);
	    if (y == 0)
		potHelper(1);
	    else if (y == 1)
	        potHelper(5);
	    else if (y == 2)
		potHelper(10);
	    else
		potHelper(20);
	    x = x - 1;
	}
    }

    public void flipCoins(){
	c1.setCoin();
	c1.coinFlip();
	c1.coinFlip();
	int h = c1.getHeads();
	if (h == 2)
	    givePot(p1);
	else if (h == 0)
	    givePot(p2);
	else
	    {}
    }

    public void givePot(Coinpurse winner){
	winner.addAmt(pot);
	pot = 0;
    }
    public void winner(){
	int one = p1.getAmount();
	int two = p2.getAmount();
	if (one > two)
	    System.out.println("Player One is winning with $" + one + " and Player Two has $" + two + ".");
	else if (two > one)
	    System.out.println("Player Two is winning with $" + two + " and Player One has $" + one + ".");
	else
	    System.out.println("It is a tie with both at $" + one + ".");
    }

    public void turn(){
	setPot();
	System.out.println("The pot is $" + pot + ".");
	flipCoins();
	System.out.println("Head(s) flipped: " + c1.getHeads());
	winner();
    }

    public void turn(int x){
	while (x > 0){
	    turn();
	    x = x - 1;
	}
    }
}
