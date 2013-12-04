import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	Arrays_two one = new Arrays_two();
	int[] A = one.RevFill(10);
	int[] B = one.MakeRandom(6, 2, 10);
	for (int i=0; i<A.length; i++){
	    System.out.println(A[i]);
	}
	System.out.println("---");
	for (int i=0; i<B.length; i++){
	    System.out.println(B[i]);
	}
    }
}

// not sure why this doesnt run correctly.
