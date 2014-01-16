import java.io.*;
import java.util.*;

public class Bubble{
    public void bsort(int[] n){
	int t=0;
	for(int i=0; i<n.length; i++){
	    if (n[i+1]<n[i]){
		t= n[i];
		n[i]= n[i+1];
		n[i+1]= t;
	    }
	}	System.out.println(Arrays.toString(n));
    }
    public static void main(String[] args){
	
	Bubble b = new Bubble();

	System.out.println(Arrays.toString(b.bsort(10, 3, 6)));
}
}
	