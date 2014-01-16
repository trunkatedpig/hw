import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Sorts sort = new Sorts(100000);

	//       System.out.println(sort);

	long start = System.currentTimeMillis();
	
	sort.sSort(sort.getNums());
	
	long end = System.currentTimeMillis();

      	System.out.println("Selection Sort time: " + (end - start));

	//	System.out.println(sort);
	
	start = System.currentTimeMillis();

	sort.bSort(sort.getNums());

	end = System.currentTimeMillis();
	
	System.out.println("Bubble Sort time: " + (end - start)); 
	

       	start = System.currentTimeMillis();

	sort.rSort(sort.getNums());

	end = System.currentTimeMillis();
	
	System.out.println("Radix Sort time: " + (end - start)); 

    }
}
