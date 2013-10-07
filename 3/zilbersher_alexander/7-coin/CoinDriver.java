import java.io.*;
import java.util.*;

public class CoinDriver {
    public static void main(String[] args) {
        Coin c1 = new Coin();
        System.out.println("Basic coin: ");
        System.out.println("Name: " + c1.getName());
        System.out.println("Value: " + c1.getValue());
	System.out.println("Probability: " + c1.getProb());
        System.out.println("Face: " + c1.getFace());
	System.out.println("Tosses: " + c1.getTosses());
        System.out.println("Heads: " + c1.getHeads());

	Coin c2 = new Coin("quarter");
	System.out.println("A quarter: ");
        System.out.println("Name: " + c2.getName());
        System.out.println("Value: " + c2.getValue());
	System.out.println("Probability: " + c2.getProb());
        System.out.println("Face: " + c2.getFace());
	System.out.println("Tosses: " + c2.getTosses());
        System.out.println("Heads: " + c2.getHeads());

	Purse p1 = new Purse();
	System.out.println("Base purse: ");
	System.out.println("Amount: " + p1.getAmount());

	p1.addTo(c1);
	p1.addTo(c2);
	
	System.out.println("Purse with a penny and a quarter added: ");
	System.out.println("Amount: " + p1.getAmount());
	
	p1.removeFrom(c1,4);
	System.out.println("Same purse with x4 pennies removed: ");
	System.out.println("Amount: " + p1.getAmount());
    }
}