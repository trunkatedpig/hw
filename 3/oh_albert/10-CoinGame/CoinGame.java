import java.util.*;
import java.io.*;

public class CoinGame {

    private Coin c1,c2;
    private BankAccount b1 = new BankAccount("John",1),b2 = new BankAccount("Mary",2);
    private Random rand = new Random();
    private double pot=0,with=rand.nextDouble();
    private String result1,greeting,greeting2,greeting3,greeting4,out1,out2,out3,round,finale1,finale2,finale3;
    
    public void turn() {
	pot = with * 20;
	b1.withdraw(with);
	b2.withdraw(with);
	if (rand.nextDouble() <= 0.5) {
	    c1 = new Coin("Heads");
	}else{
	    c1 = new Coin("Tails");
	}
	if (rand.nextDouble() <= 0.5) {
	    c2 = new Coin("Heads");
	}else{
	    c2 = new Coin("Tails");
	}
	if (c1.getFace().equals("Heads") && c2.getFace().equals("Heads")) {
	    b1.deposit(pot);
	    result1 = "John, player 1 wins and gets " + pot + " dollars!";
	    System.out.println(result1);
	} else if (c1.getFace().equals("Tails") && c2.getFace().equals("Tails")){
	    b2.deposit(pot);
	    result1 = "Mary, player 2 wins and gets " + pot + " dollars!";
	    System.out.println(result1);
	} else {
	    result1 = "The round was a tie and nobody won...";
	    System.out.println(result1);
	}
    }

    public void play(int n) {
	int counter = 1;
	while (counter <= n) {
	    round = "Round " + counter + " has started!";
	    System.out.println(round);
	    greeting = b1.getName() + " and " + b2.getName() + " will be our players.";
	    System.out.println(greeting);
	    greeting2 = "The amount in the pot is " + pot;
	    System.out.println(greeting2);
	    greeting3 = "The balance of " + b1.getName() + "'s account is " + b1.getBalance();
	    System.out.println(greeting3);
	    greeting4 = "The balance of " + b2.getName() + "'s account is " + b2.getBalance();
	    System.out.println(greeting4);
	    turn();
	    out1 = "This is the end of round " + counter;
	    System.out.println(out1);
	    out2 = b1.getName() + "'s account balance is " + b1.getBalance();
	    System.out.println(out2);
	    out3 = b2.getName() + "'s account balance is " + b2.getBalance();
	    System.out.println(out3);
	    counter ++;
	}
	finale1 = "";
	System.out.println(finale1);
	System.out.println(finale1);
	System.out.println(finale1);
	System.out.println(finale1);
	finale2 = "The game has ended.";
	System.out.println(finale2);
	if (b1.getBalance() > b2.getBalance()) {
	    System.out.println(b1.getName() + " has won the game, congratulations!");
	}else if (b2.getBalance() > b1.getBalance()){
	    System.out.println(b2.getName() + " has won the game, congratulations!");
	} else {
	    System.out.println("The game ended in a tie...");
	}
    }

}
