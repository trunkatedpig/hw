import java.io.*;
import java.util.*;
//worked with victor

public class Driver{
    public static void main (String args[]){
	long start, end;

	RadixSort a = new RadixSort(10,4);
	System.out.println(a);
	a.bsort(a);
	System.out.println(a);

    }
}
