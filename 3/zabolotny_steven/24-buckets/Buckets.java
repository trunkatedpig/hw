import java.util.*;
import java.io.*;

public class Buckets {
    private int[] a;

    public Buckets(int size,int digits) {
	a = new int[size];
	for (int i = 0;i < a.length;i++) {
	    int num = (int)(Math.random() * Math.pow(10,digits + 1) + Math.pow(10,digits));
	    if (num > Math.pow(10,digits + 1)) 
		num = (int)(num - Math.pow(10,digits));
	    a[i] = num;
	}
    }

    public void rsort() {
	int digits = 0;
	//Find the amount of digits in the largest number
	for (int c = 0;c < a.length;c++) {
	    while (a[c] >= Math.pow(10,digits)) {
		digits = digits + 1;
	    }
	}
	//Make a buckets ArrayList for each digit
	for (int n = 0;n < digits;n++) {
	    ArrayList[] buckets = new ArrayList[10];
	    //Makes an Array in each ArrayList or digit
	    for (int i = 0;i < 10;i++) {
		buckets[i] = new ArrayList();
	    }
	    //Fills the array of each digit based off the inputted array
	    for (int h = 0;h < a.length;h++) {
		int digith = ((int)(a[h] / Math.pow(10,n)) % 10);
		buckets[digith].add(a[h]);
	    }
	//Resets the original array to be the buckets
	    int count = 0;
	    for (int j = 0;j < buckets.length;j++) {
		for (int k = 0;k < buckets[j].size();k++) {
		    a[count]=(Integer)buckets[j].get(k);
		    count = count + 1;
		}
	    }
	}
    }
    
    public int[] get() {
	return a;
    }

    public void set(int[] b) {
	a = b;
    }
}
	