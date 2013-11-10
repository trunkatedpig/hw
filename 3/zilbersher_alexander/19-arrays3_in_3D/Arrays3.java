import java.io.*;
import java.util.*;

public class Arrays3 {

    public double mean(double[] n) {
	double output = 0.0;
	for (int i = 0;i<n.length;i++) {
	    output = output + n[i];
	}
	output = output/n.length;
	return output;
    }

    public double stddev(double[] n) {
	double[] list1 = new double[n.length];
	double output = 0.0;
	for (int i = 0;i<n.length;i++) {
	    list1[i] = Math.pow((n[i] - mean(n)),2);
	}
	output = Math.sqrt(mean(list1));
	return output;
    }
}