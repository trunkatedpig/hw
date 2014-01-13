1;2cimport java.io.*;
import java.util.*;

public class BubbleSort{
    
    public int[] bsort(int[] a){
	int[] result = a;
	for (int i = 0; i < result.length-1; i++){
	    if (result[i] > result[i+1]){
		int b = result[i];
		int c = result[i+1];
		result[i] = c;
		result[i+1] = b;
	    }
	}
	return result;
    }

    public String toString(int[] a){
	String result = "";
	for (int i = 0; i < a.length; i ++){
	    result = result + a[i] + ", ";
	}
	return result;
    }

}
