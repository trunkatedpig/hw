import java.io.*;
import java.util.*;

public class myList {
    public static void main ( String[] args ) {
	Random r = new Random();
	for ( int i = 0 ; i < 10 ; i++ )
	    buckets [ i ] = new ArrayList();
	int[] randstuff=new int[20];
	for (int i = 0;i<randstuff.length;i++)
	    randstuff[i]=r.nextInt(9999-1000)+1000;
	int digits = 4;
	for(int i = 0;i<digits;i++){
	    ArrayList[] buckets = new ArrayList [ 10 ];
	    for(int j =0;j<randstuff.length;j++){
		int k = (int) (randstuff[j]/(Math.pow(10,i))) % 10;
		buckets[k].add(randstuff[j]);
	    }
	    System.out.println(Arrays.toString(buckets));
	    System.out.println("THIS IS THE END");
	    
	}
	System.out.println(Math.pow(10,3));
    }
}