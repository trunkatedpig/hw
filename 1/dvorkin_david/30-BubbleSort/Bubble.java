import java.io.*;
import java.util.*;

public class Bubble{
    private int swaps;
    private int comparisons;

    /* public int[] radixsort(){
        for (int n=0;n<numDigit;n++){
            for (int i=0;i<intList.length;i++){
                int digit = 0;
                digit = (intList[i]/(int)Math.pow(10,n))%10;
                buckets[digit].add(intList[i]);
                
            }
            int intCounter = 0;
            for (int i=0;i<buckets.length;i++){
                for (int j=0;j<buckets[i].size();j++){
                    intList[intCounter] = (Integer)buckets[i].get(j);
                    intCounter++;
                }
            }
            
            for (int i=0;i<10;i++){
                buckets[i] = new ArrayList();
            }
        }
        return intList;
    }
    */
    public void bsort(int[] a){
	for(int i = 0; i < a.length; i++) {
	    for(int j = 0; j < a.length-1; j++) {
		if (a[j+1] < a[j]) {
		    int holder = 0;
		    holder = a[j];
		    a[j] = a[j+1];
		    a[j+1] = holder;
		    swaps = swaps + 1;
		}
		    comparisons = comparisons + 1;
	    }
	}
	System.out.println("");
	for (int i = 0; i < a.length; i++){
	    System.out.print(a[i] + " ");
	}
	System.out.println("comp="+comparisons);
	System.out.println(swaps);
    }

    public void insertion(int[] a){
	int insertion;
	int x;  
	for (int i = 0; i <= a.length - 1; i++){
	    insertion = a[i];
	    for(x = i - 1; (x >= 0) && (a[x] < insertion); x--){
		a[x+1] = a[x];
	    }
	    a[x+1]=insertion;
	}
	//Done in ascending order; easier to push numbers to the right.
    }
     public void selection(int[] a){
	 int temp;
	 int holder;
	 int[] fix = new int[a.length];
	 for (int i = a.length - 1; i > 0; i-- ){
	     temp = 0;
	     for(int j = 1; j <= i; j ++)
		 {
		     if( a[j] < a[temp])         
			 temp = j;
		 }
	     holder = a[temp];
	     a[temp] = a[i];
	     a[i] = holder;
	 }           
	 //Decided it is easier in descending order
     }
}
