import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        ArrayStuff as = new ArrayStuff();
        System.out.println(as);
        System.out.println(as.find(as.get(17)));
        System.out.println(as.find(-9));
        System.out.println(as.get(as.findMaxIndex())); 
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Homework Stuff:\n");
        System.out.println("Mean: ");
        System.out.println(as.mean(as.getArray()));
        System.out.println("Standard Deviation: ");
        System.out.println(as.stddev(as.getArray()));
    }

}
