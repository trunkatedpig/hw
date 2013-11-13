import java.util.*;
import java.io.*;

public class ArrayStuff{
    private int[] a;
    private Random r = new Random();
    public ArrayStuff() {
        a=new int[20];
                 for (int i=0;i<a.length;i++) {
                 a[i]=r.nextInt(100);
             }
     }
    
     public ArrayStuff(int s) {
             a=new int[s];
             for (int i=0;i<a.length;i++) {
                 a[i]=r.nextInt(100);
             }
     }
    public ArrayStuff(int s,int max) {
        a=new int[s];
        for (int i=0;i<a.length;i++) {
            a[i]=r.nextInt(max);
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

    public int freq(int n) {
        int appearances = 0;
        for (int i=0;i<a.length;i++){
            if (a[i]==n)
                appearances = appearances + 1;
        }
        return appearances;
    }

    public void mode() {
        int maxIndex = 0;
        int maxFreq=freq(a[0]);
        for (int i=0;i<a.length;i++){
            if (freq(a[i])>maxFreq) {
                maxFreq=freq(a[i]);
                maxIndex = i;
            }
        }
        System.out.println("Mode: "+a[maxIndex]+" Count: "+maxFreq);
    }
        

    public double mean(){
	int sum = 0;
	for (int i = 0; i < a.length; i ++){
	    sum = sum + a[i];
	}
	return (sum / (a.length * 1.0));
    }

    public double stddev(){
	double average = mean();
	double sum = 0.0;
	for (int i = 0; i < a.length; i ++){
	    sum = sum + ((a[i] - average)*(a[i] - average));
	}
	return Math.sqrt((sum / (a.length * 1.0)));
    }
}

