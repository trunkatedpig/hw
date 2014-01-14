import java.io.*;
import java.util.*;

public class Bubble{
    private int swaps;
    private int comparisons;

    public void  bubbleSort(double[] array) {
	for(int i = 0; i < array.length(); i++) {
	    for(int j = 0; j < array.length(); j++) {
		if (array[j+1]<array[j]) {
		    double holder = 0;
		    holder = array[j];
		    array[j] = array[j+1];
		    array[j+1] = holder;
		    swaps = swaps + 1;
		    comparisons = comparisons + 1;
		}
	    }
	}
    }

    public String toString() {
	return Arrays.toString();
    }

}