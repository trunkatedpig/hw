import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	/*	Coin head1 = new Coin();
	String s = new String("Tails");
	Coin tail1 = new Coin(s);
	s = new String ("Heads");
	Coin head2 = new Coin (s);*/
	Coin c1 = new Coin();
	Coin c2= new Coin();
	    


	c1.Coin("nickel");
	System.out.println("Coin c1: "+ c1.getValue());
	c2.Coin(00.01);
	System.out.println("Coin c2:" +c2.getName());
    }
}
