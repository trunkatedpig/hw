import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String[] args) {
	Coin c;
	c = new Coin();

	//c.resetCount();
	c.setFace();
	c.setFairness(.5);
	System.out.println(c.getFaces());
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	System.out.println(c.getFlips());
	System.out.println(c.getFaces());
    }

}
