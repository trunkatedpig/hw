import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
       	Coin c, c1;
	c = new Coin();
	c.flip();
	c1 = new Coin (.35);
	c1.flip();
	System.out.println(c.getFace());
	c1.flip();
	System.out.println(c1.getFace());
	c1.flip();
	System.out.println(c1.getFace());
	System.out.println(c1.getFace());
    }
}
