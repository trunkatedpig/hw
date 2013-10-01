import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]){
	Coin c;
	c = new Coin();
	c.setFace("Heads");
	System.out.println("The current face is: " + c.getFace());
	c.flipHeads();
	c.flipHeads();
	c.flipHeads();
	c.flipTails();
	c.flipTails();
	System.out.println(c.getFlips());
	c.reset();
	System.out.println(c.getFlips());
    
    }

}
