import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin c = new Coin();
	c.setFace ("Heads");
	System.out.println (c.getFace());
	c.reset();
	System.out.println(c.getFace());
    }
}

