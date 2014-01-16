import java.util.*;
import java.io.*;
import java.math.*;

public class Bubblez{

    public static void main (String[] args){
	Bubblez b = new Bubblez();
	System.out.println("she is the joy and the laughter");
	double[] test = new double[100];
	for (int i=0;i<100;i++) {
	    test[i]=Math.random();
	}
	System.out.println(Arrays.toString(b.bsort(test)));
    }
    
    public double[] bsort(double[] a){
	int loops = a.length-1;
	boolean isOrdered = false;
	while (!isOrdered) {
	    isOrdered = true;
	    for (int i=0;i<loops;i++) {
		if (a[i] < a[i+1]) {
		    isOrdered = false;
		    double temp = a[i+1];
		    a[i+1] = a[i];
		    a[i] = temp;
		}
	    }
	}
	return a;
    } 
}