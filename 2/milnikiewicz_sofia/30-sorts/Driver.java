import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

        System.out.println("Bubble Sort: ");

	Sorts s = new Sorts();
	System.out.println("Array length 10: ");
	int[] a = {5,3,67,2,11,787,3,6,1,13};
	System.out.println(s.toString(a));
	s.bSort(a);
	System.out.println(s.toString(a));
        System.out.println("Array length 100: ");
	int[] a2 = {5,3,67,2,11,787,3,6,1,13,5,3,67,2,11,787,3,6,1,13,5,3,67,2,11,787,3,6,1,13,5,3,67,2,11,787,3,6,1,13,5,3,67,2,11,787,3,6,1,13,5,3,67,2,11,787,3,6,1,13,5,3,67,2,11,787,3,6,1,13,5,3,67,2,11,787,3,6,1,13,5,3,67,2,11,787,3,6,1,13};
	System.out.println(s.toString(a2));
	s.bSort(a2);
	System.out.println(s.toString(a2));      
	
	

	// PART TWO

	long time1,time2;

	System.out.println(Arrays.toString(a));
	time1 = System.currentTimeMillis();
	Arrays.sort(a);
	time2 = System.currentTimeMillis();
	System.out.println(time2-time1);
	System.out.println(Arrays.toString(a));

	System.out.println("-------------------------------");

	int[] b = {5,3,67,2,11,787,3,6,1};
	s.setArray(b);
	time1 = System.currentTimeMillis();
        s.radixSort();
	time2 = System.currentTimeMillis();
	System.out.println(time2-time1);
	System.out.println(Arrays.toString(b));
	
    }
}
