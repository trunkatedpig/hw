import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	ArrayStuff as = new ArrayStuff();
	double[] a = {1.0,2.0,3.0};
	System.out.println(Arrays.toString(a));
	System.out.println(as.mean(a));
	System.out.println(as.stddev(a));
	
    }
}
