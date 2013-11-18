import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        ArrayStuff as = new ArrayStuff();
        System.out.println(as);
        System.out.println(as.find(as.get(18)));
        System.out.println(as.find(-30));
        System.out.println(as.get(as.findMaxIndex()));
	System.out.println(as.mean());
	System.out.println(as.stddev());

   }
}
