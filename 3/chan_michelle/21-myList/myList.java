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

    public ArrayStuff(int s) {
        r = new Random();
        a = new int[s];
        for (int i=0;i<a.length;i++)
            a[i]=r.nextInt(100);
    }
    public ArrayStuff(int s, int max) {
        r = new Random();
        a = new int[s];
        for (int i=0;i<a.length;i++)
            a[i]=r.nextInt(max);
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

    public double mean(){
	double sum = 0;
	for (int i=0; i<a.length; i++){
	    sum = sum + a[i];
	}
	return sum/a.length;
    }

    public double stddev(){
	//standard dev = sqrt of average of squared differences of the values
	//from their average value
	double avg = mean();
	double sum = 0;
	double newavg = 0;
	for (int i = 0; i<a.length; i++){
	    sum = sum + ((a[i] - avg)*(a[i] - avg));
	}
	newavg = sum/a.length;
	double ans = Math.sqrt(newavg);
	return ans;

    }
    public int freq(int n) {
        int count = 0;
        for (int i=0;i<a.length;i++) {
            if (a[i]==n) {
                count=count+1;
            }
        }
        return count;
    }

    public void mode() {
        int maxFreq = 0;
        int maxIndex = 0;
        for (int i=0;i<a.length;i++) {
            if (freq(a[i]) > maxFreq) {
                maxFreq=freq(a[i]);
                maxIndex=i;
            }
        }
        System.out.println("Mode: "+a[maxIndex]+" count: "+maxFreq);

    }

    public void remove(int pos){
	int[] array = new int[a.length-1];
	for (int i = 0; i<pos; i++)
	    array[i] = a[i];
	for (int n=pos; i<a.length; i++)
	    array[i-1] = a[i];
	a = array;
    }

    public void insert(int[] a, int pos, int d){
	int[] array = new int[a.length +1];
	for (int i=0; i<pos; i++){
	    array[i] = a[i];
	}
	array[pos] = d;
	for (int i = pos+1; i < a.length; i++){
	    array[i+1] = a[i];
	}
	a = array;
    }
}	
