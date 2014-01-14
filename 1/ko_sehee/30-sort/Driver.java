import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Buckets b = new Buckets();
	Long beg = System.currentTimeMillis();
	b.radixSort();
	System.out.println("time sorting with radix sort: ");
	System.out.println(System.currentTimeMillis()-beg);
	b.bubbleSort();
	beg = System.currentTimeMillis();
	System.out.println("using bubble sort:");
	System.out.println(System.currentTimeMillis()- beg);

	

	
    }
}
