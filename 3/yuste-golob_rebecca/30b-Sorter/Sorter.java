import java.io.*;
import java.util.*;

public class Sorter{

    public void ssort(int[] a){
	for (int i = 0; i<a.length; i++){
	    int smallest = i;
	    for (int j = i+1; j < i; j ++){
		if( a[j] < a[smallest]){
		    smallest = j;
		}
	    }
	    int temp = a[smallest];
	    a[smallest] = a[i];
	    a[i] = temp;
	}
    }

    public void isort(int[] a){
	for (int i = 0; i < a.length; i++){
	    int temp = a[i];
	    for (int j = i-1; j >= 0 && temp< a[j]; j--){
		a[j+1] = a[j];
	    }
	    a[j+1] = temp;
	}
    }

}
/*Sorry this doesn't work, I couldn't figure out what was wrong. It kept giving me an "incompatable types" error, even though everything was an int */ 
