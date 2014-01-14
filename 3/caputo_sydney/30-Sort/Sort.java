import java.util.*;
import java.io.*;


public class Sort {
    public void bsort(int[] a){
	int compare=0;
	int swaps=0;
	int k=0;
	while ( k< a.length){    
	for (int i=0; i<a.length-1; i++){
		compare++;
		if (a[i]>a[i+1]) {
		    int b=a[i];
		    int c= a[i+1];
		    a[i]=c;
		    a[i+1]=b;
		    swaps++;
		}
	   }
	k++;}

    }
	   


    public String toString(int[] a){
	String r = "";
	for (int x=0; x<a.length; x++){
	    r = r + a[x] + ", ";
	}
	return r;
    }



}
