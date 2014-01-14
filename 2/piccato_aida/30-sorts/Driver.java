import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	Sorts sort = new Sorts(100000);
	//	System.out.println(bs);
	long start = System.currentTimeMillis();
	
	sort.bsort(sort.getNums());
	
	long end = System.currentTimeMillis();

      	System.out.println("BubbleSort time: " + (end - start));
	//System.out.println(bs);

	
	start = System.currentTimeMillis();

	sort.rsort();

	end = System.currentTimeMillis();
	
	System.out.println("Radix time: " + (end - start)); 
	
    }
}
