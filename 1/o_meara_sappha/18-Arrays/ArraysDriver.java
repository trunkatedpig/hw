import java.io.*;
import java.util.*;

public class ArraysDriver {
    
    public static void main(String[] args) {
	Arrays a = new Arrays();

        int[] x = a.Revfill(7);
	int[] y = a.makeRandom(6, 2, 9);

	int[] b = {2, 1, 3, 5};
	int[] c = {2, 1, 2, 5};
	int [] d = {2, 4, 2, 5};
	
	int[] p = {13, 1, 2, 5, 13, 4, 13};
	
	for (int i = 0; i < x.length; i ++)
	    System.out.println(x[i]);

	System.out.println("---------------------------------------");

	for (int i = 0; i < y.length; i ++)
	    System.out.println(y[i]);

	System.out.println("---------------------------------------");

	System.out.println(a.sum13(p));
	System.out.println("should return 12");
	
	System.out.println("---------------------------------------");
	
	
	System.out.println(a.modThree(b));
	System.out.println("should return true");
	System.out.println(a.modThree(c));
	System.out.println("should return false");
	System.out.println(a.modThree(d));
	System.out.println("should return true");
    }
}
