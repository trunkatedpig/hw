import java.util.*;
import java.io.*;

public class BubbleSort{
    public void bsort(int[] a){
        int swaps = 0;
        int comparisons = 0;
        for (int n = 0; n<a.length; n++){
            for (int i = 0; i<a.length-1; i++){
                comparisons+=1;
                if (a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    swaps+=1;
                }
            }
	}
    }

    public String toString(int[] a){
        String r = "";
        for (int x=0; x<a.length; x++){
            r = r + a[x] + ", ";
        }
        return r;
    }
}
