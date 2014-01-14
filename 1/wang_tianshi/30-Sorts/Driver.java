import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){

        double[] test = new double[10];
        double[] test2 = new double[10];
        
	Random r = new Random();

        for (int i = 0; i<10; i++){
            test[i] = r.nextInt(10);
            test2[i] = r.nextInt(10);
        }

        Sorts sorts  = new Sorts();

	long start = System.currentTimeMillis();
	System.out.println(sorts.bsort(test));
	long end = System.currentTimeMillis();

	System.out.println("Time elapsed: "+(end - start) + " milliseconds");
    }
}                
       
