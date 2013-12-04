import java.io.*;
import java.util.*;

public class ArrayStuff {
    private int[] a;
    private Random r;

    public static void main(String[] args)
    {
	ArrayStuff as = new ArrayStuff();
	System.out.println(as);
	System.out.println(as.find(as.get(18)));
	System.out.println(as.find(-30));
	System.out.println(as.get(as.findMaxIndex()));
	System.out.println(as.mean());
	System.out.println(as.stddev());
        
    }
	
    public ArrayStuff() {
	r = new Random();
	a = new int[20];
	for (int i=0;i<a.length;i++) 
	    a[i]=r.nextInt(100);
    }

    public String toString() {
	return Arrays.toString(a);
    }

    public int get(int n) {
	return a[n];
    }

    public int findMaxIndex() {
	int maxi = 0;
	for (int i =0 ; i < a.length;i++) {
	    if (a[i]>a[maxi]) 
		maxi = i;
	}
	return maxi;
    }

    public int find(int n) {
	for (int i=0;i<a.length;i++) {
	    if (a[i]==n)
		return i;
	}
	return -1;
    }

    public double mean()
    {
        int sum = 0;
	for(int i : a)
	{
	    sum += i;
	}
	return (double)sum / a.length;
    }

    public double stddev()
    {
	double m = mean();
	double sum = 0;
	for(int i = 0; i < a.length;i++)
	{
            sum += (a[i] - m) * (a[i] - m);
	}

	return Math.sqrt(sum / a.length);
    }

}
