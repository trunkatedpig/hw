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
    
    public void ArrayToString(double[] b) {
	String output = " ";
	for (int i=0;i<b.length;i++) {
	    output += (b[i]) + ", ";
	}
	System.out.println(output);
    }
}
