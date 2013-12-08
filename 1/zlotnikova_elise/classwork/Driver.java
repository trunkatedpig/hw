import java.io.*;
import java.util.*;

public class Driver {
    //private int flips;
    public static void main(String[] args){ 
	Coin Penny;
     	Penny = new Coin();
	//Penny.reset();
	Penny.Flip();
	//flips = flips + 1;
        System.out.println("Face: "+Penny.getFace()); 
	System.out.print("Flips: ");
	System.out.print(flips);
	//System.out.println(Penny.getFlips());
	System.out.println(Penny.getFairness());

	/*Coin Nickel;
	Nickel = new Coin();
	Nickel.Flip();
	System.out.println("Face: "+Nickel.getFace()); 
	System.out.print("Flips: ");
	System.out.println(Nickel.getFlips()); */
    }
}
