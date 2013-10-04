import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin g = new Coin();
	g.Flip();
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
	CoinPurse b = new CoinPurse();
	System.out.println("There are" + " " + b.getAmmount() + " " + "many cents in here");
	b.addTo(a);
	b.removeTo();
	b.addTo(g);
	System.out.println("There are" + " " + b.getAmmount() + " " + "many cents in here");
}}
