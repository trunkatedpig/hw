import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String args[]) {
    	Coin c = new Coin();
    	System.out.println(c.getFace());
	c.flip();
	System.out.println(c.getFace());
	System.out.println(c.getCount());
	c.resetCounts();
	System.out.println(c.getCount());
    }
}