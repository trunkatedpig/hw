import java.io.*;
import java.util.*;

public class Sort {
    private ArrayList[] buckets = new ArrayList[10];
    private int[] a;
    private int power, nums, comp, swap;

    public Sort(int p, int n) {
	power = p;
	nums = n;
	a = new int[n];
    }

    public void makeArray() {
	Random r = new Random();
	for(int i=0; i<nums; i++) {
	    a[i] = r.nextInt((int)(Math.pow(10,power)-1));
	}
    }

    public void radixSort() {
        for(int i=0; i<power; i++) {
            for(int bucket = 0; bucket<10; bucket++){
                buckets[bucket] = new ArrayList();
            }
	    for(int j=0; j<10; j++) {
		int num = a[j];
                int n = num/((int)(Math.pow(10,i)))%10;
                buckets[n].add(num);
            }
            int k = 0;
            for(int l=0; l<10; l++) {
                for(int m=0; m<buckets[l].size(); m++) {
                    int o = (Integer)(buckets[l].get(m));
                    a[k] = o;
                    k++;
                }
            }
        }
    }

    public void bsort() {
	for (int i=0; i<nums; i++) {
	    for (int j=0; j<nums-1-i; j++) { //optimized from 0 to nums-1
		comp++;
		if (a[j] > a[j+1]) {
		    swap++;
		    int temp = a[j];
		    a[j] = a[j+1];
		    a[j+1] = temp;
		}
	    }
	}
    }

    public static void main(String args[]) {
	Sort s1 = new Sort(3,50);
	System.out.println(s1.power + " digit ints in a " + s1.nums + " int long array");
	System.out.println("Radix Sort:");
	s1.makeArray();
	System.out.println("Array: " + Arrays.toString(s1.a));
	long starttime11 = System.currentTimeMillis();
	s1.radixSort();
	long endtime11 = System.currentTimeMillis();
	long elapsed11 = endtime11-starttime11;
	System.out.println("Sorted Array: " + Arrays.toString(s1.a));
	System.out.println("Radix Sort took " + elapsed11);

	System.out.println();

	System.out.println("Bubble Sort:");
	s1.makeArray();
	System.out.println("Array: " + Arrays.toString(s1.a));
	long starttime12 = System.currentTimeMillis();
	s1.bsort();
	long endtime12 = System.currentTimeMillis();
	long elapsed12 = endtime12-starttime12;
	System.out.println("Sorted Array: " + Arrays.toString(s1.a));
	System.out.println("Bubble Sort took " + elapsed12);
	System.out.println("Comparisons: " + s1.comp + "; Swaps: " + s1.swap);



	System.out.println("-----------------------------");



	Sort s2 = new Sort(5,50);
	System.out.println(s2.power + " digit ints in a " + s2.nums + " int long array");
	System.out.println("Radix Sort:");
	s2.makeArray();
	System.out.println("Array: " + Arrays.toString(s2.a));
	long starttime21 = System.currentTimeMillis();
	s2.radixSort();
	long endtime21 = System.currentTimeMillis();
	long elapsed21 = endtime21-starttime21;
	System.out.println("Sorted Array: " + Arrays.toString(s2.a));
	System.out.println("Radix Sort took " + elapsed21);

	System.out.println();

	System.out.println("Bubble Sort:");
	s2.makeArray();
	System.out.println("Array: " + Arrays.toString(s2.a));
	long starttime22 = System.currentTimeMillis();
	s2.bsort();
	long endtime22 = System.currentTimeMillis();
	long elapsed22 = endtime22-starttime22;
	System.out.println("Sorted Array: " + Arrays.toString(s2.a));
	System.out.println("Bubble Sort took " + elapsed22);
	System.out.println("Comparisons: " + s2.comp + "; Swaps: " + s2.swap);



	System.out.println("-----------------------------");



	Sort s3 = new Sort(7,50);
	System.out.println(s3.power + " digit ints in a " + s3.nums + " int long array");
	System.out.println("Radix Sort:");
	s3.makeArray();
	System.out.println("Array: " + Arrays.toString(s3.a));
	long starttime31 = System.currentTimeMillis();
	s3.radixSort();
	long endtime31 = System.currentTimeMillis();
	long elapsed31 = endtime31-starttime31;
	System.out.println("Sorted Array: " + Arrays.toString(s3.a));
	System.out.println("Radix Sort took " + elapsed31);

	System.out.println();

	System.out.println("Bubble Sort:");
	s3.makeArray();
	System.out.println("Array: " + Arrays.toString(s3.a));
	long starttime32 = System.currentTimeMillis();
	s3.bsort();
	long endtime32 = System.currentTimeMillis();
	long elapsed32 = endtime32-starttime32;
	System.out.println("Sorted Array: " + Arrays.toString(s3.a));
	System.out.println("Bubble Sort took " + elapsed32);
	System.out.println("Comparisons: " + s3.comp + "; Swaps: " + s3.swap);



	System.out.println("-----------------------------");

	//bubble sort starts getting much slower than radix over here

	Sort s4 = new Sort(2000,1000000);
	System.out.println(s4.power + " digit ints in a " + s4.nums + " int long array");
	System.out.println("Radix Sort:");
	s4.makeArray();
	//System.out.println("Array: " + Arrays.toString(s4.a));
	long starttime41 = System.currentTimeMillis();
	s4.radixSort();
	long endtime41 = System.currentTimeMillis();
	long elapsed41 = endtime41-starttime41;
	//System.out.println("Sorted Array: " + Arrays.toString(s4.a));
	System.out.println("Radix Sort took " + elapsed41);

	System.out.println();

	System.out.println("Bubble Sort:");
	s4.makeArray();
	//System.out.println("Array: " + Arrays.toString(s4.a));
	long starttime42 = System.currentTimeMillis();
	s4.bsort();
	long endtime42 = System.currentTimeMillis();
	long elapsed42 = endtime42-starttime42;
	//System.out.println("Sorted Array: " + Arrays.toString(s4.a));
	System.out.println("Bubble Sort took " + elapsed42);
	System.out.println("Comparisons: " + s4.comp + "; Swaps: " + s4.swap);



	System.out.println("-----------------------------");



	Sort s5 = new Sort(500000,500000000);
	System.out.println(s5.power + " digit ints in a " + s5.nums + " int long array");
	System.out.println("Radix Sort:");
	s5.makeArray();
	//System.out.println("Array: " + Arrays.toString(s5.a));
	long starttime51 = System.currentTimeMillis();
	s5.radixSort();
	long endtime51 = System.currentTimeMillis();
	long elapsed51 = endtime51-starttime51;
	//System.out.println("Sorted Array: " + Arrays.toString(s5.a));
	System.out.println("Radix Sort took " + elapsed51);

	System.out.println();

	System.out.println("Bubble Sort:");
	s5.makeArray();
	//System.out.println("Array: " + Arrays.toString(s5.a));
	long starttime52 = System.currentTimeMillis();
	s5.bsort();
	long endtime52 = System.currentTimeMillis();
	long elapsed52 = endtime52-starttime52;
	//System.out.println("Sorted Array: " + Arrays.toString(s5.a));
	System.out.println("Bubble Sort took " + elapsed52);
	System.out.println("Comparisons: " + s5.comp + "; Swaps: " + s5.swap);
    }
}
