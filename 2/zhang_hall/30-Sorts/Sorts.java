import java.io.*;
import java.util.*;

public class Sorts {
public int[] bsort(int[] a){
	int x;
	int c;
	int rs;
	int[] result;
	int[]result = a;
	for(int i = a.length() -1; i --; i > 0){
	    int s = 0;
	    for(int j = 0; j ++; j < a.length(){
		    if (result[j] > result[j +  1]){
			x = result[j];
			result[j] = result[j + 1];
			result[j + 1] = x;
			rs ++;
			s ++;
		    }
		    if (s == 0){
			i = 0;
		    }
		    c ++;
		    
		}
		    }
	}
    }