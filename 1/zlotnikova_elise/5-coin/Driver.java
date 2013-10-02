import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){ 
	Coin Penny;
	Penny = new Coin();
	Penny.reset();
	Penny.Flip();
        System.out.print("Face: "+Penny.getFace()); 
	System.out.print("Flips: ");
	System.out.println(Penny.flips);
    }
}
