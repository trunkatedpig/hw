import java.io.*;
import java.util.*;

public class Arrays{
    public int RevFill(int n){
	int[] a= new int[n];
	int i;
	for (i=0;i<n;i++){
	    a[i]=n-i; 
	}
	return a;
    }
    
}
