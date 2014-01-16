import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
       
	Sorts sorts  = new Sorts();

        double[] test = new double[10];
        double[] test2 = new double[10];
	double[] test3 = new double[10];
	double[] test4 = new double[10];

	for (int i=0;i<10;i++){
	    test[i]=Math.random()*1000;
	    test2[i]=Math.random()*1000;
	    test3[i]=Math.random()*1000;
	    test4[i]=Math.random()*1000;
	}

	System.out.println(" ");


	double[] ans = new double[10];

	System.out.println("Test: ");
	long start = System.currentTimeMillis();
	ans = sorts.sort(test);
	long end = System.currentTimeMillis();

	System.out.println("Sort Time elapsed: "+(end - start) + " milliseconds");

	
	double[] ans2 =new double[10];

	System.out.println("Test2: ");
	start = System.currentTimeMillis();
	ans2 = sorts.bsort(test2);
        end = System.currentTimeMillis();
	System.out.println("Bsort Time elapsed: "+(end - start) + " milliseconds");


	double[] ans3 =new double[10];

	System.out.println("Test3: ");
	start = System.currentTimeMillis();
	ans2 = sorts.bsort(test3);
        end = System.currentTimeMillis();
	System.out.println("Ssort Time elapsed: "+(end - start) + " milliseconds");


	double[] ans4 =new double[10];

	System.out.println("Test4: ");
	start = System.currentTimeMillis();
	ans2 = sorts.bsort(test4);
        end = System.currentTimeMillis();
	System.out.println("Isort Time elapsed: "+(end - start) + " milliseconds");

    }
}                
       
