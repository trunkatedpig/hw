import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin c;
	c = new Coin();
	System.out.println(c.getFace());
	System.out.println(c.getFlips());
	System.out.println(c.getHeads());
	System.out.println(c.getTails());
	System.out.println(c.getProb());
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	System.out.println(c.getFace());
	System.out.println(c.getFlips());
	System.out.println(c.getHeads());
	System.out.println(c.getTails());
	System.out.println(c.getProb());
	c.reset();
       	System.out.println(c.getFace());
	System.out.println(c.getFlips());
	System.out.println(c.getHeads());
	System.out.println(c.getTails());
	System.out.println(c.getProb());
	c.changeProb(.25);
       	c.flip();
	c.flip();
	c.flip();
	c.flip();
	c.flip();
	c.flip();
       	System.out.println(c.getFace());
	System.out.println(c.getFlips());
	System.out.println(c.getHeads());
	System.out.println(c.getTails());
	System.out.println(c.getProb());
    }
}
