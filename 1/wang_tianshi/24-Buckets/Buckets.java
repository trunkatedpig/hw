import java.io.*;
import java.util.*;

public class Buckets { 
    
    private ArrayList[] buckets = new ArrayList[1000000];
    private int[]Test = new int[1000000];
    
    public Buckets() {
        for (int i = 0; i < 1000000; i++) 
            buckets[i] = new ArrayList();
        for (int i = 0; i < 1000000; i++)
            Test[i] = (int) (Math.random() * Math.pow(10,20));
    }
    
    public void sort() {
        int n = 0;
        while (n < 20) {
            for (int i = 0; i < Test.length; i++) {
                //System.out.print(Test[i] + " (mod " + Math.pow(10,n)+")");
                int placeholder = (int) ((Test[i]/Math.pow(10,n)) % 10);
		//System.out.println(" --> " + placeholder);
                buckets[placeholder].add(Test[i]); 
            }
            int[] tempArray = new int[Test.length];
            int x = 0;
            for (int j = 0; j< buckets.length; j++){
                //System.out.println(j+ ":"+buckets[j].size());
                for(int k = 0; k < buckets[j].size(); k++) {
                    tempArray[x] = (Integer)buckets[j].get(k);
                    x = x + 1;
                    }
            }
            Test = tempArray;
            //System.out.println(Arrays.toString(Test));
            for (int i = 0; i < 10; i++) 
                buckets[i] = new ArrayList();
            n = n + 1;
        }
    }

    public String toString() {
        return Arrays.toString(Test);
    }
}
