import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	//Coin class tests 
	Coin one;
	one = new Coin();
	System.out.println("Before resetting flips");
	System.out.println(one.getFlips());
	one.resetFlips();
	System.out.println("After resetting flips");
	System.out.println(one.getFlips());
	System.out.println("Displaying face");
	System.out.println(one.getFace() + "/n");
	
	//Testing flips
	
	Coin two;
	two = new Coin();
	System.out.println(two.getFace());
	two.resetFlips();
	two.flip();
	System.out.println(two.getFace());
	System.out.println(two.getFlips());
    }
}    
