import java.io.*;
import java.util.*;

public class Coindriver {
    public static void main (String[] args) {
	Coin c;
	c = new Coin();
	System.out.println(c.Reset());
	System.out.println(c.setFace("tails"));
	System.out.println(c.getFace());
    }
}
