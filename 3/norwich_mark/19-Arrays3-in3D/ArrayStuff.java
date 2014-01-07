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
	int x = 0; 
	int len = a.length; 
	for (int i = 0; i < len; i++){
	    x = x + a[i]; 
	} 
	return x / len; 
    } 
     
    public double stddev(){
	int x = mean(a);
	int[] second  = new int[a.length]; 
	for (int i = 0; i < a.length; i++){ 
	    second[i] = Math.pow(a[i] - x, 2);} 
	int y = mean(second); 
	int z = Math.pow(y, 0.5); 
	return z; 
    }
	    



    
}
