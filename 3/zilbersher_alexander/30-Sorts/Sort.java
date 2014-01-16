import java.io.*;
import java.util.*;

public class Sort {

    public double[] bubble(double[] d) {
	long start = System.currentTimeMillis();
        int comparisons = 0;
        int swaps = 0;
	int lastswaps = 0;
        int times = d.length-1;
        double temp = 0.0;
        double[] output = d;
        for (int i=0;i<d.length;i++) {
            for(int j=0;j<times;j++){
                if (output[j] > output[j+1]){
                    temp = output[j];
                    output[j] = output[j+1];
                    output[j+1] = temp;
                    swaps++;
                }
                comparisons++;
            }
            times--;
	    if (swaps == lastswaps) {
		break;
	    } else {
		lastswaps = swaps;
	    }
        }
	long end = System.currentTimeMillis();
        System.out.println("Swaps: "+swaps +"\nComparisons " + comparisons + "\nTime: " +  (end-start));
	return output;
    }
    
    public double[] Selection(double[] d) {
	long start = System.currentTimeMillis();
	int comparisons = 0;
        int swaps = 0;
	int highest = 0;
	double temp = 0;
	double[] output = d;
	for (int j=0;j<d.length;j++){
	    for (int i=0;i<d.length-j;i++){
		comparisons++;
		if (output[i] > output[highest]) {
		    highest = i;
		}
	    }
	    temp = output[d.length-(j+1)] ;
	    output[d.length-(j+1)] = output[highest];
	    output[highest] = temp;
	    highest = 0;
	    swaps++;
	}
	long end = System.currentTimeMillis();
        System.out.println("Swaps: "+swaps +"\nComparisons " + comparisons + "\nTime: " +  (end-start));
	return output;
    }

    public double[] Insertion(double[] d) {
	long start = System.currentTimeMillis();
        int comparisons = 0;
        int swaps = 0;
        int times = d.length-1;
        double temp = 0.0;
        double[] output = d;
        for (int i=0;i<d.length;i++) {
	    for (int j=i;j>0;j--) {
		comparisons++;
		if (output[j]<output[j-1]) {
		    temp = output[j];
		    output[j] = output[j+1];
		    output[j+1] = temp;
		    swaps++;
		}
	    }
        }
	long end = System.currentTimeMillis();
        System.out.println("Swaps: "+swaps +"\nComparisons " + comparisons + "\nTime: " +  (end-start));
	return output;
    }

    
    public void ArrayToString(double[] a) {
	String output = " ";
	for (int i=0;i<a.length;i++) {
	    output += (a[i]) + ", ";
	}
	System.out.println(output);
    }
}
