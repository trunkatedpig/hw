import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	ArrayStuff as = new ArrayStuff();
	System.out.println(as);
	System.out.println("a[9]: "+as.get(9));
	System.out.println(as.get(18)+" index: "+as.find(as.get(18)));
	System.out.println("maxindex: "+as.findMaxIndex());
	System.out.println("sum: "+as.sum());
	System.out.println("mean: "+as.mean());
	System.out.println("stddev: "+as.stddev());
    }
}
