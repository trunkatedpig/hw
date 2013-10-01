import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	//Coin class tests 
	Coin one;
	one = new Coin();
	System.out.println("Before resetting flips");
	System.out.println(one.getFlips());
	one.resetCount();
	System.out.println("After resetting flips");
	System.out.println(one.getFlips());
	System.out.println("Displaying face");
	System.out.println(one.getFace());
    }
}    
