import java.io.*;
import java.util.*;

public class Driver {
     public static void main (String[] args) {
	 
	 Coin c;
	 c = new Coin ();
	 
	 c.flip ();
	 
	 if (c.getFace() == "heads") {
	     System.out.println("Coin is Heads"); }

	 else {
	     System.out.println("Coin is Tails"); }
     }
}

//Used Andrew Fischer's file for help