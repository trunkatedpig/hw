import java.io.*;
import java.util.*;

public class Driver{
    
    public static void main(String[] args) {
        Buckets j = new Buckets();
        System.out.println(j);
        j.sort();

        System.out.println();

	int[] a = {5,3,67,2,11,787,3,6,1};
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
    }
}
