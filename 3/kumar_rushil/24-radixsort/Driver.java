import java.io.*;
import java.util.*;
public class Driver{
    public static void main (String[] args){
	long start, t;
	RadixSort rs = new RadixSort();
	Random r = new Random();
	int [] a = new int [1000];
	for (int i = 0; i < a.length; i ++){
	    a[i]=r.nextInt(100000000);
	}
	System.out.println("This is the data:\n" + Arrays.toString(a));
	//RadixSort
	start = System.currentTimeMillis();
	String s = Arrays.toString(rs.Sort(a,12));
	System.out.println("\nData organized(RadixSort):\n" + s);
	t = System.currentTimeMillis() - start;
	System.out.println("Time:" + t);

	//JavaSort
	start = System.currentTimeMillis();
	Arrays.sort(a);
	System.out.println("\nData organized(JavaSort):\n" + Arrays.toString(a));
	t = System.currentTimeMillis() - start;
	System.out.println("Time:" + t);
    }
}
