import java.util.*;
import java.io.*;

public class Driver{

    public static void main (String[] args){

	Buckets b = new Buckets();
	System.out.println(b);
	b.sort();
	System.out.println(b);
	int[] a = {5,3,67,2,11,787,3,6,1};
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
    }

}
