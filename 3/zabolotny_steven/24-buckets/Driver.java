import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	Buckets b = new Buckets();
	int[] a = new int[10];
	for (int i = 0;i < a.length;i++) {
	    int num = (int)(Math.random() * 10000) + 1000;
	    if (num > 10000) 
		num = num - 1000;
	    a[i] = num;
	}
	System.out.println("Array: " + Arrays.toString(a));
	System.out.println("Sorted Array: " + Arrays.toString(b.sort(a)));
    }
}
	