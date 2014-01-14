import java.io.*;
import java.util.*;

public class RadixDriver{
    //worked with Brian and Emile
    public static void main(String[] args){
        int[] A = new int[1000000];
        int[] B = new int[1000000];
        Random r = new Random();
        for (int i = 0; i < A.length; i ++){
            A[i] = r.nextInt(10000000);
            B[i] = r.nextInt(10000000);
        }

        Radix R = new Radix();

        long start = System.currentTimeMillis();
                
        //A = R.sort(A);
	A = R.bubble(A);

        long t = System.currentTimeMillis();
        //System.out.println("Radix sort: " + (t - start));
	System.out.println("Bubble Sort: " + (t - start));
        
        // System.out.println(Arrays.toString(A));
        
        // System.out.println(R.toString(R.sort(A)));

        start = System.currentTimeMillis();
        
        //Arrays.sort(B);

        t = System.currentTimeMillis();
        //System.out.println("Built-in sort: " + (t - start));
        // System.out.println(Arrays.toString(B));

    }
}
