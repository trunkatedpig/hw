import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin c = new Coin();
	c.flip();
	System.out.println (c.getFace());
	System.out.println ("# OF HEADS:" + " " + c.getHeads());
	System.out.println ("# OF TAILS:" + " " + c.getTails());
	//c.reset();
	//System.out.println(c.getFace());
    }
}

