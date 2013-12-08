import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){ 
	Coin Penny;
     	Penny = new Coin("Penny",.01);
	Penny.Flip();
        System.out.println("Face: "+Penny.getFace()); 
	System.out.print("Flips: ");
	System.out.println(Penny.getFlips());
	System.out.print("Fairness: ");
	System.out.println(Penny.getFairness());
	
	CoinPurse Purse;
	Purse = new CoinPurse();
	Purse.addTo(Penny);
	System.out.print("Total money in purse: ");
	System.out.print(Purse.getAmount());

 }
}
