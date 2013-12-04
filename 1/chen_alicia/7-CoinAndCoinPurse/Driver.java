import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	/*	Coin head1 = new Coin();
		String s = new String("Tails");
		Coin tail1 = new Coin(s);
		s = new String ("Heads");
		Coin head2 = new Coin (s);*/

	Coin c1 = new Coin("nickel");
	Coin c2 = new Coin(00.01);
	System.out.println("Coin c1: " + c1.getName() + ", " +  c1.getValue());
	System.out.println("Coin c2: " + c2.getName() + ", " + c2.getValue());
	
	CoinPurse Purse1 = new CoinPurse();
	Purse1.addTo(c1);
	System.out.println(Purse1.getAmount());
	Purse1.addTo(c2);
	System.out.println(Purse1.getAmount());
	Purse1.removeFrom(c1);
	System.out.println(Purse1.getAmount());
			   
    }
}
