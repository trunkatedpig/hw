import java.io.*;
import java.util.*;

public class Driver {
     public static void main (String[] args) {
	 
	 Coin c;
	 c = new Coin ();
	
	 c.setProb(.5);
	 c.flip();
	 System.out.println(c.getCurrentFace());
	 c.flip();
	 System.out.println(c.getCurrentFace());
	 c.flip();
	 System.out.println(c.getCurrentFace());
	 c.flip();
	 System.out.println(c.getCurrentFace());
	 c.flip();
	 System.out.println(c.getCurrentFace());
	 System.out.println(c.getFlips());
     }
}

//Used Andrew Fischer's file for help