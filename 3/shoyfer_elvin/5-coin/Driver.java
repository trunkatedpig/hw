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
		System.out.println(c.getFairness());
		c.setFlips(5);
		c.setHeads(3);
		c.setFairness(0.25);
		c.setFace("tails");
		System.out.println("\n- After Changes -\n");
		System.out.println(c.getFace());
		System.out.println(c.getFlips());
		System.out.println(c.getHeads());
		System.out.println(c.getTails());
		System.out.println(c.getFairness());
    }
}
