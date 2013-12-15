import java.io.*;
import java.util.*;
public class Driver2 {
    public static void main(String[] args) {
    Coin c;
    c = new Coin(0.10, "dime");


    System.out.println ("Amount is " + c.getAmount ());
    System.out.println ("Coin Name is " + c.getCoinname ());

    c.setAmount (0.01);
    System.out.println ("Amount is " + c.getAmount ());

    System.out.println ("Coin Name is " + c.getCoinname ());

    Coin l = new Coin ("dime");

    System.out.println ("Amount is " + l.getAmount ());
    System.out.println ("Coin Name is " + l.getCoinname ());

    Coin s = new Coin (0.10);

    System.out.println ("Amount is " + s.getAmount ());
    System.out.println ("Coin Name is " + s.getCoinname ());


    CoinPurse k = new CoinPurse (0.01);
    
    System.out.println ("Amount in purse is " + k.getAmount ());
    
    k.addTo (l);
    System.out.println ("Amount in purse is " + k.getAmount ());

    k.removeFromTo (l);
    System.out.println ("Amount in purse is " + k.getAmount ());
    /* for some reason the answer I expected was 0.01 but it printed 0.00999999999999999995 */


    /* most of the new stuff for hw 7 is above this */


    c.setFairness (50.0);
    c.coinFlip ();
   
    System.out.println ("Face is " + c.getFace ());
    System.out.println ("Number of Heads are " +  c.getHeads ());
    System.out.println ("Number of Tails are " + c.getTails ());
    System.out.println ("Number of Flips are " + c.getFlips ());

    c.setFairness (10.0);
    c.coinFlip ();
    System.out.println ("Face is " + c.getFace ());
    System.out.println ("Number of Heads are " +  c.getHeads ());
    System.out.println ("Number of Tails are " + c.getTails ());
    System.out.println ("Number of Flips are " + c.getFlips ());   

    c.setFairness (90.0);
    c.coinFlip ();
   
    System.out.println ("Face is " + c.getFace ());
    System.out.println ("Number of Heads are " +  c.getHeads ());
    System.out.println ("Number of Tails are " + c.getTails ());
    System.out.println ("Number of Flips are " + c.getFlips ());
    c.resetCount();
    c.setFairness (50.0);
    c.FlipxTimes (200);
   
    System.out.println ("Face is " + c.getFace ());
    System.out.println ("Number of Heads are " +  c.getHeads ());
    System.out.println ("Number of Tails are " + c.getTails ());
    System.out.println ("Number of Flips are " + c.getFlips ());
    }
}
