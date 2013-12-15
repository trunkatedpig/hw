import java.io.*;
import java.util.*;

public class Coindriver2 {
    public static void main (String[] args) {
	Coin2 c;
	c = new Coin2();
	Coinpurse p;
	p = new Coinpurse();

	/*
	System.out.println(c.Reset());
	System.out.println(c.setFace("tails"));
	System.out.println(c.getFace());
	*/

	System.out.println(c.getName());
	System.out.println(c.getValue());
	System.out.println(p.addTo(c));
	p.removeFrom(c);
	System.out.println(p.getAmount());
    }
}
