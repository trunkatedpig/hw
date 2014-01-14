import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
       
	Sorts sorts  = new Sorts();
        double[] test = {101,230,405,928,717,838,124,657,309,489};


	long start = System.currentTimeMillis();
	double[] ans = new double[10];
	ans = sorts.bsort(test);
	long end = System.currentTimeMillis();

	System.out.println("Time elapsed: "+(end - start) + " milliseconds");

	for (double i : ans){
            System.out.print(i + " ");
        }
    }
}                
       
