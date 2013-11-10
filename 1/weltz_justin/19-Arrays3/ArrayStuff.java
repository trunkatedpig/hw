import java.util.*;
import java.io.*;

public class ArrayStuff{
    private int[] a;
    private Random r = new Random();
    public ArrayStuff() {
	//just try this to see if it works
	/*a = new int[5];
	for (int i = 0; i < a.length ; i++)
	    a[i] = i + 1;*/
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
	double sum = 0;
	double answer;
	for (int i = 0; i<a.length; i++)
	    sum = sum + a[i];
	answer = sum / a.length;
	return answer;
    }
    public double stddev(){
	double mean = mean();
	double sum = 0;
	double answer;
	for (int i = 0; i < a.length; i++)
	    sum = sum + Math.pow((a[i] - mean), 2);
	answer = Math.sqrt(sum / a.length);
	return answer;
    }
}


