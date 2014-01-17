import java.io.*;
import java.util.*;

public class sort {
    public static void main ( String[] args ) {
	Random r = new Random();
	ArrayList[] buckets = new ArrayList [ 10 ];
	int[] randstuff=new int[200];
	for (int i = 0;i<randstuff.length;i++)
	    randstuff[i]=r.nextInt(899999999)+100000000;
	int digits = 9;
	long start = System.currentTimeMillis();
	for(int i = 0;i<digits;i++){
	    for ( int l = 0 ; l < 10 ; l++ )
		buckets [ l ] = new ArrayList();
	    for(int j =0;j<randstuff.length;j++){
		int k = (int) (randstuff[j]/(Math.pow(10,i))) % 10;
		buckets[k].add(randstuff[j]);
	    }
	    //System.out.println(Arrays.toString(buckets));
	    //System.out.println("THIS IS THE NEXT DIGIT");
	    
	}
	long time = System.currentTimeMillis() - start;
	System.out.println ( "Radix: " + time );

	start = System.currentTimeMillis();
	Arrays.sort ( randstuff );
	time = System.currentTimeMillis() - start;
	System.out.println ( "Built in: " + time );
	
	r = new Random();
	buckets = new ArrayList [ 10 ];
	randstuff=new int[200];
	for (int i = 0;i<randstuff.length;i++)
	    randstuff[i]=r.nextInt(899999999)+100000000;
	//System.out.println ( Arrays.toString ( randstuff ) );
	start = System.currentTimeMillis();
	//int stop = 0;
	int numComparisons = 0;
	int numSwaps = 0;
	for ( int i = 0 ; i < randstuff.length ; i++ ) {
	    for ( int j = 0 ; j < randstuff.length - 1 ; j++ ) {
		if ( randstuff [ j ] > randstuff [ j + 1 ] ) {
		    int a = randstuff [ j ];
		    randstuff [ j ] = randstuff [ j + 1 ];
		    randstuff [ j + 1 ] = a;
		    numSwaps = numSwaps + 1;
		    //stop = 1;
		}
		numComparisons = numComparisons + 1;
	    }
	    //if ( stop == 0 )
	    //break;
	}
	time = System.currentTimeMillis() - start;
	//System.out.println ( Arrays.toString ( randstuff ) );
	System.out.println ( "Bubble: " + time );
	System.out.println ( "numComparisons: " + numComparisons );
	System.out.println ( "numSwaps: " + numSwaps );
    }
}
