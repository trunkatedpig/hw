import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	RadixSort bs = new RadixSort(100000);
	//	System.out.println(bs);
	long start = System.currentTimeMillis();
	
	bs.bubbleSort();
	
	long end = System.currentTimeMillis();

      	System.out.println("BubbleSort time: " + (end - start));
	//System.out.println(bs);

	
	start = System.currentTimeMillis();

	bs.RadixSort();

	end = System.currentTimeMillis();
	
	System.out.println("Radix time: " + (end - start)); 
	
    }
}
