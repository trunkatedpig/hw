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
    public double mean(){
	double ans = 0;
	int i;
	int len = a.length;
	for (i=0;i<len;i++){
	    ans = ans + (double)a[i];
	}
	return ans/(double)len;
    }
    public void insert(int pos, int d){
	int len = a.length;
	int[] finalArray = new int[len + 1];
	for (int i = 0; i < finalArray.length;i++){
	    if (i<d){
		finalArray[i]=a[i];
	    }
	    if (i==d){
		finalArray[i]=d;
	    }
	    else {
		finalArray[i]=a[i-1];
	    }
	}
	System.out.println("Inserted Array: " + finalArray);
    }
}
