import java.io.*;
import java.util.*;

public class Arraystuff {
    private int[] a;
    private double[] b;
    private double j = 0.0;
    private Random r;

    public Arraystuff() {
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

    public double mean(){
	for (int i = 0;i < a.length; i++){
	    j = j + a[i];
	}
	j = j / a.length;
	return j;
    }

    public double mean(double[] array){
	for (int i = 0;i < array.length; i++){
	    j = j + array[i];
	}
	j = j / array.length;
	return j;
    }
    

    public double stddev() {
	b = new double[a.length];
	double k = 0;
	for (int i = 0; i < a.length; i++){
	    k = a[i];
	    k = (k - j);
	    k = k*k;	
	    System.out.print(k +"  ");
	    b[i] = k;
	}
        System.out.print("\n");
        mean(b);
	System.out.println(mean(b));
	k = Math.sqrt(j);
	return k;
    }
}
