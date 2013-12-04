import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
<<<<<<< HEAD
	Coin coin = new Coin();
	System.out.println("This flip has returned " + coin.getSide());
	/*if*/
	coin.side = "heads"
	System.out.println("The heads count is now" + coin.heads)
	/*if*/
	coin.reset();
	System.out.println("There have been no flips thus far")
=======
	Coin g = new Coin();
	System.out.println(g.Flip());
	System.out.println(g.getHeads());
	System.out.println(g.getTails());
	System.out.println(g.getFlips());
	System.out.println(g.getFairness());
	g.Flip();
	g.Flip();
	g.Flip();
	g.Flip();
	g.Flip();
	g.Flip();
	System.out.println(g.getHeads());
	System.out.println(g.getTails());
	System.out.println(g.getFlips());
	System.out.println(g.getFairness());
	g.Flip();
	g.Flip();
	g.Flip();
	g.Flip();
	System.out.println("This was a" + " " + g.getName());
	System.out.println("Head count is" + " " + g.getHeads());
	System.out.println("Tail count is" + " " + g.getTails());
	System.out.println("Total flip count is" + " " + g.getFlips());
	System.out.println("The fairness was" + " " + g.getFairness());
	/* This test should return all heads, with fairness tipped that way*/
	Coin a = new Coin(1, .01, "Penny");
	a.Flip();
	a.Flip();
	a.Flip();
	a.Flip();
	a.Flip();
	a.Flip();
	a.Flip();
	a.Flip();
	a.Flip();
	a.Flip();
	a.Flip();
	a.Flip();
	System.out.println("This was a" + " " + a.getName());
	System.out.println("Head count is" + " " + a.getHeads());
	System.out.println("Tail count is" + " " + a.getTails());
	System.out.println("Total flip count is" + " " + a.getFlips());
	System.out.println("The fairness was" + " " + a.getFairness());
	/*CoinPurse b = new CoinPurse();
	System.out.println("There are" + " " + b.getAmmount() + " " + "many cents in here");
	b.addTo(a);
	b.removeTo();
	b.addTo(g);
	System.out.println("There are" + " " + b.getAmmount() + " " + "many cents in here");*/
}}
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
