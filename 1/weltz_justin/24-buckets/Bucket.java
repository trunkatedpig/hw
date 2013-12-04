import java.util.*;
import java.io.*;
public class Bucket{
    private int len = 1000000;
    private long[] buckets = new long[len];
    public Bucket() {
	Random r = new Random();
	for (int i = 0; i < len; i ++){
	    buckets[i] = (long)r.nextInt(900000000) + 100000000;//can't randomly generate anythong bigger
	}
    }
    public void sort(){
	ArrayList[] water = new ArrayList[len];
	for (int n = 0; n < 9; n++){
	    for (int i = 0; i < len; i++)
		water[i] = new ArrayList();
	    for (int i = 0; i < buckets.length; i++){
		water[(int)(buckets[i] / Math.pow(10, n))% 10].add(buckets[i]);
	    }
	    int m = 0;
	    for (int z = 0; z < water.length; z++){
		if (water[z].size() != 0){
		    for (int i = 0; i < water[z].size(); i++){
			buckets[m] = (Long)water[z].get(i);
			m = m + 1;
		    }
		}
	    }
	}
    }
    
    public String toString(){
	return Arrays.toString(buckets);
    }

    public long[] get(){
	return buckets;
    }
}
		
		    

	
	
	    
