import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {

	/*Testing Coin */
	System.out.println ("\n" + "TESTING OUT GET METHODS IN COIN" + "\n");
	Coin c = new Coin ("Quarter", .25);


	    System.out.println ("Face is" + " " +  c.getFace());
	    System.out.println ("Value is" + " " + c.getValue() );
	    System.out.println ("Name is" + " " + c.getName () );
	    System.out.println ("Flips are" + " " + c.getFlips() );
	     System.out.println ("Probability of Heads is" + " " + c.getProb () );


	    /* Testing Flip */

	    Coin c2 = new Coin ("Dime", .10);

	    System.out.println ("\n" + "\n");
	    System.out.println ("Testing Flips" + "\n");
	    System.out.println ("Before Flip");


	    System.out.println ("Face is" + " " + c2.getFace());
	    System.out.println ("Value is" + " " +  c2.getValue() );
	    System.out.println ("Name is" + " " +  c2.getName () );
	    System.out.println ("Flips are" + " " + c2.getFlips() );
	    System.out.println ("Probability of Heads is" + " " + c2.getProb () );

	    

	    System.out.println ("After Flip");

		c2.flip();

	        System.out.println ("Face is" + " " +  c2.getFace());
	    System.out.println ("Value is" + " " +  c2.getValue() );
	    System.out.println ("Name is" + " " +  c2.getName () );
	    System.out.println ("Flips are" + " " + c2.getFlips() );
	     System.out.println ("Probability of Heads is" + " " + c2.getProb () );





	    /* Now Testing Coin Purse */

	    CoinPurse p = new CoinPurse (.5);

	    System.out.println ("\n" + "\n" + "NOW TESTING COIN PURSE" + "\n" );
	    System.out.println ("Coin c");
	    System.out.println (c.getValue () );
	    System.out.println (c.getName () );
	    System.out.println ("\n" + "Coin c2" + "\n");
	    System.out.println (c2.getValue () );
	    System.out.println (c2.getName () );

	    System.out.println ("\n" + "Starting Money in Coin Purse" + "\n");
	    System.out.println (p.getAmount() );
	    System.out.println ("\n" + "Adding Coin 1" + "\n");

	    p.addTo(c);
	    System.out.println (p.getAmount() );

	    System.out.println ("\n" + "Now I shall take away a dime" + "\n");

	    p.removeFrom(c2);
	    System.out.println (p.getAmount () );

    }

}






