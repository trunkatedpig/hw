import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	RadixSort bs = new RadixSort(20);
	long start = System.currentTimeMillis();
	

	//long end = System.currentTimeMillis();

	//	System.out.println("Radix time: " + (end - start));

	//	start = System.currentTimeMillis();

	//	end = System.currentTimeMillis();
	
	//	System.out.println("Built-in time: " + (end - start)); 

	System.out.println(bs);
	bs.bubbleSort();
	System.out.println(bs);
    }
}
