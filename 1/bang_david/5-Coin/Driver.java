import java.io.*;
import java.util.*;

public class Driver2 {
    public static void main(String[] args) {
    Coin c;
    c = new Coin();
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
