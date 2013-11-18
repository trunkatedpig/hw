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

    public void remove(int pos) {
		int[] temp = new int[a.length-1];
		for (int i=0;i < pos; i++)
			temp[i] = a[i];
		for (int n=pos+1; n<a.length;n++)
			temp[n-1] = a[n];
		a = temp;
    }
}
