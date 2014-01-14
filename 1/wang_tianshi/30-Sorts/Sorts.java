import java.io.*;
import java.util.*;

public class Sorts { 

    private ArrayList[] buckets = new ArrayList[10];
    private double[]Test = new double[10];

    
    public Sorts() {
        for (int i = 0; i < 10; i++) 
            buckets[i] = new ArrayList();
        for (int i = 0; i < 10; i++)
            Test[i] = Math.random() * 100;
    }
    
    public void sort() {
        int n = 0;
        while (n < 3) {
            for (int i = 0; i < Test.length; i++) {
                int placeholder = (int) ((Test[i]/Math.pow(10,n)) % 10);
                buckets[placeholder].add(Test[i]); 
            }
            double[] tempArray = new double[Test.length];
            int x = 0;
            for (int j = 0; j< buckets.length; j++){
                for(int k = 0; k < buckets[j].size(); k++) {
                    tempArray[x] = (Integer)buckets[j].get(k);
                    x = x + 1;
                    }
            }
            Test = tempArray;
            for (int i = 0; i < 10; i++) 
                buckets[i] = new ArrayList();
            n = n + 1;
        }
    }



    public String toString() {
        return Arrays.toString(Test);
    }


    public double[] bsort(double[] a) {
        int comparisons = 0;
        int swaps = 0;
        for (int n = 0; n<a.length; n++ ) {
            for (int x = 0; x < a.length -1 ; n++ ) {
                comparisons = comparisons + 1;
                if (a[x] > a[x+1]) {
                    swaps = swaps + 1;
                    double temp = a[x];
                    a[x] = a[x+1];
                    a[x+1] = temp;
                }
            }
        }
        //System.out.println(comparisons);
        //System.out.println(swaps);
	return a;
    }                
}
