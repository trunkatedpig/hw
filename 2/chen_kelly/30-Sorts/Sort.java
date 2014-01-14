import java.io.*;
import java.util.*;
 
public class Sort{      
    private int[] a = new int[10000];
    private int[] aa;
    private int[] b = new int[10];
    private int[] bb;
    private int totCompare;
    private int totSwaps;
   
    public Sort(){
	//fills int array a  with random ints
	Random r = new Random();
	for(int n = 0; n < a.length; n++){
	    a[n] = r.nextInt(999);
	}
	aa = a;
   
	for(int n = 0; n < b.length; n++){
	    b[n] = r.nextInt(999);
	}
	bb = b;
    }
 
    public int[] getB(){
	return b;
    }
     
    public int[] getBb(){
	return bb;
    }
 
    public int[] getA(){
	return a;
    }
     
    public int[] getAa(){
	return aa;
    }
 
    public int[] radix(int[] c){
	int[] tempc = c;
	ArrayList[] buckets = new ArrayList[10];
	for (int m = 0; m < 10; m++){
	    buckets[m] = new ArrayList();
	}
	for(int k = 0; k<=2 ; k++){ 
	    for(int i = 0; i < tempc.length; i++){
		int val = (int)((tempc[i] / Math.pow(10,k)) % 10);
		buckets[val].add(c[i]);
      
		int j = 0;
		for (int z = 0; z < 10; z++){
		    for(int count = 0;count < buckets[z].size(); count++){
			c[j] = (Integer)(buckets[z].get(count));
			j++;
		    }
		}
	    }
	    for(int m = 0; m<10; m++)
		buckets[m] = new ArrayList();
	}
	return tempc;
        
    }
 
    public int[] bsort(int[] d){
	int[] tempd = d;
	totCompare = 0;
	totSwaps = 0;
	int swaps;
	for (int i = 0; i < tempd.length - 1; i++){
	    swaps = 0;
	    for (int j = 0; j < tempd.length - 1; j++){
		if (d[j] > d[j + 1]){
		    int temp = tempd[j + 1];
		    tempd[j + 1] = tempd[j];
		    tempd[j] = temp;
		    totSwaps++;
		    swaps++;
		}
		totCompare++;
	    }
	    if (swaps == 0)
		break;
	}
	return tempd;
    }
 
    public int getCompare(){
	return totCompare;
    }
 
    public int getSwaps(){
	return totSwaps;
    }
}
