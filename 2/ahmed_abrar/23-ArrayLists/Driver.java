import java.util.*;
import java.io.*;

public class Driver {
    public static void main ( String[] args ) {
	ArrayList <Integer > a = new ArrayList <Integer> ();
	Random r = new Random();
	long start , t;

	for ( int i = 0 ; i < 10000000 ; i++ )
	    a.add ( r.nextInt( 50 ) );

	start = System.currentTimeMillis();
	a.add ( 0 , 5 );
	t = System.currentTimeMillis() - start;
	System.out.println ( "add to beginning: " + t );

	start = System.currentTimeMillis();
	a.add ( 5 );
	t = System.currentTimeMillis() - start;
	System.out.println ( "add to end: " + t );

	start = System.currentTimeMillis();
	a.remove ( 0 );
	t = System.currentTimeMillis() - start;
	System.out.println ( "remove from beginning: " + t );

	start = System.currentTimeMillis();
	a.remove ( a.size() - 1 );
	t = System.currentTimeMillis() - start;
	System.out.println ( "remove from end: " + t );

	ArrayList <Integer > b = new ArrayList <Integer> ();
	ArrayList <Integer> newList = new ArrayList <Integer> ();
	for ( int i = 0 ; i < 100 ; i++ )
	    b.add ( r.nextInt( 50 ) );

	for ( int i = b.size() - 1 ; i >= 0 ; i-- )
	    newList.add ( b.get ( i ) );
	System.out.println ( b + "\n" + newList );

	/*
	  Adding to the end and removing from the end is always 0.
	  Removing from the beginning and adding to the beginning is usually about 10, and are also the same a lot of the time (or very close).
	 */
    }
}
