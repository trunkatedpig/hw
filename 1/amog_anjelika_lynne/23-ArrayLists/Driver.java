import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> A = ArrayList<Integer>();
	/*for (int i = 1; i < 10000001; i++){
	    A.add(4*i);
	}
	long start = System.currentTimeMillis();
	A.remove(0);
	long t = System.currentTimeMillis() - start;
	System.out.println(t);
	//end - remove and add - nothing ms
	//start - remove and add - 22/23 ms
	*/
	
	for (int i = 1; i < 11; i++){
	    A.add(i);
	}

	for (int i = 0; i < A.size()/2; i++){
	    int front = A[i];
	    int back = A[A.size() - i];
	    A.set(i, front);
	    A.set(A.size() - i, back);
	}
       
    }
}
