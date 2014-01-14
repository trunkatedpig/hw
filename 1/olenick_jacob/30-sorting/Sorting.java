import java.io.*;
import java.util.*;

public class Sorting {

    public int[] bubbleSort(int[] i){
	int swaps = 0;
	int checks = 0;

	for(int a=0; a<i.length-1; a++){
	    for(int b = 0; b<i.length-a-1; b++){
		if (i[b] > i[b+1]){
		    int tmp = i[b];
		    i[b] = i[b+1];
		    i[b+1] = tmp;
		    swaps++;
		}
		checks++;
	    }
	}
	System.out.println(swaps);
	System.out.println(checks);
	return i;
	
    }


    public static int exp(int i, int n){//lolwut
	int result = 1;
	for (int a = 0; a<n; a++){
	    result = result * i;
	}
	return result;
    }
    public int[] radixSort(int[] i){
	int n;
	int length = String.valueOf(i[0]).length();
	ArrayList[] buckets = new ArrayList[i.length];
	for (int a=0; a<i.length; a++){
	    buckets[a] = new ArrayList<Integer>();
	}
	for(n=0; n<length; n++){
	    for (int a=0; a<i.length; a++){
		int d = (i[a] / exp(10,n)) % 10;
		buckets[d].add(i[a]);
	    }
	    int c=0;
	    for (int a=0; a<buckets.length; a++){
		int b=0;
		while (b < buckets[a].size()){
		    i[c]=(Integer)buckets[a].get(b);
		    b++;
		    c++;
		}
	    }
	    for (int a=0; a<i.length; a++){
		buckets[a] = new ArrayList<Integer>();
	    }
	}
	return i;
    }

    public static void main(String[] args){
	
	int[] a = {2,6,5,7,8,9,4,2,54,6,7,10};
	Sorting dumb = new Sorting();
	System.out.println(Arrays.toString(dumb.bubbleSort(a)));
    }
}

