import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	/* ArrayStuff a = new ArrayStuff();
        System.out.println(a.mean());
        System.out.println(a.stddev());
	*/
	
	ArrayStuff as = new ArrayStuff(100000,20);

        long start = System.currentTimeMillis();
        as.mode();
        long t = System.currentTimeMillis()-start;

        System.out.println("Time: "+t);
    }
}
