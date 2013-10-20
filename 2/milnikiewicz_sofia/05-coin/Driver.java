import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Coin c;
	c = new Coin();
	System.out.println("This coin's face is " + c.getFace());
	c.reset();
	System.out.println("This coin's face is " + c.getFace());
    }
}