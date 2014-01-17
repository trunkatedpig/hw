import java.io.*;
import java.util.*;

public class Sort {
    public static void main ( String[] args ) {
	//Radix
	Random r = new Random();
	ArrayList[] buckets = new ArrayList [ 10 ];
	int[] randstuff=new int [ 1000 ];
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

	//Built-in
	start = System.currentTimeMillis();
	Arrays.sort ( randstuff );
	time = System.currentTimeMillis() - start;
	System.out.println ( "Built in: " + time );
	
	//Bubble
	r = new Random();
	buckets = new ArrayList [ 10 ];
	randstuff=new int [ 1000 ];
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

	//Selection
	r = new Random();
	randstuff=new int [ 1000 ];
	for (int i = 0;i<randstuff.length;i++)
	    randstuff[i]=r.nextInt(899999999)+100000000;
	//System.out.println ( Arrays.toString ( randstuff ) );
	start = System.currentTimeMillis();
	numComparisons = 0;
	numSwaps = 0;
	for ( int i = 0 ; i < randstuff.length - 1 ; i++ ) {
	    int min = randstuff [ i ];
	    int mindex = i;
	    for ( int j = i + 1 ; j < randstuff.length ; j++ ) {
		if ( randstuff [ j ] < min ) {
		    min = randstuff [ j ];
		    mindex = j;
		}
		numComparisons = numComparisons + 1;
	    }
	    randstuff [ mindex ] = randstuff [ i ];
	    randstuff [ i ] = min;
	    numSwaps = numSwaps + 1;
	}
	time = System.currentTimeMillis() - start;
	//System.out.println ( Arrays.toString ( randstuff ) );
	System.out.println ( "Selection: " + time );
	System.out.println ( "numComparisons: " + numComparisons );
	System.out.println ( "numSwaps: " + numSwaps );

	//Insertion
	r = new Random();
	randstuff=new int [ 1000 ];
	for (int i = 0;i<randstuff.length;i++)
	    randstuff[i]=r.nextInt(899999999)+100000000;
	//System.out.println ( Arrays.toString ( randstuff ) );
	start = System.currentTimeMillis();
	numComparisons = 0;
	numSwaps = 0;
	for ( int i = 1 ; i < randstuff.length ; i++ ) {
	    //int min = randstuff [ i - 1 ];
	    int j = i;
	    // if ( randstuff [ j ] >= min )
	    // 	System.out.println ( "randstuff [ j ]: " + randstuff [ j ] + "\nmin: " + min );
	    while ( j > 0 && randstuff [ j ] < randstuff [ j - 1 ] ) {
		numComparisons = numComparisons + 1;
		int a  = randstuff [ j ];
		randstuff [ j ] = randstuff [ j - 1 ];
		randstuff [ j - 1 ] = a;
		numSwaps = numSwaps + 1;
		// if ( i <= 10 )
		//     System.out.println ( "a: " + a + "\nj: " + j + "\nrandstuff [ j ]: " + randstuff [ j ] + "\nrandstuff [ j - 1 ]: " + randstuff [ j - 1 ] );
		j = j - 1;
		//		if ( j > 190 )
		// System.out.println ( Arrays.toString ( randstuff ) );
	    }
	    //	    System.out.println ( Arrays.toString ( randstuff ) );
	}
	//System.out.println ( Arrays.toString ( randstuff ) );
	time = System.currentTimeMillis() - start;
	System.out.println ( "Insertion: " + time );
	System.out.println ( "numComparisons: " + numComparisons );
	System.out.println ( "numSwaps: " + numSwaps );
    }
}
