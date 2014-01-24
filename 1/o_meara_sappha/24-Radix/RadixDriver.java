import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
        int[] A = new int[1000000];
        int[] B = new int[1000000];
	int[] C = new int[1000000];
	int[] D = new int[1000000];
        Random r = new Random();
        for (int i = 0; i < A.length; i ++){
            A[i] = r.nextInt(10000000);
            B[i] = r.nextInt(10000000);
	    C[i] = r.nextInt(10000000);
	    D[i] = r.nextInt(10000000);
        }

        Radix R = new Radix();

        long start = System.currentTimeMillis();
        A = R.sort(A);
        long t = System.currentTimeMillis();
        System.out.println("Radix sort: " + (t - start));

        start = System.currentTimeMillis();
        B = R.bubble(B);
        t = System.currentTimeMillis();
        System.out.println("Bubble sort: " + (t - start));

	start = System.currentTimeMillis();
        C = R.selection(C);
        t = System.currentTimeMillis();
        System.out.println("Selection sort: " + (t - start));
	
	start = System.currentTimeMillis();
        D = R.insertion(D);
        t = System.currentTimeMillis();
        System.out.println("Insertion sort: " + (t - start));
	
    }
}
