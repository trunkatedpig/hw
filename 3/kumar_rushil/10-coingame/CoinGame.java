import java.util.*;
import java.io.*;
public class CoinGame{
    Coin cp1 = new Coin();
    Coin cp2 = new Coin();
    BankAccount bap1 = new BankAccount();
    BankAccount bap2 = new BankAccount();
    BankAccount pot = new BankAccount();
    Random r = new Random();
    private double initial, PutIn,test;
    private int timesplayed;


    public void startGame(){//sets up the game and initializes variables
	timesplayed = 0;
	test = 0.0;
	PutIn = 0.0;
	initial = r.nextDouble();
	initial = (int)(1000 * initial) + 0.0;
	initial = initial / 100;
        bap1.setBalance((20.0 - initial));
	bap2.setBalance((20.0 - initial));
	pot.setBalance(initial);
    }
    public void play(int n){
	int rounds = 0;
	while ((bap1.getBalance() > PutIn) && (bap2.getBalance() > PutIn) && (n > rounds)){
	    rounds = rounds + 1;
	    timesplayed = timesplayed + 1;
	    double d = r.nextDouble();//gets a random coin value that both players put into the pot
		if (d <= 0.25){
		    PutIn = 0.01;
		} else {
		    if (d <= 0.50){
			PutIn = 0.05;
		    } else {
			if (d <= 0.75){
			    PutIn = 0.10;
			} else {
			    PutIn = 0.25;
			}
		    }
		}
		bap1.withdraw (PutIn);//withdraws the amount from both players and flips coin
		bap2.withdraw (PutIn);
		cp1.setNameValue(PutIn);
		cp1.Flip();
		cp2.setNameValue(PutIn);
		cp2.Flip();
		if ((cp1.getFace() == "Heads")&&(cp2.getFace() == "Heads")){//result of coin flip
		    bap1.deposit((PutIn + PutIn));
		    cp1.resetCoin();
		    cp2.resetCoin();
		}
		if ((cp1.getFace() == "Tails")&&(cp2.getFace() == "Tails")){
		    bap2.deposit((2 * PutIn));
		    cp1.resetCoin();
		    cp2.resetCoin();
		}
		if (cp1.getFace() != cp2.getFace()){
		    pot.deposit((2 * PutIn));
		    cp1.resetCoin();
		    cp2.resetCoin();
		}
	}
    }
    public void turn(){//plays one turn
	play (1);
    }

    public String getWinner(){//returns the winner or returns if its a tie
	if (bap1.getBalance() > bap2.getBalance()){
	    return "Player 1";
	} else {
	    if (bap2.getBalance() > bap1.getBalance()){
		return "Player 2";
	    } else {
		return "tie";
	    }
	}
    }

    public double getWinnerBalance(){//returns the amount of money the winner has
	if (bap1.getBalance() > bap2.getBalance()){
	    return (bap1.getBalance());
	} else {
	    return (bap2.getBalance());
	}
    }
    public void preciseDoubles(){//makes doubles precise to the hundreths place
	int p1,p2,p3,r1,r2,r3;	
	double d1,d2,d3;

	p1 = (int)(1000.0 * (bap1.getBalance()));		      
	r1 = p1 % 10;
	if (r1 >= 5){
	    p1 = p1 + (10 - r1);
	} else {
	    p1 = p1 - r1;
	}
	d1 = p1 / 1000.0;
	bap1.setBalance(d1);

	p2 = (int)(1000.0 * (bap2.getBalance()));
	r2 = p2 % 10;
	if (r2 >= 5){
	    p2 = p2 + (10 - r2);
	} else {
	    p2 = p2 - r2;
	}
	d2 = p2 / 1000.0;
	bap2.setBalance(d2);

	p3 = (int)(1000.0 * (pot.getBalance()));
	r3 = p3 % 10;
	if (r3 >= 5){
	    p3 = p3 + (10 - r3);
	} else {
	    p3 = p3 - r3;
	}
	d3 = p3 / 1000.0;
	pot.setBalance(d3);
    }
    public double getInitial(){
	return initial;
    }
    public int getTimesplayed(){
	return timesplayed;
    }
    public double getPotbalance(){
	return pot.getBalance();
    }
}
