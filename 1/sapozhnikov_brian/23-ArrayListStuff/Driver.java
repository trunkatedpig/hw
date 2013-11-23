import java.io.*;
import java.util.*;


public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> A = new ArrayList<Integer>();

	for(int i=0; i<10000000; i++)
	    A.add(i) // ==> 2100
	    // A.add(0,1);

	long start = System.currentTimeMillis();
	for(int j = 0; j<A.size(); j++){
	    A.remove(j);
	}
	long t = System.currentTimeMillis() - start;
	System.out.println(t);

    }
}