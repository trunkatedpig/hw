import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String [] args) {
	Coin c;
        c = new Coin();
<<<<<<< HEAD
	System.out.println(c.getFace());	
=======
	c.flip();
	System.out.println("First flip:" + c.getFace());
	c.flip();
	System.out.println("Second flip:" + c.getFace());
	c.flip();
	System.out.println("Third flip:" + c.getFace());
	System.out.println("Total Amount of Flips" + c.getFlipcount());
>>>>>>> 609c97f791a335e0b897d843768c7ec2867145d3
    }
}
