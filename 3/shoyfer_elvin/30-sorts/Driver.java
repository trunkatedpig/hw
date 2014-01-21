import java.io.*;
import java.util.*;


public class Driver { 
    public static void main(String[] args) {

    	Sorts s = new Sorts();
    	Random r = new Random();

    	// ** Bubblesort Tests ** 


    	System.out.println("Bubblesort tests. \n");
    	// Sorted Array test 

    	int[] sortedArray = {1, 2, 3, 4, 5};
    	System.out.println("Sorting " + Arrays.toString(sortedArray) + "\n"); 

    	long startTime1 = System.nanoTime();

    	int[] t1result = s.bsort(sortedArray); 

    	long timeElapsed1 = System.nanoTime() - startTime1;

    	System.out.println("Result: " + Arrays.toString(t1result) + "\n");

    	System.out.println("Time taken: " + timeElapsed1);

    	// Random array test: Length 100

    	System.out.println("Generating random array. Length 100. Values 0<=i<=99");

    	int[] randomArray100 = new int[100];

    	for(int i = 0; i < randomArray100.length; i++) {
    		int newInt = r.nextInt(100);
    		randomArray100[i] = newInt;
    	}

    	System.out.println("The random array is " + Arrays.toString(randomArray100) + "\n");
    	System.out.println("Sorting..." + "\n");

    	long startTime2 = System.nanoTime();

    	int[] t2result = s.bsort(randomArray100);

    	long timeElapsed2 = System.nanoTime() - startTime2;

    	System.out.println("Result: " + Arrays.toString(t2result) + "\n");
		System.out.println("Time taken: " + timeElapsed2); 

		// ** Insertion sort tests ** 

		System.out.println("Insertion sort tests.\n");

    	// Random array test: Length 100

    	System.out.println("Generating random array. Length 100. Values 0<=i<=99");

    	int[] randomArray100_2 = new int[100];

    	for(int i = 0; i < randomArray100_2.length; i++) {
    		int newInt = r.nextInt(100);
    		randomArray100_2[i] = newInt;
    	}

    	System.out.println("The random array is " + Arrays.toString(randomArray100_2) + "\n");
    	System.out.println("Sorting..." + "\n");

    	long startTime3 = System.nanoTime();

    	int[] t3result = s.bsort(randomArray100_2);

    	long timeElapsed3 = System.nanoTime() - startTime3;

    	System.out.println("Result: " + Arrays.toString(t3result) + "\n");
		System.out.println("Time taken: " + timeElapsed3); 

		// ** Selection sort tests **

		System.out.println("Selection sort tests.\n");

    	// Random array test: Length 100

    	System.out.println("Generating random array. Length 100. Values 0<=i<=99");

    	int[] randomArray100_3 = new int[100];

    	for(int i = 0; i < randomArray100_3.length; i++) {
    		int newInt = r.nextInt(100);
    		randomArray100_3[i] = newInt;
    	}

    	System.out.println("The random array is " + Arrays.toString(randomArray100_3) + "\n");
    	System.out.println("Sorting..." + "\n");

    	long startTime4 = System.nanoTime();

    	int[] t4result = s.bsort(randomArray100_3);

    	long timeElapsed4 = System.nanoTime() - startTime3;

    	System.out.println("Result: " + Arrays.toString(t4result) + "\n");
		System.out.println("Time taken: " + timeElapsed4); 









    }
}