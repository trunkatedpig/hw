import java.util.*;
import java.io.*;

public class SortN{

    private int[] rando;

    public SortN() {
    	rando = new int[15];
		for (int i = 0; i < rando.length; i++) {
	    	rando[i] =(int) (Math.random() * 1000000000);
		}
    }

	public SortN(int[] n) {
		this.rando = n;
	}
    
    public int[] radix(){
	int[] ta= new int[rando.length];
	ArrayList[] buckets = new ArrayList[10];
        int p = 0;
	int maxP =0; 
        //get num of max places
	for (int i = 0; i < rando.length; i++) {
	    if (String.valueOf(rando[i]).length() > maxP) {
		maxP = String.valueOf(rando[i]).length();
	    }
	}
	System.out.println(maxP);
	// while we still have places to sort
	while(p < maxP) {
	    // resets buckets
	    for (int i = 0; i <10; i++) {
		buckets[i] = new ArrayList<Integer>();
	    } 
	    // fills buckets
	    for (int i = 0; i < rando.length; i++){
		/*
		if(String.valueOf(rando[i]).length() > p) {
		    continue;
		}
		*/
		int remain = (int)(rando[i] / (Math.pow(10,p))) % 10;
		buckets[remain].add(rando[i]);
	    }
	    int num = 0;
	    // returns to array
	    for (int i = 0; i < buckets.length; i++) {
		for (int j = 0; j < buckets[i].size(); j++) {
		    rando[num] = (Integer)buckets[i].get(j);
		    num++;
		}
	    }
	    p++;

	}
	return rando;
    }
}

