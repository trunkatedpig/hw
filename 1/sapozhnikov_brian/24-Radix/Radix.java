import java.io.*;
import java.util.*;

public class Radix{
    public int[] sort(int[] A){
        ArrayList[] buckets = new ArrayList[10];
        int n = 0;
        while (n<4){
	    for(int i =0;i<10;i++)
                buckets[i] = new ArrayList();
	    for (int j=0;j<A.length;j++){
                buckets[(A[j] / (int)Math.pow(10,n)) % 10].add(A[j]);
	    }
	    int counter = 0;
	    for(int p = 0; p<buckets.length; p++){
                for(int m = 0; m<buckets[p].size(); m = m){
		    A[counter] = (Integer)(buckets[p].remove(0));
		    counter = counter + 1;
                }
	    }
	    n = n + 1;
        }
        return A;
    }

     // public String toString(int[] A){
     // 	String Ans = "{";
     // 	for (int i = 0; i < A.length; i++)
     // 	    Ans = Ans + A[i] + ", ";
     // 	Ans = Ans + "}";
     // 	return Ans;
     // }
	    
}
