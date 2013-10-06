import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {

	Coin c = new Coin ("quarter", .35);

	c.flip();
	

	System.out.println (c.getFace);

	    }
}
