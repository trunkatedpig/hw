import java.util.*;
import java.io.*;
import java.math.*;



public class ArrayStuff{
    private int[] a;
    private Random r = new Random();
    public ArrayStuff() {
        a=new int[20];
        for (int i=0;i<a.length;i++) {
            a[i]=r.nextInt(100);
        }
    }


    public String toString() {
	return Arrays.toString(a);
    }


    // return the index of the max element
    public int findMaxIndex() {
        if (a==null || a.length==0) 
            return -1;


	int maxi = 0;
        for (int i=0;i<a.length;i++) {
            if (a[i] > a[maxi])
                maxi = i;
        }
        return maxi;
    }


    public int get(int n) {
        if (n>=0 && n < a.length) 
            return a[n];
        else
            return -1;
    }
    public int find(int n) {
        for (int i=0;i<a.length;i++) {
            if (a[i]==n)
                return i;
        }
        return -1;
    }

    public double mean(){
        int sum  = 0;
	double avg = 0;
	int le = a.length;
        for(int b=0;b<le;b++){
            sum = sum + a[b];
        }
        avg = sum / le;
	return avg;
    }


    public double stddev(){
        double avg = this.mean();
        double sq = 0;
	int le = a.length;
	double sumsq = 0;
	double mean1 = 0;
        for(int b=0;b<le;b++){
            sq = Math.pow((a[b]-avg), 2);
	    sumsq = sumsq + sq;
        }
        mean1 = sumsq/le;
        return Math.sqrt(mean1);

    }

}
