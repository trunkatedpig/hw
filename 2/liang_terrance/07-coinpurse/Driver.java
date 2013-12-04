import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]){
	Coin c,c2;
	CoinPurse CP;

	c = new Coin("Quarter",50);
	c.setFace("Heads");
	System.out.println("The current face is: " + c.getFace());
	c.faceFlip();
	System.out.println("The current face is: " + c.getFace());
	c.faceFlip();
	System.out.println("The current face is: " + c.getFace());
	c.faceFlip();
	System.out.println("The current face is: " + c.getFace());
	c.faceFlip();
	System.out.println("The current face is: " + c.getFace());
	c.faceFlip();
	System.out.println("The current face is: " + c.getFace());
	System.out.println("Heads have been flipped " + c.getHeads() + " times.");
	System.out.println("Tails have been flipped " + c.getTails() + " times.");
	
	System.out.println("Coin " + c.getName() + " has a value of " + c.getValue());
	
	c2 = new Coin ("Dime", 10);
	CP = new CoinPurse();
	CP.addTo(c2);
	System.out.println("The purse currently has " + CP.getAmount());
	CP.removeFrom(c);
	System.out.println("The purse currently has " + CP.getAmount());
	CP.addTo(c);
	System.out.println("The purse currently has " + CP.getAmount());
	CP.removeFrom(c2);
	System.out.println("The purse currently has " + CP.getAmount());
    }

}
