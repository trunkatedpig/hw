import java.io.*;
import java.util.*;

public class Arrays3 {
    private int[] a;
    private Random r;
    private double mean;

    public Arrays3() {
        r = new Random();
        a = new int[20];
        for (int i=0;i<a.length;i++) 
            a[i]=r.nextInt(100);
    }

    public String toString() {
        return Arrays.toString(a);
    }

    public double mean() {
	int sum = 0;
	int count = 0;
	for ( int i = 0 ; i < a.length ; i++ ) {
	    sum = sum + a [ i ];
	    count = count + 1;
	}
	this.mean = (double )sum / count;
	return mean;
    }

    public double stddev() {
	double sum = 0;
	int count = 0;
	for ( int i = 0 ; i < a.length ; i++ ) {
	    sum = sum + Math.pow ( a [ i ] - mean , 2 );
	    count = count + 1;
	}
	return Math.sqrt ( sum / count );
    }
}
