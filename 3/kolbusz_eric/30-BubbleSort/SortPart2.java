import java.io.*;
import java.util.*;

public class Sort {
    private ArrayList[] buckets;
    private int[] a;
    private int power, nums, comp, swap;

    public Sort(int p, int n) {
	power = p;
	nums = n;
	a = new int[n];
	buckets = new ArrayList[nums];
    }

    public void makeArray() {
	Random r = new Random();
	for(int i=0; i<nums; i++) {
	    a[i] = r.nextInt((int)(Math.pow(10,power)-1));
	}
	comp = 0;
	swap = 0;
    }

    public void radixSort(){
	for (int i=0; i<power; i++){
	    for (int j=0; j<nums; j++)
		buckets[j]=new ArrayList();
	    
	    for (int k=0; k<nums; k++){
		int n = a[k]/((int)(Math.pow(10,i)))%10;
		buckets[n].add(a[k]);
	    }
	    
	    int m=0;
	    for (int l=0; l<a.length; l++){
		for (int o=0; o<buckets[l].size(); o++){
		    a[m] =(Integer)(buckets[l].get(o));
		    m++;
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

    public void insertSort() {
	for (int i=1; i<nums; i++) {
	    int j = i;
	    while (j>0 && a[j] < a[j-1]) {
		int temp = a[j];
		a[j] = a[j-1];
		a[j-1] = temp;
		comp++;
		swap = swap + 3;
		j--;
	    }
	}
    }
    
    public void selectSort() {
	for (int i=0; i<nums; i++) {
	    int min = a[i];
	    int mini = 0;
	    for (int j=1; j<nums; j++) {
		comp++;
		if (a[j] < a[j-1]) {
		    min = a[j];
		    mini = j;
		}
	    }
	    int temp = min;
	    a[mini] = a[i];
	    a[i] = min;
	    swap++;
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

	System.out.println();

	System.out.println("Insertion Sort:");
	s1.makeArray();
	System.out.println("Array: " + Arrays.toString(s1.a));
	long starttime13 = System.currentTimeMillis();
	s1.insertSort();
	long endtime13 = System.currentTimeMillis();
	long elapsed13 = endtime13-starttime13;
	System.out.println("Sorted Array: " + Arrays.toString(s1.a));
	System.out.println("Insertion Sort took " + elapsed13);
	System.out.println("Comparisons: " + s1.comp + "; Swaps: " + s1.swap);

	System.out.println();

	System.out.println("Select Sort:");
	s1.makeArray();
	System.out.println("Array: " + Arrays.toString(s1.a));
	long starttime14 = System.currentTimeMillis();
	s1.bsort();
	long endtime14 = System.currentTimeMillis();
	long elapsed14 = endtime14-starttime14;
	System.out.println("Sorted Array: " + Arrays.toString(s1.a));
	System.out.println("Selection Sort took " + elapsed14);
	System.out.println("Comparisons: " + s1.comp + "; Swaps: " + s1.swap);



	System.out.println("-----------------------------");



	Sort s2 = new Sort(5,5000);
	System.out.println(s2.power + " digit ints in a " + s2.nums + " int long array");
	System.out.println("Radix Sort:");
	s2.makeArray();
	//System.out.println("Array: " + Arrays.toString(s2.a));
	long starttime21 = System.currentTimeMillis();
	s2.radixSort();
	long endtime21 = System.currentTimeMillis();
	long elapsed21 = endtime21-starttime21;
	//System.out.println("Sorted Array: " + Arrays.toString(s2.a));
	System.out.println("Radix Sort took " + elapsed21);

	System.out.println();

	System.out.println("Bubble Sort:");
	s2.makeArray();
	//System.out.println("Array: " + Arrays.toString(s2.a));
	long starttime22 = System.currentTimeMillis();
	s2.bsort();
	long endtime22 = System.currentTimeMillis();
	long elapsed22 = endtime22-starttime22;
	//System.out.println("Sorted Array: " + Arrays.toString(s2.a));
	System.out.println("Bubble Sort took " + elapsed22);
	System.out.println("Comparisons: " + s2.comp + "; Swaps: " + s2.swap);

	System.out.println();

	System.out.println("Insertion Sort:");
	s2.makeArray();
	//System.out.println("Array: " + Arrays.toString(s2.a));
	long starttime23 = System.currentTimeMillis();
	s2.insertSort();
	long endtime23 = System.currentTimeMillis();
	long elapsed23 = endtime23-starttime23;
	//System.out.println("Sorted Array: " + Arrays.toString(s2.a));
	System.out.println("Insertion Sort took " + elapsed23);
	System.out.println("Comparisons: " + s2.comp + "; Swaps: " + s2.swap);

	System.out.println();

	System.out.println("Select Sort:");
	s2.makeArray();
	//System.out.println("Array: " + Arrays.toString(s2.a));
	long starttime24 = System.currentTimeMillis();
	s2.bsort();
	long endtime24 = System.currentTimeMillis();
	long elapsed24 = endtime24-starttime24;
	//System.out.println("Sorted Array: " + Arrays.toString(s2.a));
	System.out.println("Selection Sort took " + elapsed24);
	System.out.println("Comparisons: " + s2.comp + "; Swaps: " + s2.swap);



	System.out.println("-----------------------------");



	Sort s3 = new Sort(5000,50000);
	System.out.println(s3.power + " digit ints in a " + s3.nums + " int long array");
	System.out.println("Radix Sort:");
	s3.makeArray();
	//System.out.println("Array: " + Arrays.toString(s3.a));
	long starttime31 = System.currentTimeMillis();
	s3.radixSort();
	long endtime31 = System.currentTimeMillis();
	long elapsed31 = endtime31-starttime31;
	//System.out.println("Sorted Array: " + Arrays.toString(s3.a));
	System.out.println("Radix Sort took " + elapsed31);

	System.out.println();

	System.out.println("Bubble Sort:");
	s3.makeArray();
	//System.out.println("Array: " + Arrays.toString(s3.a));
	long starttime32 = System.currentTimeMillis();
	s3.bsort();
	long endtime32 = System.currentTimeMillis();
	long elapsed32 = endtime32-starttime32;
	//System.out.println("Sorted Array: " + Arrays.toString(s3.a));
	System.out.println("Bubble Sort took " + elapsed32);
	System.out.println("Comparisons: " + s3.comp + "; Swaps: " + s3.swap);

	System.out.println();

	System.out.println("Insertion Sort:");
	s3.makeArray();
	//System.out.println("Array: " + Arrays.toString(s3.a));
	long starttime33 = System.currentTimeMillis();
	s3.insertSort();
	long endtime33 = System.currentTimeMillis();
	long elapsed33 = endtime33-starttime33;
	//System.out.println("Sorted Array: " + Arrays.toString(s3.a));
	System.out.println("Insertion Sort took " + elapsed33);
	System.out.println("Comparisons: " + s3.comp + "; Swaps: " + s3.swap);

	System.out.println();

	System.out.println("Select Sort:");
	s3.makeArray();
	//System.out.println("Array: " + Arrays.toString(s3.a));
	long starttime34 = System.currentTimeMillis();
	s3.bsort();
	long endtime34 = System.currentTimeMillis();
	long elapsed34 = endtime34-starttime34;
	//System.out.println("Sorted Array: " + Arrays.toString(s3.a));
	System.out.println("Selection Sort took " + elapsed34);
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

	System.out.println();

	System.out.println("Insertion Sort:");
	s4.makeArray();
	//System.out.println("Array: " + Arrays.toString(s4.a));
	long starttime43 = System.currentTimeMillis();
	s4.insertSort();
	long endtime43 = System.currentTimeMillis();
	long elapsed43 = endtime43-starttime43;
	//System.out.println("Sorted Array: " + Arrays.toString(s4.a));
	System.out.println("Insertion Sort took " + elapsed43);
	System.out.println("Comparisons: " + s4.comp + "; Swaps: " + s4.swap);

	System.out.println();

	System.out.println("Select Sort:");
	s4.makeArray();
	//System.out.println("Array: " + Arrays.toString(s4.a));
	long starttime44 = System.currentTimeMillis();
	s4.bsort();
	long endtime44 = System.currentTimeMillis();
	long elapsed44 = endtime44-starttime44;
	//System.out.println("Sorted Array: " + Arrays.toString(s4.a));
	System.out.println("Selection Sort took " + elapsed44);
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

	System.out.println();

	System.out.println("Insertion Sort:");
	s5.makeArray();
	System.out.println("Array: " + Arrays.toString(s5.a));
	long starttime53 = System.currentTimeMillis();
	s5.insertSort();
	long endtime53 = System.currentTimeMillis();
	long elapsed53 = endtime53-starttime53;
	System.out.println("Sorted Array: " + Arrays.toString(s5.a));
	System.out.println("Insertion Sort took " + elapsed53);
	System.out.println("Comparisons: " + s5.comp + "; Swaps: " + s5.swap);

	System.out.println();

	System.out.println("Select Sort:");
	s5.makeArray();
	System.out.println("Array: " + Arrays.toString(s5.a));
	long starttime54 = System.currentTimeMillis();
	s5.bsort();
	long endtime54 = System.currentTimeMillis();
	long elapsed54 = endtime54-starttime54;
	System.out.println("Sorted Array: " + Arrays.toString(s5.a));
	System.out.println("Selection Sort took " + elapsed54);
	System.out.println("Comparisons: " + s5.comp + "; Swaps: " + s5.swap);
    }
}
