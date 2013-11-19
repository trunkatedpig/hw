import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[ ] args) { 
	Coin c,c2 ;

	c = new Coin();
<<<<<<< HEAD
	c.flips = 42;
	System.out.println("Coin 1's flipped " + c.flips + " times.");
	c.resetCounter();
	System.out.println("Coin 1 stat'ss reset; now at " + c.flips + " flips.");
	c.face = "heads";
	System.out.println("Coin 1's orientation is " + c.face);

	c2 = new Coin ();
	c2.face = "tails";
	System.out.println("Coin 2's orientation is " +c2.face);

=======
	//Flip as many times as you wish
	
	System.out.println(c.getHeads() + " + " + c.getTails() + " = " + c.getFlips());	


	c2 = new Coin ();
        
        //
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }
}
