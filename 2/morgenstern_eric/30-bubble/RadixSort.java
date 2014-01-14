import java.io.*;
import java.util.*;

public class RadixSort {
    public static void main ( String[] args ) {
	Random r = new Random();
	ArrayList[] buckets = new ArrayList [ 10 ];
	int[] randstuff=new int[10000];
	for (int i = 0;i<randstuff.length;i++)
	    randstuff[i]=r.nextInt(89999)+10000;
	int digits = 5;
	long start = System.currentTimeMillis();
	for(int i = 0;i<digits;i++){
	    for ( int l = 0 ; l < 10 ; l++ )
		buckets [ l ] = new ArrayList();
	    for(int j =0;j<randstuff.length;j++){
		int k = (int) (randstuff[j]/(Math.pow(10,i))) % 10;
		buckets[k].add(randstuff[j]);
	    }
	    System.out.println(Arrays.toString(buckets));
	    System.out.println("THIS IS THE NEXT DIGIT");
	    
	}
	long time = System.currentTimeMillis() - start;
	System.out.println ( time );

	start = System.currentTimeMillis();
	Arrays.sort ( randstuff );
	time = System.currentTimeMillis() - start;
	System.out.println ( time );
	
    }
}
