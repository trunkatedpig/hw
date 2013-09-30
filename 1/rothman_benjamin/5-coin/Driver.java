import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {

	Coin c;

	c = new Coin ();
        c.setCount();

	   

	System.out.println (c.getFlipNumber () );	    
	System.out.println (c.getHeadNumber() );
	System.out.println (c.getTailNumber() );
	System.out.println (c.getHeadChance() );




	System.out.println ("-------------------");



	/* Now to test resetCount */

	c.resetCount();
	System.out.println (c.getFlipNumber () );	    
	System.out.println (c.getHeadNumber() );
	System.out.println (c.getTailNumber() );
	System.out.println (c.getHeadChance() );

	    
	    }
}
