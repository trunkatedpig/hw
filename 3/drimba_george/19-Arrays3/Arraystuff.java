import java.io.*;
import java.util.*;

public class ArrayStuff {
    private int[] a;
    private Random r;
    
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
        for (int i=0;i<a.length;i++) {
            if (a[i]>a[maxi])
                maxi=i;
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

    public int[] getArray() {
        return a;
    }

    public double mean(int[] a) {
        double answer = 0;
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        answer = sum/a.length;
        return answer;
    }
    public double stddev() {
        double s = 0;
        double m = mean();
        for (int i = 0; i<a.length; i++){
            double x = (m-a[i]);
            s = s + Math.pow(x,2);
        }
        return Math.sqrt(s/a.length);
        
}
