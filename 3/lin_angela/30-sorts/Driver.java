import java.util.*;
import java.io.*;

public class Driver {

    public static void main(String[] args){
	ArrayBuckets r = new ArrayBuckets(10);
	//	System.out.println(r.toString());
	//	r.radixSort();
	//	System.out.println(r.toString());
	int[] a = new int[1000000];
	for (int i = 0; i<a.length; i++){
	    Random ra = new Random();
	    int rand = ra.nextInt(1000);
	    a[i] = rand;
	}
	//	System.out.println(Arrays.toString(a));

	//	System.out.println(Arrays.toString(a));
	long start, t;
	//	start = System.currentTimeMillis();
	//	r.radixSort();
	//	t = System.currentTimeMillis() - start;
	//	System.out.println("RadixSorting time:" + t);

	//	start = System.currentTimeMillis();
	//	Arrays.sort(a);
	//	t = System.currentTimeMillis() - start;
	//	System.out.println("Array Sort Time:" + t);

	start = System.currentTimeMillis();
	r.bsort(a);
	t = System.currentTimeMillis() - start;
	System.out.println(t);
	int[] b = new int[1000];
	start = System.currentTimeMillis();
	r.bsort(b);
	t = System.currentTimeMillis() - start;
	System.out.println(t);





	    }





}
//num of elements, time (R), time(A)
//10 elements:: 1, 0
//10,000 elements (3 digits):: 14, 9
//100,000 elements (3 digits):: 51, 17
//1,000,000 elements (3 digits):: 582, 62

//10,000 elements (20 digits):: too large @_@


//BUBBLE SORT
//10 elements: 0
//10,000 elements:365
//100,000 elements:35393
//1,000,000 elements: too large @_@
