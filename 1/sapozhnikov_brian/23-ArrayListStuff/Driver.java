import java.io.*;
import java.util.*;


public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> A = new ArrayList<Integer>();
	long start = System.currentTimeMillis();
	
	for(int i=0; i<100000; i++)
	    //as length increases, adding to end is much faster than adding to the beginning
	    A.add(i); // ==> 4
	    //A.add(0,1); // ==> 1485

	start = System.currentTimeMillis();
	for(int j = 0; j<A.size(); j++){
	    //as length increases, removing from end is faster than from start
	    //A.remove(A.size()-1); // ==> 1
	    //A.remove(0); // ==>865
	}
	long t = System.currentTimeMillis() - start;
	//System.out.println(t);

	//reverse
	System.out.println(A.get(0));
	System.out.println(A.get(A.size()-1));

	ArrayList<Integer> tmp = new ArrayList<Integer>(A.size());
	for(int n = 0; n<A.size(); n++){
	    tmp.add(0,A.get(n));
	}
	A = tmp;

	System.out.println(A.get(0));
	System.out.println(A.get(A.size()-1));
	

    }
}
