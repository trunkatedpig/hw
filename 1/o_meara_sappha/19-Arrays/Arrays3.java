import java.util.*;
import java.io.*;

public class Arrays3{
    private int[] a;
    private Random r = new Random();
    
    public Arrays3() {
        a = new int[20];
        for (int i = 0; i < a.length; i ++) {
            a[i] = r.nextInt(100);
        }
    }
    
    public String toString() {
        return a.toString();
    }

    // return the index of the max element
    public int findMaxIndex() {
        if (a == null || a.length == 0) 
            return -1;
            int maxi = 0;
        for (int i = 0; i < a.length; i ++) {
            if (a[i] > a[maxi])
                maxi = i;
        }
        return maxi;
    }

    public int get(int n) {
        if (n >= 0 && n < a.length) 
            return a[n];
        else
            return -1;
    }

    public int find(int n) {
        for (int i = 0; i < a.length; i ++) {
            if (a[i] == n)
                return i;
        }
        return -1;
    }

    public double mean() {
	double sum = 0;
	for (int i = 0; i < a.length; i ++) {
	    sum = sum + a[i];
	}
	return sum / a.length;
    }
    
    public double stddev() {
	double avg = mean();
	double sumOfDiffs = 0;
	for (int i = 0; i < a.length; i ++) {
	    sumOfDiffs = sumOfDiffs+a[i]-avg;
	}
	return Math.sqrt(sumOfDiffs / a.length);
    }

}
