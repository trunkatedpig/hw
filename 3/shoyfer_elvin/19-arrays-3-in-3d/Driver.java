import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        ArrayStuff a1 = new ArrayStuff();
    	System.out.println("Base array (randomly generated):\n");
    	System.out.println(a1);
    	System.out.println("\nMean:\n");
    	System.out.println(a1.mean());
    	System.out.println("\nStandard Deviation:\n");
    	System.out.println(a1.stddev());
    	System.out.println("");
	}
}
