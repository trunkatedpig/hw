import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){ 
	Coin Penny;
	Penny = new Coin();
	Penny.reset();
        System.out.print("Face: "+Penny.getFace()); /*Should be null*/
    }
}
