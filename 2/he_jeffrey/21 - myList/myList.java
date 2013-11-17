import java.io.*;
import java.util.*;

public class myList {
	private int[] data;
	private int numItems;
	
	public myList() {
		data = new int[5];
		numItems=0;
	}

	public void add(int d) {
		
		if (numItems>=data.length) {
			System.out.println("Growing from "+data.length+" to "+data.length*1.5);
			// "grow" the array by creating a new one and copying over
			int[] tmpArray = new int[data.length+data.length/2];
			for (int i=0;i<data.length;i++) 
			tmpArray[i]=data[i];
			data = tmpArray;
		}
		data[numItems]=d;
		numItems = numItems + 1;
	}
	
	public void insert(int pos, int d) {
		int[] ret = new int[data.length + 1];
		for (int i = 0; i < numItems + 1; i++) {
			if (i < pos) {
				ret[i] = data[i];
			} else if (i > pos){
				System.out.println(i);
				ret[i] = data[i-1];
			} else{
				ret[pos] = d;
			}
		}
		numItems++;
		data = ret;

	}
	public String toString() {
		String s = Arrays.toString(data)+" : "+numItems;
		return s;
	}
	
}
