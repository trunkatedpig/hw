import java.io.*;
import java.util.*;

public class ArrayStuff{
    public double mean(int[] n){
	int sum=0;
	for (int q=0; q< n.length; q++) {
	    sum = sum + n[q];
	}
	double fin = (double) sum;
	return fin/n.length;
    }


}

