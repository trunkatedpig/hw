import java.io.*;
import java.util.*;

public class BubbleSort{

    private int n, s, h;
    private int[] list;

    public int[] randomList(){
	Random r = new Random();
	list = new int[100];
	for(int i=0; i<100; i++){
	    list[i] = r.nextInt(999);
	}
	return list;
    }

    public int[] bsort(int[] a){
	
	n=0;
	s=0;
	h=0;

	for(int i=0; i<a.length; i++){
	    for(int j=0; j<a.length-1; j++){
		n = n+1;
		if(a[j+1] < a[j]){
		    h = a[j];
		    a[j] = a[j+1];
		    a[j+1] = h;
		    s = s+1;
		}
	    }
	}
	return list;
    }
	
    public int getComparisons(){
	return n;
    }

    public int getSwaps(){
	return s;
    }

}