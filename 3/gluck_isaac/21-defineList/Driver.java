import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	ArrayStuff as = new ArrayStuff(10,20);

	long start = System.currentTimeMillis();
	as.mode();
	long t = System.currentTimeMillis()-start;

	System.out.println("Time: "+t);
	System.out.println();

	System.out.println(as);
	as.remove(3);
	System.out.println(as);
    }

}
