import java.util.*;
import java.io.*;
import java.lang.Math;

// Creds to Maria for explaining a good amount of this to us
// Group: Deanna and Coby

public class Buckets{

    private int DeannasEw = 100000;
    private int[] buckets = new int[DeannasEw];

    public Buckets(){
	Random r = new Random();
	for (int i = 0; i < DeannasEw; i++){

	    buckets[i] = r.nextInt(9000) + 1000;

	}
    }

    public void sort(){

	ArrayList[] buckeroo = new ArrayList[DeannasEw];
	for (int w = 0; w < 4; w++){
	    for (int s = 0; s < DeannasEw; s++){
		buckeroo[s] = new ArrayList();
	    }

	    for (int x = 0; x < buckets.length; x++){
		buckeroo[(buckets[x] / (int)Math.pow(10, w)) % 10].add(buckets[x]);
	    }
	    int m = 0;
	    for (int z = 0; z < buckeroo.length; z++){
		if (buckeroo[z].size() != 0){
		    for (int v = 0; v < buckeroo[z].size(); v++){
			buckets[m] = (Integer)buckeroo[z].get(v);
			m++;
		    }
		}
	    }

	   
	}

    }

    public String toString(){
	return Arrays.toString(buckets);
    }

    public int[] get(){
	return buckets;
    }

}
