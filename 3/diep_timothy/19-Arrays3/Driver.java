import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Array as = new Array();
	System.out.println(as);
	System.out.println(as.find(as.get(18)));
	System.out.println(as.find(-5));
	System.out.println("Max number: " + as.get(as.findMaxIndex())); 
	System.out.println();
	System.out.println("Average: " + as.mean());
	System.out.println();
	System.out.println("Standard Deviation: " + as.stddev());
    }

}
